public class Main {
    public static void main(String[] args) {
        Perangkat p1 = new Perangkat("Macbook Air  M2", "M2", 32, 2.4F); // F Is an Identifier to it value that makes the value known as Float
        p1.informasi();

        System.out.println();

        Handphone h1 = new Handphone("iPhone 13 Pro", "Apple M1", 16 ,2.4F, true);
        h1.informasi();
        h1.call(123);
        h1.sms(123);
        h1.sms(123, 321);

        System.out.println();

        Laptop l1 = new Laptop("Macbook Air M1", "M1", 16, 4.2F, true);
        l1.informasi();
        l1.openGames("Minecraft");
        l1.sendEmail("chyntiaoktavia@gmail.com");
        l1.sendEmail("chyntiaoktavia2410@gmail.com" , "chyntiaoktaviaz@student.telkomuniversity.ac.id");
    }
}



