package P8_MuhammadAzis.src;

import java.util.Scanner;

public class tugas2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int total = 0;
        char pilih;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();

            total = total + nilai;

            System.out.print("Input lagi? (y/t): ");
            pilih = input.next().charAt(0);

        } while (pilih == 'y' || pilih == 'Y');

        System.out.println("Total nilai mahasiswa: " + total);
        input.close();

    }
}