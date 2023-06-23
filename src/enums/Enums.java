package enums;

public class Enums {
    //EXERCISE 1
    /*
    create enum to represent t-shirt sizes from small to extra extra large
     */
    //enum TShirtSize {
    //
    //}

    public static void main(String[] args) {
        //EXERCISE 2
        /*
        R   emove the above enum from this class and put it as separate file.
        You should create a separate class of type enum
        Run this code and should print T Shirt Size: M
         */
        System.out.println(TShirtSize.M);

        //EXERCISE 3
        /*
        invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
        hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
        */
        TShirtSize[] sizes = TShirtSize.values();
        for (TShirtSize size : sizes) {
            System.out.println(size.name().toLowerCase());
        }
    }


}


