package stringmanipulation;

public class Reverse extends StringManipulation {

    //takes a string and outputs the reverse of that string
    public static String reverse(String input) {
        int inputLength = input.length();
        char[] inputArray = input.toCharArray();
        char[] outputArray = new char[inputLength];
        for(int i=0; i<inputLength; i++){
            int current = inputLength -1 - i;
            outputArray[i] = inputArray[current];
        }
        return String.valueOf(outputArray);
    }
}
