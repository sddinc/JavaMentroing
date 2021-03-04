package OfficeHour02;

import java.util.Scanner;

/*
Ask user Name, Surname and credit card numbers than convert it to special form
 (Check credit card number, if there isn't 16 digit print
 "Invalid credit card number"
 Input : John White 1234234534561478
 Output : Name : J*** W**** CCN : **** **** **** 1478
 (Initials for name and surname should be uppercase)
 */
public class question2 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName= scan.nextLine();
        System.out.println("Enter last name:");
        String lastName= scan.nextLine();
        System.out.println("Credit card number:");
        String ccn= scan.nextLine();

        if(ccn.length()!=16)
        {
            System.out.println("invalid credit card number");
        }
        else
        {
             firstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1).replaceAll("\\w","*");
             lastName =lastName.substring(0,1).toUpperCase()+lastName.substring(1).replaceAll("\\w","*");
             ccn=ccn.substring(0,11).replaceAll("\\w","*")+ccn.substring(12,16);
            System.out.println(firstName+"\n"+lastName+"\n"+ccn);
        }

    }
}
