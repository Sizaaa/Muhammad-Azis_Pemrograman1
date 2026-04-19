package P3_MuhammadAzis.src;

import java.util.Scanner;

public class latihan1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ketik nama anda: ");
        String nama = input.nextLine();
        System.out.print("Ketik Nilai Desimal: ");
        double nilaiAsli = input.nextDouble();
        
        int nilaiBulat = (int) nilaiAsli;

        System.out.println("Hello "+ nama);
        System.out.println("Nilai Asli: "+ nilaiAsli);
        System.out.println("Nilai Setengah Casting: "+ nilaiBulat);

        input.close();

    }
}