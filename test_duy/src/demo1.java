public class demo1 {
    public int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        demo1 calc = new demo1(); // Changed from Calculator to duy
        int result = calc.plus(7, 5);
        System.out.println("Result: " + result); // Output: Result: 12
    }
}