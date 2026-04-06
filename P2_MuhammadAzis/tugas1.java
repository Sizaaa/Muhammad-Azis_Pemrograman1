package P2_MuhammadAzis;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String namaLengkap, universitas, programStudi; int umur;

        System.out.println("===========================");
        System.out.println("        INPUT DATA DIRI");
        System.out.println("===========================");

        System.out.print("Nama Lengkap: ");
        namaLengkap = input.nextLine();
        System.out.print("Umur: ");
        umur = input.nextInt();
        input.nextLine();
        System.out.print("Universitas: ");
        universitas = input.nextLine();
        System.out.print("Program Studi: ");
        programStudi = input.nextLine();

        System.out.println("\n----------- HASIL DATA -----------");
        System.out.println("Nama Lengkap: "+ namaLengkap);
        System.out.println("Umur: "+ umur + "tahun");
        System.out.println("Universitas: "+ universitas );
        System.out.println("Program Studi: "+ programStudi);
        System.out.println("-------------------------------------");

        input.close();

    }    
}
