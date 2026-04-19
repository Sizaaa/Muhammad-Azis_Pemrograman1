package P5_MuhammadAzis.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        int jumlah;
        int[] data;

        System.out.print("Masukkan jumlah data: ");
        try{
            input = br.readLine();
            jumlah = Integer.parseInt(input);
        } catch (IOException e){
            System.out.println("Terjadi kesalahan input!");
            return;
        }
        data = new int[jumlah];

        System.out.println("\n=== Input Data ===");
        for (int i =0; i < jumlah; i++){
            System.out.print("Data ke-"+ (i+1)+ " : ");
            try{
                input = br.readLine();
                data[i] = Integer.parseInt(input);
            } catch ( IOException e){
                System.out.println("Input Error!");
            }
        }

        System.out.println("\n=== Isi Array ===");
        for (int i = 0; i < jumlah; i++){
            System.out.println("Index "+ i + " = "+ data[i]);
        }
        
        int total = 0;
        for (int i = 0; i < jumlah; i++){
            total += data[i];
        }
        System.out.println("\n TotaL SEMUA DATA = "+ total);
    }
}
