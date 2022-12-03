public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String name, String drive, int ram, float processor, boolean fingerprint) {
        super(name, drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        super.informasi();

        if (fingerprint) {
            System.out.println("Memiliki Fingerpirnt");
        } else {
            System.out.println("Tidak Memiliki Fingerprint");
        }
    }

    public void call(int phoneNumber) {
        System.out.println("Handphone " + this.name + " Make Call to " +phoneNumber);
    }

    public void sms(int phoneNumber) {
        System.out.println("Handphone " + this.name + " Send Message to " +phoneNumber);
    }

    // Oveloading method sms
    public void sms(int phoneNumber, int phoneNumber2) {
        System.out.println("Handphone " + this.name + " Send Message to " +phoneNumber + " and " +phoneNumber2);
    }


}
