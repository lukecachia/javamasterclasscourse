package loopsAndArrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // declare an empty integer array of length = 3
        // print the contents to the console
        int[] numbers = new int[3];

        // fill it with the number `4`
        // print the array to the console
        numbers[0] = 4;

        // reassign the second value in the array to the number `17`
        // print the array to the console
        numbers[1] = 17;
        System.out.println(Arrays.toString(numbers));

        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] letters = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(letters));

        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] letters2 = letters;
        letters2[0] = "z";
        System.out.println(Arrays.toString(letters2));

        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        String[] letters3 = Arrays.copyOf(letters, 4);
        letters3[0] = "z";
        System.out.println(Arrays.toString(letters3));

        // create a `for` loop which prints each item in the array
        String[] a = {"a", "b", "c", "d"};
        for(int i=0; i<a.length; i++) {
            System.out.println("letter: " + a[i]);
        }

        // create a for loop which goes from 0 to 10
        // print each value
        for(int i=0; i<=10; i++) {
            System.out.println("No: " + i);
        }

        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] numbers2 = new int[11];
        for(int i=0; i<=10; i++) {
            numbers2[i] = i;
        }
        System.out.println(Arrays.toString(numbers2));

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

        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array
        String[] lowerCaseArray = {"hello", "its", "a", "test"};
        for(int i=0; i<lowerCaseArray.length; i++) {
            lowerCaseArray[i] = lowerCaseArray[i].toUpperCase();
        }

        System.out.println("Array in uppercase: " + Arrays.toString(lowerCaseArray));

    }
}
