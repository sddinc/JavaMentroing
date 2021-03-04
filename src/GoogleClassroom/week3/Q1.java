package GoogleClassroom.week3;

import java.util.Scanner;

public class Q1 {
    /*
Write the Switch Case java code that prints the A, B, C, D, F notes that the user has entered.
           A Excellent
           B	Good
           C	Average
           D	Deficient
           F	Failing
		 */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a note");
        String note= scan.next();
        switch(note)
        {
            case "A":
                System.out.println("Excellent"); break;
            case "B":
                System.out.println("Good"); break;
            case "C":
                System.out.println("Average"); break;
            case "D":
                System.out.println("Deficient"); break;
            case "F":
                System.out.println("Failing"); break;
        }
    }
}
