package P8_MuhammadAzis.src;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int total = 0;
        int jumlahData = 0;
        double rataRata;
        char pilih;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();

            total = total + nilai;
            jumlahData++;

            System.out.print("Input lagi? (y/t): ");
            pilih = input.next().charAt(0);

        } while (pilih == 'y' || pilih == 'Y');

        rataRata = (double) total / jumlahData;

        System.out.println("Total nilai: " + total);
        System.out.println("Jumlah data: " + jumlahData);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}