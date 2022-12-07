public class MainApp {
    public static void MainApp(String[] args) {
        TransportasiAir p1 = new TransportasiAir(4, 2000);
        p1.informasi();
        p1.berlayar();
        p1.berlabuh();

        System.out.println();

        Sampan h1 = new Sampan(1, 10000, 5);
        h1.informasi();
        h1.berlayar();
        h1.berlabuh();
        h1.berlabuh(10);

        System.out.println();

        Kapal l1 = new Kapal(2, 50000, "Diesel");
        l1.informasi();
        l1.berlayar();
        l1.berlayar(80);
        l1.berlabuh();


        System.out.println();
    }
} 

