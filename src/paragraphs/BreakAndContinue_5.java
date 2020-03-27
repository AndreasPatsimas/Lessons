package paragraphs;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class BreakAndContinue_5 {

    public static void main(String[] args) {

//        BREAK
//
//         break statement  used to "jump out" of a switch statement.
//
//        The break statement can also be used to jump out of a loop.

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------------------");

//        CONTINUE

//        The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // the same with while loop
    }
}
