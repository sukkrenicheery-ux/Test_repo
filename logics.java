public class Logics {
    public static void main(String[] args) {
        System.out.println("Hello from Logics.java");
        int a = 5;
        int b = 3;
        System.out.println("Sum: " + add(a, b));
        System.out.println("Product: " + multiply(a, b));
        System.out.println("Is " + a + " even? " + isEven(a));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
