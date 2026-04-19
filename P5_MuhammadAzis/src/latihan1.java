package P5_MuhammadAzis.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        int[] data;

        try{
            System.out.print("Masukkan jumlah data: ");
            n = Integer.parseInt(br.readLine());

            data = new int[n];

            for(int i=0; i < n; i++){
                System.out.print("Data ke-"+ (i+1)+ ": ");
                data[i] = Integer.parseInt(br.readLine());
            }

            System.out.println("\nIsi data: ");
            for (int i = 0; i <n; i++){
                System.out.print(data[i]+ " ");
            }
            int max = data[0];
            int min = data[0];

            for (int i = 1; i < n; i++){
                if (data[i] > max){
                    max = data[i];
                }
                if (data[i] < min){
                    min = data[i];
                }
            }

            System.out.println("\nHasil: ");
            System.out.println("Nilai Maksimum = "+ max);
            System.out.println("Nilai Minimum = "+ min);

        } catch (IOException e){
            System.out.println("Terjadi kesalahan input!");
        }

    
    }
}
