package stringmanipulation;
import java.util.Scanner;

public class StringManipulation {

    protected static String getInput(String message){
        // create a scanner and grab the user's word.
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

}
