package OfficeHour02;

import java.util.Arrays;
import java.util.Scanner;

/*
 create a custom return type method accepts a name as parameter
and prints the name as a char array
(do not use toCharArray() method)
* Input : John
* Output : [J, o, h, n]
 */
public class question3 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter  name:");
        String firstName= scan.nextLine();
        charArray(firstName);
        }
        private static void charArray(String name){
        char output[]= new char[name.length()];

            for (int i=0;i<name.length();i++)
            {
                output[i]=name.charAt(i);

            }
            System.out.println(Arrays.toString(output));
        }
}
