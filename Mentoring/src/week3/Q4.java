package week3;

import java.util.Scanner;

public class Q4 {
    /*
create 2 words : name1 and name2
 if the name1 has even numbers of characters,
 then insert the second word in the middle of the first name
 if the first word has odd numbers
 Then print the “Name2 cannot be inserted in the name1”
 e.g:
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
*/


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter name 1");
        String name1= scan.nextLine();
        if(name1.length()%2==0){
            System.out.println("enter name 2=");
            String name2=scan.nextLine();
            System.out.println(name1.substring(0,name1.length()/2)+name2+ name1.substring((name1.length()/2), name1.length()));

        }
        else
        {
            System.out.println("the first word leght has odd");
        }
    }
}
