public class Sampan extends TransportasiAir{

    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public void informasi() {
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah  " + this.jumlahKursi + " ditetapkan dengan biaya sebesar " + this.biaya);
    }

    public void berlayar() {
        System.out.println("Transportasi Air jenis Sampan edang berlayar menggunakan " + this.layar + " layar");
    }

    public void berlabuh() {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar) {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan 2 jangkar");
    }
}
