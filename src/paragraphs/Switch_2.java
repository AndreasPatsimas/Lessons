package paragraphs;

public class Switch_2 {

    public static void main(String[] args) {

//        Use switch to specify many alternative blocks of code to be executed

//        remeber {} case -> more code

//        When Java reaches a break keyword, it breaks out of the switch block.

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:{
                String beautifulDay = " is a very beautiful date.";
                System.out.println("Friday" + beautifulDay);
                break;
            }
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
