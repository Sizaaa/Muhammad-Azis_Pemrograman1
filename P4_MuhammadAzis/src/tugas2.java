package P4_MuhammadAzis.src;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA PEMBELIAN ===");

        System.out.print("Nama Barang: ");
        String barang = input.nextLine();
        System.out.print("Harga Satuan: ");
        double harga = input.nextDouble();
        System.out.print("Jumlah Beli: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;

        System.out.print("Uang bayar: ");
        double bayar = input.nextDouble();
        double kembalian = bayar - total;

        System.out.println("\n=============================");
        System.out.println("STRUK PEMBELIAN");
        System.out.println("===============================");
        System.out.println("Barang: "+ barang);
        System.out.println("Harga Satuan: "+ harga);
        System.out.println("Jumlah Beli: "+ jumlah);
        System.out.println("-----------------------------");
        System.out.println("Total Bayar: "+ total);
        System.out.println("Uang Bayar: "+ bayar);
        System.out.println("Kembalian: "+ kembalian);
        System.out.println("===============================");
    }    
}
