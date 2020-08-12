public class MutualRecursion {
    public static boolean isOdd(int n) {
        return (n == 0) ? false : isEven(n-1);
    }

    public static boolean isEven(int n) {
        return (n == 0) ? true : isOdd(n-1);
    }

    public static void main(String[] args) {
        int mynumber = 0;
        boolean even = isEven(mynumber);
        System.out.println("Is " + mynumber + " odd: " + even);
    }

}
