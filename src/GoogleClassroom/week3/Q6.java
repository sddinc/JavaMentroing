package GoogleClassroom.week3;

import java.util.Scanner;

public class Q6 {
    /*
Ask user to enter firstName and lastName then make first initials uppercase and rest should be all lovercase
ferhat => Ferhat
kirac => Kirac
          */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter firste name");
        String firstName= scan.nextLine();
        System.out.println("enter firste name");
        String lastName= scan.nextLine();
        String str=firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length()).toLowerCase();
        String str1=lastName.substring(0,1).toUpperCase()+lastName.substring(1,lastName.length()).toLowerCase();

        System.out.println(str+" "+str1);

    }
}
