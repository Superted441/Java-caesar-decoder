package Caesar;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;
import java.io.File;
import java.io.FileWriter;

import javax.print.event.PrintJobListener;
import java.io.IOException;

class Caesar {

    static String word, search, ciphertext;
    static int shift, i4, i5, cutoff;
    static Scanner reader = new Scanner(System.in);
    static ArrayList<String> List1 = new ArrayList<String>();
    static ArrayList<String> List2 = new ArrayList<String>();
    // Auto Identifing Ceaser Cipher
    static void listselect() {
        System.out.println("Choose min word length filter 2-20");   
        
        do {
            cutoff = reader.nextInt();
        } while (2 > cutoff && cutoff > 20);
                        // code above gets filter length
        switch(cutoff) {
            case 2:
                try {
                    File file1 = new File("Words/allwords.txt");
                    Scanner myobj1 = new Scanner(file1);
                    while (myobj1.hasNextLine()) {
                        List2.add(myobj1.nextLine());
                    }
                    break;
                } catch (Exception e) {
                    
                    break;
                }   
            case 3:
                try {
                    File file2 = new File("Words/allminus2letterwords.txt");
                    Scanner myobj2 = new Scanner(file2);
                    while (myobj2.hasNextLine()) {
                        List2.add(myobj2.nextLine());
                    }
                    System.out.println(List2);
                    break; 
                } catch (Exception e) {
                    
                    break;
                }
                    
            case 4:
                try {
                    File file3 = new File("Words/4letterwords.txt");
                    Scanner myobj3 = new Scanner(file3);
                    while (myobj3.hasNextLine()) {
                        List2.add(myobj3.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 5:
                try {
                    File file4 = new File("Words/5letterwords.txt");
                    Scanner myobj4 = new Scanner(file4);
                    while (myobj4.hasNextLine()) {
                        List2.add(myobj4.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 6:
                try {
                    File file5 = new File("Words/6letterwords.txt");
                    Scanner myobj5 = new Scanner(file5);
                    while (myobj5.hasNextLine()) {
                        List2.add(myobj5.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 7:
                try {
                    File file6 = new File("Words/7letterwords.txt");
                    Scanner myobj6 = new Scanner(file6);
                    while (myobj6.hasNextLine()) {
                        List2.add(myobj6.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 8:
                try {
                    File file7 = new File("Words/8letterwords.txt");
                    Scanner myobj7 = new Scanner(file7);
                    while (myobj7.hasNextLine()) {
                        List2.add(myobj7.nextLine());  
                    }   
                } catch (Exception e) {
                    
                }
            case 9:
                try {
                    File file8 = new File("Words/9letterwords.txt");
                    Scanner myobj8 = new Scanner(file8);
                    while (myobj8.hasNextLine()) {
                        List2.add(myobj8.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 10:
                try {
                    File file9 = new File("Words/10letterwords.txt");
                    Scanner myobj9 = new Scanner(file9);
                    while (myobj9.hasNextLine()) {
                        List2.add(myobj9.nextLine());
                    } 
                } catch (Exception e) {
                    
                }

            case 11:
                try {
                    File file11 = new File("Words/11letterwords.txt");
                    Scanner myobj11 = new Scanner(file11);
                    while (myobj11.hasNextLine()) {
                        List2.add(myobj11.nextLine());
                    }
                } catch (Exception e) {
                    
                }
            case 12:
                try {
                    File file22 = new File("Words/12letterwords.txt");
                    Scanner myobj22 = new Scanner(file22);
                    while (myobj22.hasNextLine()) {
                        List2.add(myobj22.nextLine());
                    }
                } catch (Exception e) {
                    
                }
            case 13:
                try {
                    File file33 = new File("Words/13letterwords.txt");
                    Scanner myobj33 = new Scanner(file33);
                    while (myobj33.hasNextLine()) {
                        List2.add(myobj33.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 14:
                try {
                    File file44 = new File("Words/14letterwords.txt");
                    Scanner myobj44 = new Scanner(file44);
                    while (myobj44.hasNextLine()) {
                        List2.add(myobj44.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 15:
                try {
                    File file55 = new File("Words/15letterwords.txt");
                    Scanner myobj55 = new Scanner(file55);
                    while (myobj55.hasNextLine()) {
                        List2.add(myobj55.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 16:
                try {
                    File file66 = new File("Words/16letterwords.txt");
                    Scanner myobj66 = new Scanner(file66);
                    while (myobj66.hasNextLine()) {
                        List2.add(myobj66.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 17:
                try {
                    File file77 = new File("Words/17letterwords.txt");
                    Scanner myobj77 = new Scanner(file77);
                    while (myobj77.hasNextLine()) {
                        List2.add(myobj77.nextLine());
                    } 
                } catch (Exception e) {
                    
                }
                
            case 18:
                try {
                    File file88 = new File("Words/18letterwords.txt");
                    Scanner myobj88 = new Scanner(file88);
                    while (myobj88.hasNextLine()) {
                        List2.add(myobj88.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 19:
                try {
                    File file99 = new File("Words/19letterwords.txt");
                    Scanner myobj99 = new Scanner(file99);
                    while (myobj99.hasNextLine()) {
                        List2.add(myobj99.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            case 20:
                try {
                    File file00 = new File("Words/20letterwords.txt"); 
                    Scanner myobj00 = new Scanner(file00);
                    while (myobj00.hasNextLine()) {
                        List2.add(myobj00.nextLine());
                    }
                } catch (Exception e) {
                    
                }
                
            break;

        }
    } 
    static void listreader() throws FileNotFoundException {
        search = List2.get(i5);
        i5++;
    }
    static void CaesarCipher(int shift) {
        ciphertext = ""; // Variable for altered text
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
    }
    static void Regex1() {
        Pattern pattern = Pattern.compile(search, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(ciphertext);
        boolean matchFound = matcher.find();
        if(matchFound) {
            try {
                FileWriter myWriter = new FileWriter("Results.txt");
                myWriter.write(search + " ");
                myWriter.write(ciphertext + "\n");
                List1.add(ciphertext);
                System.out.println(search);
                System.out.println(ciphertext);
                System.out.println(i4);
                myWriter.close();
            } catch (IOException e) {
            }
        }
    }
    static void CaesarCollective() {
        System.out.println("What Phrase would you like to test");
        word = reader.nextLine().toLowerCase();
        int x = 0;
        listselect();
        System.out.println(List2.size());
        for (int i2 = 0; i2 < List2.size(); i2++) {
            try {
                listreader();
                i4 = 0;
                x++;
            } catch (FileNotFoundException e) {
            }
            for (int i3 = 0; i3 < 26; i3++) {
                CaesarCipher(i4);
                Regex1();
                i4++;
            }
        }
        System.out.println(x);
        System.out.println(List1);
    }

    public static void main(String[] args) {
        CaesarCollective();
    }
}
