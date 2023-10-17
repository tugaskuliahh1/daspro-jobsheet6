import java.util.Scanner;

public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int sudut1, sudut2, sudut3;
        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = input13.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = input13.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = input13.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah SEGITIGA SIKU-SIKU");
            } else if ((sudut1 == sudut2 && sudut1 == sudut3 && sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah SEGITIGA SAMA SISI");
            } else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3) {
                System.out.println("Segitiga tersebut adalah SEGITIGA SAMA KAKI");
            } else {
                System.out.println("SEGITIGA SEMBARANG");
            }
        } else {
            System.out.println("BUKAN SEGITIGA");
        }
    }
}