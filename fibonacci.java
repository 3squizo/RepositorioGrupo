public class FibonacciRecursivo {
    public static void main(String[] args) {
        int terminos = 10;
        System.out.println("Serie de Fibonacci hasta " + terminos + " términos:");
        generarFibonacci(0, 1, terminos);
    }

    public static void generarFibonacci(int a, int b, int c) {
        if (c > 0) {
            System.out.print(a + " ");
            generarFibonacci(b, a + b, c - 1);
        }
    }
}
