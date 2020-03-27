package paragraphs.methods;

public class Method_7 {

    public static void main(String[] args) {

        myMethod();

        System.out.println("Called method many times...");

        myMethod();
        myMethod();
        myMethod();
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }
}
