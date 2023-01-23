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
