package dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        //Exercise 1
        //Print todays Date and Time using LocalDate and LocalDateTime
        LocalDate lDate = LocalDate.now();
        LocalTime lTime = LocalTime.now();

        System.out.println(lDate);
        System.out.println(lTime);

        //Exercise 2
        //Represent your date of birth using LocalDate
        LocalDate myBirthday = LocalDate.of(1993, 1, 4);
        System.out.println("My Birthday: " + myBirthday);

        //Exercise 3
        //Add 100 days to your date of birth and print it
        LocalDate birthdayPlus100 = myBirthday.plusDays(100);
        System.out.println("My Birthday+100 : " + birthdayPlus100);

        System.out.println(calculateAge(LocalDate.of(1993, 1, 4)));

    }

    //Exercise 4
    //Write a method that calculate age on any given date
    private static int calculateAge(LocalDate date) {
        LocalDate lDate = LocalDate.now();
        return lDate.getYear() - date.getYear();
    }
}
