package GoogleClassroom.week3;

public class Q3 {
        /*Write a code using ternary:
		Create int variable : price
		Create string variable : decision
		If the price = $10 Print “cheap”
		If price is 10-$20 print “ok”
		Otherwise “expensive”.
		*/
        public static void main(String[] args) {

            int price=12;

            String message="";
            message=price==10?"cheap":price>10 && price<21?"ok":"expensive";
            System.out.println(message);
        }

}
