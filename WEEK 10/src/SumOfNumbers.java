public class SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i<=10; i = i+2){
            sum += i;
            System.out.println("i: " + i + " total: " + sum);
        }
        System.out.println("Sum is: " + sum);
    }
}
