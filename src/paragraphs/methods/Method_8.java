package paragraphs.methods;

public class Method_8 {

    public static void main(String[] args) {

        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);

        int myNum1 = plusMethodInt(8, 5);
        System.out.println("sum: " + myNum1);
    }

    static void myMethod(String name) {
        System.out.println("My name is " + name);
    }

    static void myMethod(String name, int age) {
        System.out.println("My name is " + name + " and my age is " + age);
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }
}
