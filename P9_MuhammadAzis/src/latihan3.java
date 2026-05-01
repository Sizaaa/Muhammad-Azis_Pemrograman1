package P9_MuhammadAzis.src;

abstract class Kendaraan {
    public void nyalakanMesin(){
        System.out.println(("Mesin dinyalakan..."));
    }

    public void isiBensin(){
        System.out.println("Kendaraan sedang diisi bensin...");
    }
    
    public abstract void berjalan();
}

class Mobil extends Kendaraan{
    public void berjalan(){
        System.out.println("Mobil berjalan menggunakan empat roda");
    }
}

class SepedaMotor extends Kendaraan {
    public void berjalan(){
        System.out.println("Sepeda motor berjalan menggunakan dua roda");
    }
}

class TempatServis{
    protected String namaTempat;
    protected String alamatTempat;
    protected String nomorTelepon;
    protected String kategori;

    public TempatServis(String namaTempat, String alamatTempat, String nomorTelepon, String kategori){
        this.namaTempat = namaTempat;
        this.alamatTempat = alamatTempat;
        this.nomorTelepon = nomorTelepon;
        this.kategori = kategori;
    }

    public String toString(){
        return "Nama Tempat: " + namaTempat + "\nAlamat: " + alamatTempat + "\nNomor Telepon: " + nomorTelepon + "\nKategori: " + kategori;
    }
}

class ServisMobil extends TempatServis{
    public ServisMobil(String namaTempat, String alamatTempat, String nomorTelepon, String kategori){
        super(namaTempat, alamatTempat, nomorTelepon, kategori);
    }
}

class ServisMotor extends TempatServis{
    public ServisMotor(String namaTempat, String alamatTempat, String nomorTelepon, String kategori){
        super(namaTempat, alamatTempat, nomorTelepon, kategori);
    }
}

public class latihan3{
    public static void main(String[] args) {
        Mobil avanza = new Mobil();
        SepedaMotor beat = new SepedaMotor();

        System.out.println("=== Data Kendaraan Mobil ===");
        avanza.nyalakanMesin();
        avanza.isiBensin();
        avanza.berjalan();

        System.out.println("\n=== Data Kendaraan Motor ===");
        beat.nyalakanMesin();
        beat.isiBensin();
        beat.berjalan();

        ServisMobil bengkel1 = new ServisMobil(
            "Auto Care Pamulang",
            "Jl. Raya Pamulang",
            "021123456",
            "Servis Mobiil"
        );

        ServisMotor bengkel2 = new ServisMotor(
            "Motor Service Center",
            "Jl. Puspitek Raya",
            "021654321",
            "Servis Motor"
        );
        
        System.out.println("\n=== Data Tempat Servis ===");
        System.out.println(bengkel1);
        System.out.println();
        System.out.println(bengkel2);
    }
}