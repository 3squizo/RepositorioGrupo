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
public class fibonacci {

    public static void main(String[] args) {
        int n = 10; // cantidad de términos a generar
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci (" + n + " términos):");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }
}
