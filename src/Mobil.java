class Mobil extends Kendaraan {
    /**
     * Method Overriding
     * Method overriding adalah kemampuan mendeklarasikan ulang method di child class,
     * Misal di parent ada method sayMerk(), maka kita bisa mendeklarasikan ulang method sayMerk() di chlid
     * Penulisannya harus sama ya (return, parameter, nama method), yang bisa dimodif hanya isinya saja
     * Saat kita melakukan proses overriding tersebut, secara otomatis saat kita membuat object dari child
       class maka method di parent tidak akan bisa dipakai lagi, karena sudah di override oelh child class-nya
     */
    void sayMerk(String name) {
        System.out.println("Halo " + name + ", ini adalah mobil merk " + this.name);
    }
}
