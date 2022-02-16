class Anak extends Manusia {
    Anak(String nama, String address) {
        super(nama, address);
    }

    void sayAnak(String nama) {
        System.out.println("Halo adek " + nama + ", nama saya adalah " + this.nama);
    }
}
