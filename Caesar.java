import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Caesar {

    static String word, search, b, a;
    static int shift, cutoff, y;
    static Scanner reader = new Scanner(System.in);
    static ArrayList<String> List1 = new ArrayList<String>(); // Have a word match within
    static ArrayList<String> List2 = new ArrayList<String>(); // Imported word list
    static ArrayList<String> List3 = new ArrayList<String>(); // Imported full word list
    static ArrayList<Integer> List4 = new ArrayList<Integer>(); // store space indexes
    
    static String output;
    static boolean Valid;
    // Auto Identifing Ceaser Cipher


    static void filescanner(String path) {
        
        try {
            File file = new File(path);
            Scanner myobj = new Scanner(file);
            while (myobj.hasNextLine()) {
                List2.add(myobj.nextLine());
            }
            myobj.close();
            
        } catch (Exception e) {
        }
        
    }


    static void listselect(int cutoff) {
 
        switch(cutoff) {
            case 2: filescanner("Words/allwords.txt"); break;
            case 3: filescanner("Words/allminus2letterwords.txt"); break;
            case 4: filescanner("Words/4letterwords.txt");
            case 5: filescanner("Words/5letterwords.txt");
            case 6: filescanner("Words/6letterwords.txt");
            case 7: filescanner("Words/7letterwords.txt");
            case 8: filescanner("Words/8letterwords.txt");
            case 9: filescanner("Words/9letterwords.txt");
            case 10: filescanner("Words/10letterwords.txt");    
            case 11: filescanner("Words/11letterwords.txt");
            case 12: filescanner("Words/12letterwords.txt");
            case 13: filescanner("Words/13letterwords.txt");
            case 14: filescanner("Words/14letterwords.txt");
            case 15: filescanner("Words/15letterwords.txt");
            case 16: filescanner("Words/16letterwords.txt");
            case 17: filescanner("Words/17letterwords.txt");
            case 18: filescanner("Words/18letterwords.txt");
            case 19: filescanner("Words/19letterwords.txt");
            case 20: filescanner("Words/20letterwords.txt"); break;
        }
    }


    static String CaesarCipher(int shift) {
        String ciphertext = ""; // Variable for altered text
        char alphabet; // Variable for temporary Holding
        for(int i=0; i < word.length();i++)  // Loop
        {
             // Shift one character at a time
            alphabet = word.charAt(i);

            // if alphabet lies between a and z
            if(alphabet >= 'a' && alphabet <= 'z')
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
        }
        return ciphertext;
    }


    static void Regex1(String text) {
        for (int x = 0; x < List2.size(); x++) {
            search = List2.get(x);
            Pattern pattern = Pattern.compile(search, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            boolean matchFound = matcher.find();
            
            if(matchFound) {
                    List1.add(text);
                    break;
            }
        }                    
    }

    static boolean complete = false;
    static void Identifing(String x) { 
        try {
            File file = new File("Compare.txt");
            Scanner myobj = new Scanner(file);
            while (myobj.hasNextLine()) {
                List3.add(myobj.nextLine());
            }
            myobj.close();
            System.out.println(List3);
        } catch (Exception e) {
        } 
        RecursiveSplit(x, 0);
        spacing(x);
    }


    static void RecursiveSplit(String x, int i5) {
        if (x.length() == i5) {
            complete = true;
        }
        for (int i6 = 0; i6 < List3.size(); i6++) {
            if (i5 + List3.get(i6).length() <= x.length())
            {if (List3.get(i6) == x.substring(i5, i5 + List3.get(i6).length())) {
                List4.add(i5 + List3.get(i6).length());
                RecursiveSplit(x, i5 + List3.get(i6).length()-1);
                if (true == complete) {break;}
                List4.remove(i5 + List3.get(i6).length());
            }}
        }

    }


    static void spacing(String x) {
        String a, b;
        for (int i7 = 0; i7 < List4.size(); i7++) {
            a = x.substring(0, (List4.get(i7)+i7));
            b = x.substring((List4.get(i7)+i7));
            x = a + " " + b; 
            
        }
        System.out.println(x);
    }
    static String input() {
        System.out.println("What Phrase would you like to test");
        return reader.nextLine().toLowerCase();
    }

    
    static int input2() {
        System.out.println("Choose min word length filter 2-20");
        return reader.nextInt();
    }


    static void CaesarCollective() {
        word = input();
        listselect(input2());

        for (int i3 = 0; i3 < 26; i3++) {  
            Regex1(CaesarCipher(i3));
        }

        System.out.println("done");
        System.out.println(List1);

        for (int i4 = 0; i4 < List1.size(); i4++) {
            Identifing(List1.get(i4));

        }
    }
    

    public static void main(String[] args) {
        CaesarCollective();
    }
}
