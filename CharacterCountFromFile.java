import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCountFromFile {
    public static void main(String[] args) {
        int newlines = -1, blankSpaces = 0, digits = 0;
        char a;
        
        File file = new File("E:/testtext.txt");
        try {
            Scanner scan = new Scanner(file);
			/*
			 * while (scan.hasNextLine()) { newlines++; String line = scan.nextLine(); for
			 * (int i = 0; i < line.length(); i++) { a = line.charAt(i); if (a == ' ') {
			 * blankSpaces++; } else if (Character.isDigit(a)) { digits++; } if(a == '*'){
			 * break; } } }
			 */
            String fileContent = "";
            while (scan.hasNextLine()) {
                newlines++;
                String line = scan.nextLine();
                fileContent += line + "\n";
                for (int i = 0; i < line.length(); i++) {
                    a = line.charAt(i);
                    if (a == ' ') {
                        blankSpaces++;
                    } else if (Character.isDigit(a)) {
                        digits++;
                    }
                    if(a == '*'){
                        break;
                    }
                }
            }
            System.out.println("File Content:\n" + fileContent);


            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
        System.out.println("------------------------------");

        System.out.println("Newline: " + newlines);
        System.out.println("Blank Space: " + blankSpaces);
        System.out.println("Digit: " + digits);
    }
}
