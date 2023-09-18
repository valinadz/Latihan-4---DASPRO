import java.util.Scanner;

public class LuasSegitiga {
    public static void main (String [] args) {

        Scanner input =new Scanner(System.in);

        int panjang, tinggi, luas;

        System.out.println("Input Nilai Panjang");
        panjang = input.nextInt();
        System.out.println("Input Nilai Tinggi");
        tinggi = input.nextInt();

        luas = panjang * tinggi / 2;
        System.out.println("HASIL LUAS SEGITIGA : " + luas);

    }
}