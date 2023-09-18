import java.util.Scanner;

public class KelilingSegitiga {
    public static void main (String [] args) {

        Scanner input =new Scanner(System.in);

        int a, b, c, keliling;

        System.out.println("Input Sisi A");
        a = input.nextInt();
        System.out.println("Input Sisi B");
        b = input.nextInt();
        System.out.println("Input Sisi C");
        c = input.nextInt();

        keliling = a + b + c;
        System.out.println("HASIL KELILING SEGITIGA : " + keliling);

    }
}