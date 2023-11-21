public class Loops {
    public static void main(String[] args) {
    int x = 0;
        for(int i = 1; i<=4; i = i + 2) {
            System.out.println("Inside loop---Value of x: " + i);
            x = i;
        }
        System.out.println("Outside loop---Final value of x: " + x);
    }

}
