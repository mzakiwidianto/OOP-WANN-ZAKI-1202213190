public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Samsung", 8, 4.7f);
        perangkat.informasi();

        Handphone handphone = new Handphone("WD", 4, 1.8f, false);
        handphone.informasi();
        handphone.telfon(628778551);
        handphone.kirimSMS(628123564);
        handphone.kirimSMS(626718248, 628123823);

        Laptop laptop = new Laptop("Crucial", 8, 5.6f, true);
        laptop.informasi();
        laptop.bukaGame("Counter-Strike");
        laptop.kirimEmail("aspelogitech@gmail.com");
        laptop.kirimEmail("amarpanadol@gmail.com", "alifoskadon@gmail.com");
    }
}
