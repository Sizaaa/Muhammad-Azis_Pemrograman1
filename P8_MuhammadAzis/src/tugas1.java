package P8_MuhammadAzis.src;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        char pilih;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Input lagi? (y/t): ");
            pilih = input.next().charAt(0);

        } while (pilih =='y' || pilih == 'Y');

        System.out.println("Program Selesai.");
        input.close();
    }
}