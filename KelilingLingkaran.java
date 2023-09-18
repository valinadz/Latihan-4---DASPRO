import java.util.Scanner;

public class KelilingLingkaran {
    public static void main (String [] args) {

        Scanner input =new Scanner(System.in);

        int jari_jari; 
        int keliling;
        double phi;

        System.out.println("Input Nilai phi (3.14)");
        phi = input.nextDouble();
        System.out.println("Input Nilai Jari-Jari");
        jari_jari = input.nextInt();

        keliling = 2 * (int)phi * jari_jari ;
        System.out.println ("HASIL KELILING LINGKARAN : " + keliling);

    }
}