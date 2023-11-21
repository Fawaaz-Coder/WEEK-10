public class Ascii {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("ASCII chracters!");


        while(i<65000){
            char display = (char)i;
            System.out.println(display + "");
            if (i%10 == 0) System.out.println("");
            i++;
        }
        System.out.println("\n*********************************************");
        System.out.println("End");
        System.out.println("*********************************************");
    }

}
