# CSE_Lab_Codes
Java codes for Lab Classes of Computer Science &amp; Engineering's Courses<br>
#### Example 1: A java code to count character, word, special character, white spaces from a string inputed by user

```
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int charCount = 0;
        int wordCount = 0;
        int specialCharCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                charCount++;
            } else if (Character.isWhitespace(str.charAt(i))) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }

        String[] words = str.split("\\s+");
        wordCount = words.length;

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of special characters: " + specialCharCount);
        System.out.println("Number of white spaces: " + spaceCount);
    }
}
```
#### Output : ![Screenshot 2023-01-23 145243](https://user-images.githubusercontent.com/27882232/213999113-d409ce6c-c64b-4e40-87aa-5117c1abb0cd.jpg)
***
#### Example 2: A java code to count new lines, white spaces & number digit from a stream inputed by user

```
import java.util.Scanner;

public class CharacterNewLinesSpaceDigit {
    public static void main(String[] args) {
        int newlines = 0, blankSpaces = 0, digits = 0;
        char a=' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character stream: ");
        do {
            newlines++;
            String input = scan.nextLine();
            for (int i = 0; i < input.length(); i++) {
                a = input.charAt(i);
                if (a == ' ') {
                    blankSpaces++;
                } else if (Character.isDigit(a)) {
                    digits++;
                }
                if(a == '*'){
                    break;
                }
            }
        } while (a != '*');
        System.out.println("Newline: " + newlines);
        System.out.println("Blank Space: " + blankSpaces);
        System.out.println("Digit: " + digits);
        
    }
}
```
#### Output :![Screenshot 2023-01-23 150535](https://user-images.githubusercontent.com/27882232/214001600-ced6d377-b30e-4c59-a318-800a64e57e91.jpg)
