package P6_MuhammadAzis.src;

public class latihan1 {
    private double tinggi;
    private double alas;

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getAlas(){
        return alas;
    }
    public double getLuas(){
        return 0.5 * tinggi * alas;
    }
    public static void main(String[] args){
        latihan1 S[] = new latihan1[2];
        int i;

        S[0] = new latihan1();
        S[1] = new latihan1();

        S[0].setTinggi(12.0);
        S[0].setAlas(8.0);

        S[1].setTinggi(11.23);
        S[1].setAlas(7.7);

        for(i = 0; i < 2; i++){
            System.out.println("Segitiga ke-"+ (i+1));
            System.out.println("Tinggi = "+ S[i].getTinggi());
            System.out.println("Alas = "+ S[i].getAlas());
            System.out.println("Luas = "+ S[i].getLuas());
            System.out.println();
        }
    }
}
