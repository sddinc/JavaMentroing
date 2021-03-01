package week3;

import java.util.Scanner;

public class Q7 {
    /*
		StringMethods:
			Write a Java program to extract the first half of a string of even length.
Example:
			     INPUT      :  Python
			    OUTPUT :   Pyt
	    */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter firste name");
        String str1= scan.nextLine();
    if(str1.length()%2==0){
        String str=str1.substring(0,str1.length()/2);
        System.out.println(str);

    }
        }
}
