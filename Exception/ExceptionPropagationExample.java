public class ExceptionPropagationExample {

    // method1 throws ArithmeticException
    static void method1() {
        int x = 18 / 0; // This will throw ArithmeticException
    }

    // method2 calls method1 (no try-catch here)
    static void method2() {
        method1();
    }

    // main() handles the exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
