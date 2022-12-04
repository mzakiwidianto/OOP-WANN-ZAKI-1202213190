public class Handphone extends Perangkat {
    protected boolean fingerprint;
    protected String stat;

    public Handphone(String drive, int ram, float Processor, boolean fingerprint) {
        super(drive, ram, Processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        if (fingerprint == true) {
            this.stat = "memiliki";
        } else {
            this.stat = "tidak memiliki";
        }
        System.out.printf(
                "\nHandphone ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %3.2f Ghz. Selain itu handphone ini %s fingerprint %n",
                drive, ram, processor, stat);
    }

    public void telfon(int no_hp) {
        System.out.printf("Handphone berhasil menyambungkan telfon ke No %d %n", no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.printf("Handphone berhasil mengirim SMS ke No %d %n", no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.printf("Handphone berhasil mengirim SMS ke No %d dan ke No %d %n", no_hp1, no_hp2);
    }
}
