import java.util.Scanner;

public class KelilingPersegiPanjang {
    public static void main (String [] args) {

        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.println("Input Nilai Panjang");
        panjang = input.nextInt();
        System.out.println("Input Nilai Lebar");
        lebar = input.nextInt();

        keliling = 2 * (panjang+lebar);
        System.out.println("HASIL KELILING PERSEGI PANJANG : " + keliling);

    }
}