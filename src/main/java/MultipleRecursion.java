public class MultipleRecursion {

    public static long fibonacci(long n) {
        return (n < 2) ? n : fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int numberOfFibonacciNumbers = 10;

        for (int i=0;i<numberOfFibonacciNumbers;i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
