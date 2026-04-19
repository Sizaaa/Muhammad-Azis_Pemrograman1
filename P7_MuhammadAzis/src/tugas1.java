package P7_MuhammadAzis.src;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== HASIL ===");
        System.out.print("Masukkan Jumlah Presensi: ");
        int presensi = input.nextInt();

        System.out.print("Masukkan Realisasi: ");
        int realisasi = input.nextInt();
        System.out.print("Masukkan Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan UAS: ");
        double uas = input.nextDouble();

        double nilaiPresensi = presensi / realisasi * 10;
        double nilaiTugas = tugas * 20/100;
        double nilaiUTS = uts * 30/100;
        double nilaiUAS = uas * 40/100;

        double total = nilaiPresensi + nilaiTugas + nilaiUTS + nilaiUAS;

        System.out.println("=== HASIL ===");
        System.out.println("Nilai Presensi: "+ presensi);
        System.out.println("Nilai Realisasi: "+ realisasi);
        System.out.println("Nilai Tugas: "+ tugas);
        System.out.println("Nilai UTS: "+ uts);
        System.out.println("Nilai UAS: "+ uas);
        System.out.println("Nilai Total: "+ total);


        double presensi2;
        int nilaiAkhir;

        System.out.println("======== Informasi ==========");
        System.out.print("Masukkan Presensi: ");
        presensi2 = input.nextDouble();
        System.out.print("Masukkan Nilai Akhir: ");
        nilaiAkhir = input.nextInt();
        System.out.println("=============================");

        double batasPresensi = 75;
        double totalPresensi = presensi2 / 21*100;

        if(totalPresensi >= batasPresensi){
            System.out.println("Nilai: "+ nilaiAkhir);

            if(nilaiAkhir>= 80){
                System.out.println("A");
            } else if (nilaiAkhir >= 70){
                System.out.println("B");
            } else if (nilaiAkhir >= 60){
                System.out.println("C");
            } else if (nilaiAkhir >= 55){
                System.out.println("D");
            } else if (nilaiAkhir < 55){
                System.out.println("E");
            } else {
                System.out.println("");
            }
        } else if (nilaiAkhir >= 55){
            System.out.println("Presensi anda tidak memenuhi 75%");
            System.out.println("Grade D");
        } else {
            System.out.println("Nilai dan presensi tidak memenuhi syarat");
            System.out.println("Grade E");
        }
    }    
}
