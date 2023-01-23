import java.util.Scanner;

public class KeywordCount {
    public static void main(String[] args) {
        int ifCount = 0, elseCount = 0, gotoCount = 0, whileCount = 0, forCount = 0, doCount = 0;
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character stream: ");
        do {
            a = scan.next();
            if (a.equals("if")) {
                ifCount++;
            } else if (a.equals("else")) {
                elseCount++;
            } else if (a.equals("goto")) {
                gotoCount++;
            } else if (a.equals("while")) {
                whileCount++;
            } else if (a.equals("for")) {
                forCount++;
            } else if (a.equals("do")) {
                doCount++;
            }
        } while (!a.equals("*"));
        System.out.println("Total 'if' found: " + ifCount);
        System.out.println("Total 'else' found: " + elseCount);
        System.out.println("Total 'goto' found: " + gotoCount);
        System.out.println("Total 'while' found: " + whileCount);
        System.out.println("Total 'for' found: " + forCount);
        System.out.println("Total 'do' found: " + doCount);
    }
}
