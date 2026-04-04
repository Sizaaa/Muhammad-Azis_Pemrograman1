package P4_MuhammadAzis;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        double makan, transport, belanja;
        double totalMakan = 0, totalTransport = 0, totalBelanja = 0;
        double totalSemua = 0;
        
        System.out.println("=== INPUT PENGELUARAN 7 HARI ===");
        
        System.out.println("\nLAPORAN PENGELUARAN HARIAN");
        System.out.println("==========================================================");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n",
            "Hari", "Makan", "Transport", "Belanja", "Total");
        System.out.println("----------------------------------------------------------");

        for (int i = 1; i <= 7; i++){
            System.out.println("\nHari ke "+i);
            System.out.print("Masukkan biaya makan: ");
            makan = input.nextDouble();
            System.out.print("Masukkan biaya transport: ");
            transport = input.nextDouble();
            System.out.print("Masukkan biaya belanja: ");
            belanja = input.nextDouble();

            double totalHarian = makan + transport + belanja;
            double persenMakanHarian = (makan/totalHarian)*100;
            double persenTransportHarian = (transport/totalHarian)*100;
            double persenBelanjaHarian = (belanja/totalHarian)*100;
            
            totalMakan += makan;
            totalTransport += transport;
            totalBelanja += belanja;
            totalSemua += totalHarian;

            System.out.printf("%-10s Rp %,10.0f Rp %,10.0f Rp %,10.0f Rp %,10.0f\n", 
           "Hari ke " + i, makan, transport, belanja, totalHarian);
            System.out.printf("Persentase -> Makan: %.2f%% | Transport: %.2f%% | Belanja: %.2f%%\n ",
                persenMakanHarian, persenTransportHarian, persenBelanjaHarian);

        }

        System.out.println("========================================================");
        System.out.printf("%-10s Rp %,10.0f Rp %,10.0f Rp %,10.0f Rp %,10.0f\n",
            "TOTAL", totalMakan, totalTransport, totalBelanja, totalSemua);

        double persenMakan = (totalMakan/totalSemua)*100;
        double persenTransport = (totalTransport/totalSemua)*100;
        double persenBelanja = (totalBelanja/totalSemua)*100;

        System.out.println("\n==== PERSENTASE ===");
        System.out.printf("Makan: %.2f%%\n", persenMakan);
        System.out.printf("Transport:  %.2f%%\n", persenTransport);
        System.out.printf("Belanja: %.2f%%\n", persenBelanja);
        
    }
}

