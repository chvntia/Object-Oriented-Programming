public class Kapal extends TransportasiAir{

    protected String mesin;



    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    public void informasi() {
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah  " + this.jumlahKursi + " ditetapkan dengan biaya sebesar " + this.biaya);
    }

    public void berlayar() {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan " + this.mesin + " dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai menggunakan " + this.mesin + "dengan kecepatan tabil di kisaran 20 knot");
    }

    public void berlabuh() {
        System.out.println("Transportasi Air jenis Kapal berlabuh di");
    }

}
 
