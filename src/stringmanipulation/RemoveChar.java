package stringmanipulation;


class RemoveChar extends StringManipulation {

    public static String removeChar(String input, String letter){
        //remove all letters that equal letter but convert input to string[]
        String[] inputArray = input.split(letter);
        //convert string[] back to string;
        String output = "";
        for (String character : inputArray) output = output + character;
        //return string without letter
        return output;
    }
}
