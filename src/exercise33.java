/**
 * Created by Praktika on 9.11.2016.
 */

import java.util.Scanner;

public class exercise33 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int seconds, minutes, hours;


        System.out.print("Enter amount of seconds to be converted: ");
        seconds = in.nextInt();

        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.println("Answer in hours, minutes and seconds is:");
        System.out.printf("%d hours, %d minutes and %d seconds", hours, minutes, seconds);

    }
}
