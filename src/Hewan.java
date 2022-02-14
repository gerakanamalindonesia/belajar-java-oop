public class Hewan extends MakhlukHidup {
    String nama = "Si kucing";
    String jenis = "Hewan Rumahan";

    void identitas() {
        System.out.println("Nama makhluk : " + super.nama + ", jenis : " + super.jenis); // super di sini akan mengambil variabel di parent
    }

    // melakukan override method dari parent class
    int jumlahKaki() {
        return 4;
    }

    int getJumlahKaki() {
        return super.jumlahKaki();
    }
}
