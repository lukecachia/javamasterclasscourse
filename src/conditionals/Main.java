package conditionals;

public class Main {
    public static void main(String[] args) {
        // QUESTION 1
        // create an integer variable
        // create a second integer variable
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        int numberOne = 4;
        int numberTwo = 10;
        if(numberOne == numberTwo){
            System.out.println(numberOne + " is equal to " + numberTwo);
        }

        //QUESTION 2
        // create a string variable
        // create a second string variable which has the same value as the first
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String stringOne = "Hello";
        String stringTwo = "Bye";
        if(stringOne.equals(stringTwo)){
            System.out.println(stringOne + " is equal to " + stringTwo);
        }

        //QUESTION 3
        // create an string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String stringThree = new String("newString");
        String stringFour = "newString";
        if(stringThree.equals(stringFour)){
            System.out.println(stringThree + " is equal to " + stringFour);
        }

        //Question 4
        // create two `int` variables. Assign them values
        // create an `if` statement which compares whether one value is greater than the other
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
        int intOne = 5;
        int intTwo = 10;
        if(intOne > intTwo) {
            System.out.println("intOne is bigger than intTwo");
        } else {
            System.out.println("intOne is smaller than intTwo");
        }

        //QUESTION 5
        // create three `int` variables. Assign them values with the first value sitting between the other two
        // create an `if` statement which compares whether the first value is greater than the second
        // AND less than the third
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
        int intThree = 7;
        if(intOne > intTwo && intTwo < intThree) {
            System.out.println("intOne is bigger than intTwo and smaller than intThree");
        } else {
            System.out.println("intOne is smaller than intTwo and bigger than intThree");
        }

        //QUESTION 7
        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met
        String aString = "Hello";
        if(aString.substring(0,1).equals("H")){
            System.out.println("First letter of the String is: H!");
        }

        //QUESTION 8
        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
        String testString = "Hello";
        char testChar = 'l';
        for(int i=0; i<testString.length(); i++) {
            if(testString.charAt(i) == testChar){
                System.out.println("The letter at index " + i + " is a " + testChar);
            }
        }

        //QUESTION 9
        // create a for loop which goes from 0 to 20
        // print each even value
        for(int i = 0; i <= 20; i++) {
            if(i % 1 == 0 && i % 2 == 0) {
                System.out.println("Number " + i + " is even!");
            }
        }

    }
}
