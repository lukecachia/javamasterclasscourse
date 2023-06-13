package conditionals;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Reversed String: " + getReverseOfInputString("hello"));
        System.out.println("Formatted: " + getFormatedString("   amig os cod e  "));

        String[] listOfWords = {"hello", "bingo", "ola", "bye", "ciao"};
        System.out.println("Longest word in: " + getLongestStringInArray(listOfWords));
    }

    /*
    Write a method that reverses any String and print to console
    Input should be a string
    Output should be reversed input
    */
    public static String getReverseOfInputString(String inputString) {
        String reversedString = "";

        for(int i = inputString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + inputString.charAt(i);
        }

        return reversedString;
    }

    /*
    Given the following String input
    String input = "   amig os cod e  "
    Write a method that transforms input into: Amigoscode
    */
    public static String getFormatedString(String inpString) {
        String formattedString = "";
        formattedString = inpString.replaceAll("\\s", "");
        formattedString = formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1);

        return formattedString;
    }

    /*
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static String getLongestStringInArray(String[] providedArray) {
        int stringLength = 0;
        String longestString = "";
        for(int i = 0; i < providedArray.length; i++) {
            if(providedArray[i].length() > stringLength) {
                longestString = providedArray[i];
                stringLength = providedArray[i].length();
            } else if (providedArray[i].length() == stringLength) {
                longestString = longestString + ", " + providedArray[i];
            }
        }

        return longestString;
    }
}
