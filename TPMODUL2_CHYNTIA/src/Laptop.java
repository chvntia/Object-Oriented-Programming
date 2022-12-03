public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String name, String drive, int ram, float processor, boolean webcam) {
        super(name, drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        super.informasi();
        if (webcam) {
            System.out.println("Memiliki Fingerpirnt");
        } else {
            System.out.println("Tidak Memiliki Fingerprint");
        }
    }

    public void openGames(String gameName) {
        System.out.println("Laptop " +name+ " Open Game " +gameName);
    }

    public void sendEmail(String email) {
        System.out.println("laptop " + this.name + " Send Email to " +email);
    }

    // Oveloading method sms
    public void sendEmail(String email, String email2) {
        System.out.println("Laptop " + this.name + " Send Email to " +email + " and " +email2);
    }
}
