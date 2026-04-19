package P4_MuhammadAzis.src;

import java.util.Scanner;

public class latihan1{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("=== HASIL ===");
        System.out.print("Masukkan Jumlah Presensi: ");
        int presensi = input.nextInt();

        System.out.print("Masukkan Realisasi: ");
        int realisasi = input.nextInt();
        System.out.print("Masukkan Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan UTS: ");
        double uts = input.nextDouble();
        System.out.print("UAS: ");
        double uas = input.nextDouble();
        
        double nilaiPresensi = presensi/realisasi *10;
        double nilaiTugas = tugas*20/100;
        double nilaiUTS = uts*30/100;
        double nilaiUAS = uas*40/100;

        double total = nilaiPresensi + nilaiTugas + nilaiUTS + nilaiUAS;

        System.out.println("=== HASIL ===");
        System.out.println("Nilai Presensi: "+presensi);
        System.out.println("Hasil Realisasi: "+realisasi);
        System.out.println("Nilai Tugas: "+tugas);
        System.out.println("Nilai UTS: "+uts);
        System.out.println("Nilai UAS: "+uas);
        System.out.println("Nilai Total: "+total);
    }   
}