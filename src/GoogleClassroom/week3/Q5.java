package GoogleClassroom.week3;

import java.util.Scanner;

public class Q5 {
/*
Ask user to enter a word.
If the word has odd number of characters lenth() of characters and has 3 or more characters,
print the character in the middle of the word.
*/
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter a word");
    String word= scan.nextLine();
    if(word.length()%2==1 && word.length()>3){
        System.out.println(word.substring(word.length()/2,word.length()/2+1));

    }
    else
    {
        System.out.println("the  word leght has even or less than 3 ");
    }
}


}
