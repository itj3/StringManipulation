package stringmanipulation;

import static stringmanipulation.Reverse.reverse;

public class Palindrome extends StringManipulation {

    public static boolean isPalindrome(String input){
        // grab the input from user if input is empty
        if (input.length() == 0) input = getInput("Please enter a input: ");

        //grab the last half of the string
        int inputLength = input.length();
        int index = (inputLength / 2) + (inputLength % 2);
        String inputEnd = input.substring(index);

        //grab the first half of the string
        String inputBeg = input.substring(0, inputLength / 2);

        //reverse the last half of the string
        String inputEndReverse = reverse(inputEnd);
        //String inputEndReverse = new StringBuffer(inputEnd).reverse().toString();

        /*
        compare the first half of the input to the reversed last half
        and return true/false accordingly
        */
        return inputBeg.equals(inputEndReverse);
    }
}

