package P6_MuhammadAzis.src;

public class latihan2 {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getLuas(){
        return panjang * lebar;
    }
    public double getKeliling(){
        return 2 * (panjang + lebar);
    }
    public static void main(String[] args){
        latihan2 pp1 = new latihan2();
        
        pp1.setPanjang(10);
        pp1.setLebar(5);

        System.out.println("Panjang = "+ pp1.getPanjang());
        System.out.println("Lebar = "+ pp1.getLebar());
        System.out.println("Luas = "+ pp1.getLuas());
        System.out.println("Keliling = "+ pp1.getKeliling());
    }
}
