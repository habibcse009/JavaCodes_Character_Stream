# CSE_Lab_Codes for Character, Stream & String
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
***
#### Example 3: A java code to count keywords from a stream inputed by user

```
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

```
#### Output : ![Screenshot 2023-01-23 154052](https://user-images.githubusercontent.com/27882232/214008673-d532d99e-9c3e-4aef-bbd9-5fd266f1156e.jpg)

***
#### Example 4 : A java code to count new lines, white spaces & number digit from a stream from a file

```
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

```
#### Input File : [testtext.txt](https://github.com/habibcse009/JavaCodes_Character_Stream/files/10478460/testtext.txt)

#### Output :![Screenshot 2023-01-23 154551](https://user-images.githubusercontent.com/27882232/214009348-60a56688-fb84-408a-8032-6c7e50955b6a.jpg)

***
#### Example 5: A java code to Determine whether a given input is keyword or valid identifier or invalid identifier or constant or comments.

```
import java.util.Scanner;

public class CheckComment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		int n;
		boolean contants = false,valid_identidier=false,invalid_identidier=false;
		System.out.println("Enter a word: ");
		word=scan.nextLine();
		word.trim();
		n=word.length();
		if ((word.charAt(0)=='/' && word.charAt(1)=='/') || (word.charAt(0)=='/' && word.charAt(1)=='*'
				&& word.charAt(n-1)=='/' && word.charAt(n-2)=='*')) {
			System.out.println("Given String is a comment");
		}



		else if (word.contains("if") || word.contains("else") || word.contains("while")
				|| word.contains("do") || word.contains("extern") || word.contains("auto")
				|| word.contains("finally")  || word.contains("global") || word.contains("false")
				|| word.contains("true") || word.contains("for") || word.contains("form")) {
			System.out.println(word+" is Keyword");
		}
		else {
			for(int i=0;i<word.length();i++) {
				if (word.charAt(i)=='.' || word.charAt(i)=='0' || word.charAt(i)=='1' || word.charAt(i)=='2' || word.charAt(i)=='3' 
						|| word.charAt(i)=='4' || word.charAt(i)=='5' || word.charAt(i)=='6' 
						|| word.charAt(i)=='7' || word.charAt(i)=='8' || word.charAt(i)=='9') {
					contants=true;
				}
				else {
					contants=false;
					break;
				}

			}


			if((word.charAt(0)>='a' &&  word.charAt(0)<='z') || 
					(word.charAt(0)>='A' &&  word.charAt(0)<='Z') || 
					word.charAt(0)=='_') {

				for (int i = 1; i < word.length(); i++) {
					if((word.charAt(i)>='0' &&  word.charAt(i)<='9') ||
							(word.charAt(i)>='a' &&  word.charAt(i)<='z') || 
							(word.charAt(i)>='A' &&  word.charAt(i)<='Z') || 
							word.charAt(0)=='_') {
						valid_identidier=true;						
					}
					else if (word.charAt(0)=='-' || word.charAt(i)=='.' || word.charAt(i)=='0' || word.charAt(i)=='1' || word.charAt(i)=='2' || word.charAt(i)=='3' 
							|| word.charAt(i)=='4' || word.charAt(i)=='5' || word.charAt(i)=='6' 
							|| word.charAt(i)=='7' || word.charAt(i)=='8' || word.charAt(i)=='9') {
						contants=true;
					}
					else {
						invalid_identidier=true;
						break;
					}
				}
				if (valid_identidier==true) {
					System.out.println(word+" is Valid Identifier");

				}
				else if (invalid_identidier==true && contants==false) {
					System.out.println(word+" is Invalid Identifier");

				}

			}
			else {
				if (contants==false) {
					System.out.println(word+" is Invalid Identifier");

				}

			}

			if (contants==true) {

				System.out.println(word+" is Constant");
			}

		}
	}

}
```

##### Output-1: <br>
Enter a word:  <br>
123 <br>
123 is Constant <br>
##### Output-2: <br>
Enter a word:  <br>
if <br>
if is Keyword <br>
##### Output-3: <br>
Enter a word:  <br>
#123 hei <br>
#123 hei is Invalid Identifier <br>
##### Output-4: <br>
Enter a word:  <br>
hello world <br>
hello habib is Valid Identifier <br>
##### Output-5: <br>
Enter a word:  <br>
//hello <br>
Given String is a comment <br>

