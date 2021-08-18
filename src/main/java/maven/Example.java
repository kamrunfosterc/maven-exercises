package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        System.out.println("Enter anything you'd like: ");
        Scanner scanner = new Scanner(System.in);
        String userEntry = scanner.nextLine();// grabs whatever they enter and stores it in userEntry

//        System.out.println("You Entered: "+"'"+userEntry+"'");//oldway
        System.out.printf("You Entered: \"%s\"",userEntry);
        String userSwap = StringUtils.swapCase(userEntry);
        String userReverse = StringUtils.reverse(userEntry);

        if (!StringUtils.isNumeric(userEntry)){// returns false if 'userEntry' is numeric
            System.out.println("\n *** This isn't a number ***");
        } else {
            System.out.println("\n *** That is a number ***");
        }


//        System.out.println("\nFlipped Case: " + userSwap);//old version
        System.out.printf("\nFlipped Case: %s",userSwap);
//        System.out.println("\nReversed: " + userReverse);// old version
        System.out.printf("\nReversed: %s",userReverse);
//        System.out.println(StringUtils.swapCase("Hello"));

    //        StringUtils.swapCase();


    }
}
