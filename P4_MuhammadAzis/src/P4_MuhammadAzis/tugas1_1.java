package P4_MuhammadAzis;

public class tugas1_1 {
    public static void main(String[] args){
        

        double totalMakan = 0;
        double totalTransport = 0;
        double totalBelanja = 0;
        double totalSemua = 0;

        System.out.println("=== DATA PENGELAURAN 7 HARI ===");

        for (int i =1; i <=7; i++){

            double makan = 20000;
            double transport = 10000;
            double belanja = 50000;

            double totalHarian = makan + transport + belanja;

            totalMakan += makan;
            totalTransport += transport;
            totalBelanja += belanja;
            totalSemua += totalHarian;

            System.out.println("\nHari ke "+i);
            System.out.println("Makan: "+ makan);
            System.out.println("Transport: "+ transport);
            System.out.println("Belanja: "+ belanja);
            System.out.println("Total: "+ totalHarian);
            System.out.println("--------------------");

            System.out.println("Total sampai hari ke "+ i +" : "+ totalSemua);
        }
        
        double persenMakan = (totalMakan/totalSemua)*100;
        double persenTransport = (totalTransport/totalSemua)*100;
        double persenBelanja = (totalBelanja/totalSemua)*100;

        System.out.println("\n=== TOTAL 7 HARI ===");
        System.out.println("Total Makan: "+ totalMakan);
        System.out.println("Total Transport: "+ totalTransport);
        System.out.println("Total Belanja: "+ totalBelanja);
        System.out.println("Total Semua: "+ totalSemua);

        System.out.println("\n=== PERSENTASE ===");
        System.out.printf("Makan: %.2f%%\n", persenMakan);
        System.out.printf("Transport: %.2f%%\n", persenTransport);
        System.out.printf("Belanja: %.2f%%\n", persenBelanja);
    }
}
