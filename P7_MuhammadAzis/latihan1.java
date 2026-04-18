package P7_MuhammadAzis;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double presensi ;
        int nilaiAkhir;
        

        System.out.println("=== Informasi ========");
        System.out.print("Masukkan Presensi: ");
        presensi = input.nextDouble();
        System.out.print("Masukkan Nilai Akhir: ");
        nilaiAkhir = input.nextInt();
        System.out.println("======================");

        double batasPresensi = 75;
        double totalPresensi = presensi/21*100;
        // System.out.println(totalPresensi);

        if(totalPresensi >= batasPresensi ){
            System.out.println("Nilai: "+ nilaiAkhir);

            if (nilaiAkhir >= 80){
                System.out.println("A");
            } else if (nilaiAkhir >= 70) {
                System.out.println("B");
            } else if (nilaiAkhir >= 60 ){
                System.out.println("C");
            } else if (nilaiAkhir >= 55) {
                System.out.println("D");
            } else if (nilaiAkhir < 55){
                System.out.println("E");
            } else {
                System.out.println("");
            }
                
        } else if (nilaiAkhir >= 55) {
            System.out.println("Presensi anda tidak memenuhi 75%" );
            System.out.println("Grade D");
        } else {
            System.out.println("Nilai dan Presensi tidak memenuhi syarat");
            System.out.println("Grade E");
        }
    }
}
