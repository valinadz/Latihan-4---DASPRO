import java.util.Scanner;

public class LuasLingkaran {
    public static void main (String [] args) {

        Scanner input =new Scanner(System.in);

        int jari_jari;
        int luas;
        double phi;

        System.out.println("Input Nilai Phi (3.14)");
        phi = input.nextDouble();
        System.out.println("Input Nilai Jari-Jari");
        jari_jari = input.nextInt();

        luas = (int)phi * jari_jari * jari_jari;
        System.out.println("HASIL LUAS LINGKARAN : " + luas);

    }
}