public class SingleRecursion {
        public static long factorial(int n) {
            return (n < 2) ? 1 : n*factorial(n-1);
        }

        public static void main(String[] args) {
            long factorial = factorial(3);
            System.out.println(factorial);
            System.out.println(3*2*1);
        }
}
