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

