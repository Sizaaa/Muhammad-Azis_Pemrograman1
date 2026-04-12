package P6_MuhammadAzis;

public class latihan1 {
    public static void main(String[] args){
        int jam = 7;
        int menit = 20;

        if(jam < 7) {
            System.out.println("Anda boleh masuk (tepat waktu)");
        } else if(jam == 7 && menit <= 30) {
            System.out.println("Anda boleh masuk, tapi terlambat");
        } else {
            System.out.println("Anda tidak boleh masuk kelas");
        }
        
    }
}
