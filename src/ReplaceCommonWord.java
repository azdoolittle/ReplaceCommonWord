/*
import scanner
declare class
declare method
declare vars for the, be, BE, input, splitstring
prompt user to enter text
initialize input to string
split string
while loop
begin for loop
if string[i] is the, replace it with BE
print new string
recursive call on main method
    exit when quit
 */

import java.util.Scanner;

public class ReplaceCommonWord {
    public static void main(String[] args) {
        String the, be, quit, inputText, outputText;
        String[] splitInputText;
        Scanner input = new Scanner(System.in);
        quit = "quit";
        the = "the";
        be = "BE";
        outputText = "";

        System.out.println("Enter some text or enter 'quit' to quit: ");
        inputText = input.nextLine();
        splitInputText = inputText.split(" ");

        while (!inputText.equals(quit)) {
            for (int i = 0; i < splitInputText.length; i ++) {
                if (splitInputText[i].equals(the)) {
                    splitInputText[i] = be;
                }
                outputText += splitInputText[i] + " ";
            }
            System.out.println(outputText);
            main(new String[] {});
            return;
        }
    }
}
