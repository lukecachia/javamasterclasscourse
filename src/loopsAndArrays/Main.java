package loopsAndArrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        // declare an empty integer array of length = 3
        // print the contents to the console
        int[] numbers = new int[3];

        //Exercise 2
        // fill it with the number `4`
        // print the array to the console
        numbers[0] = 4;

        //Exercise 3
        // reassign the second value in the array to the number `17`
        // print the array to the console
        numbers[1] = 17;
        System.out.println(Arrays.toString(numbers));

        //Exercise 5
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] letters = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(letters));

        //Exercise 6
        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] letters2 = letters;
        letters2[0] = "z";
        System.out.println(Arrays.toString(letters2));

        //Exercise 7
        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        String[] letters3 = Arrays.copyOf(letters, 4);
        letters3[0] = "z";
        System.out.println(Arrays.toString(letters3));

        //Exercise 7b
        // create a `for` loop which prints each item in the array
        String[] a = {"a", "b", "c", "d"};
        for(int i=0; i<a.length; i++) {
            System.out.println("letter: " + a[i]);
        }

        //Exercise 8
        // create a for loop which goes from 0 to 10
        // print each value
        for(int i=0; i<=10; i++) {
            System.out.println("No: " + i);
        }

        //Exercise 9
        // create a for loop which goes from 10 down to 0
        // print each value
        for(int i=10; i>0; i--) {
            System.out.println("No--: " + i);
        }

        //Exercise 10
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] numbers2 = new int[11];
        for(int i=0; i<=10; i++) {
            numbers2[i] = i;
        }
        System.out.println(Arrays.toString(numbers2));

        //Exercise 11
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
        int[] sumArray = {2, 5, 10, 12, 15};
        int sum = 15;
        for(int i=0; i<sumArray.length; i++) {
            sum += sumArray[i];
        }
        System.out.println("Total Sum: " + sum);

        //Exercise 12
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array
        String[] lowerCaseArray = {"hello", "its", "a", "test"};
        for(int i=0; i<lowerCaseArray.length; i++) {
            lowerCaseArray[i] = lowerCaseArray[i].toUpperCase();
        }
        System.out.println("Array in uppercase: " + Arrays.toString(lowerCaseArray));

        //Exercise 13
        // create a for loop which goes through each string in our array
        // grab the first letter of our word
        // capitalise the first letter
        // add the capitalised letter to the rest of the provided word
        // assign the value to an array
        // print our resulting array
        String[] lowerCaseWords = {"i", "sure", "do", "love", "bees"};
        for(int i=0; i<lowerCaseWords.length; i++) {
            lowerCaseWords[i] = lowerCaseWords[i].substring(0, 1).toUpperCase() + lowerCaseWords[i].substring(1);
        }
        System.out.println("Array in title case: " + Arrays.toString(lowerCaseWords));

        //Exercise 14
        /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
        */
        String[] content = {"you", "are", "how", "hello"};
        String[] reversedArray = new String[content.length];
        String iterateString = "";
        int y = 0;
        for(int i=content.length-1; i>=0; i--) {
            iterateString =  content[i];
            reversedArray[y] = iterateString;
            y++;
        }
        System.out.println("finalArray: " + Arrays.toString(reversedArray) + "?");


        //Exercise 14 - ATTEMPT 2 (after solution review)
        /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
        */
        String[] content2 = {"you", "are", "how", "hello"};
        String finalString = "";

        for(int i=content2.length-1; i>=0; i--) {
            finalString += content2[i] + " ";
        }
        finalString = finalString.trim()+ "?";
        System.out.println("Reversed Array in String: " + finalString);

        //Exercise 15
        /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.slit(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
        */
        String listOfNumbers = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] arrayOfNumbers = listOfNumbers.split(", ");

        for(int i=0; i<arrayOfNumbers.length; i++) {
            result += Double.parseDouble(arrayOfNumbers[i]);

        }
        System.out.println("Result = " + result );

        //Exercise 16
        /*
        Write a program that takes arguments from the program args and loops through args and prints each item in args
        Compile using: javac and run using: java
        i.e. javac Exercise5.java | java Exercise5 foo bar baz
        */
        for(int i=0; i<args.length; i++) {
            System.out.println("Args at index " + i + " = " + args[i]);
        }
    }
}
