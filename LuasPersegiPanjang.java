import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main (String [] args) {

        Scanner input =new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("Input Nilai Panjang");
        panjang = input.nextInt();
        System.out.println("Input Nilai Lebar");
        lebar = input.nextInt();

        luas = panjang * lebar;
        System.out.println("HASIL LUAS PERSEGI PANJANG : " + luas);

    }
}