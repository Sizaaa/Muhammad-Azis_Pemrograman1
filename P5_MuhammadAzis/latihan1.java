package P5_MuhammadAzis;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String namaBarang;
        int harga, jumlah, uang, total;

        System.out.println("=== PROGRAM KASIR SEDERHANA ===");
        System.out.print("Nama Barang: ");
        namaBarang = input.nextLine();
        System.out.print("Harga Barang: ");
        harga = input.nextInt();
        System.out.print("Jumlah Beli: ");
        jumlah = input.nextInt();
        System.out.print("Uang diterima: ");
        uang = input.nextInt();

        total = harga * jumlah;

        System.out.println("\n=== PILIH METODE PEMBAYARAN ===");
        System.out.println("1. Cash");
        System.out.println("2. E-Wallet");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        System.out.println("==================================");

        if(pilihan == 1){
            System.out.println("Pembayaran: Cash");
            if(total > 100000){
                total = total - 10000;
                System.out.println("Dapatkan diskon 10.000!");
            } else {
                System.out.println(" Tidak dapat diskon");
            }
        } else if (pilihan == 2){
            System.out.println("Pembayaran: E-Wallet");
            if(total > 50000){
                System.out.println("Dapat Cashback kecil!");
            }
        } else{
            System.out.println("Pilihan tidak tersedia");
        }

        if (uang < total ){
            System.out.println("Uang tidak cukup!");
        } else {
            int kembalian = uang - total;
            System.out.println("Kembalian: "+ kembalian);
        }
        
        System.out.println("\n=== STRUK ===");
        System.out.println("Barang: "+ namaBarang);
        System.out.println("Total Bayar: "+ total);
        System.out.println("================");

    }
}
