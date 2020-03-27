package paragraphs;

public class IfElse_1 {

    public static void main(String[] args) {

//        Less than: a < b
//        Less than or equal to: a <= b
//        Greater than: a > b
//        Greater than or equal to: a >= b
//        Equal to a == b
//        Not Equal to: a != b

//        Use if to specify a block of code to be executed, if a specified condition is true
//        Use else to specify a block of code to be executed, if the same condition is false
//        Use else if to specify a new condition to test, if the first condition is false

        int x = 20;

        int y = 18;

        if(x > y){
            System.out.println(x + " is greater than " + y);
        }
        else if(x == y){
            System.out.println(x + " is equal to " + y);
        }
        else{
            System.out.println(y + " is greater than " + x);
        }
    }
}
