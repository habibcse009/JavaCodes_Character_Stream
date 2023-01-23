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