public class Laptop extends Perangkat {
    protected boolean webcam;
    protected String stat;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if (webcam == true) {
            this.stat = "memiliki";
        } else {
            this.stat = "tidak memiliki";
        }
        System.out.printf(
                "\nLaptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %3.2f Ghz. Selain itu laptop ini %s webcam %n",
                drive, ram, processor, stat);
    }

    public void bukaGame(String nama_game) {
        System.out.printf("Laptop berhasil membuka game %s %n", nama_game);
    }

    public void kirimEmail(String email) {
        System.out.printf("Laptop berhasil mengirim Email ke %s %n", email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.printf("Laptop berhasil mengirim Email ke %s dan ke %s %n", email1, email2);
    }
}
