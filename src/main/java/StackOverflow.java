public class StackOverflow {
    public static void mycalculation(int num) {
        System.out.println(num);
        if (num >10000){
            System.out.println("Limit has been reached.");
            return;
        }
        mycalculation(num+1);
    }

    public static void main(String[] args) {
        mycalculation(1);
    }

}
