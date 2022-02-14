public class MakhlukHidup {
    /**
     * Super Keyword
     * Sebelumnya kita telah berlajar tentang this, yang berfungsi untuk mengakses object saat ini (digunakan untuk mengatasi masalah shadowing)
     * Super juga memiliki fungsi yang sama, hanya saja dia berfungsi antara parent dan child
     * Jadi dengan super kita bisa mengakses method maupun attribute yang ada di parent
     * Lebih jelasnya adalah ketika kita melakukan override sebuah method dan ternyata kita mau mengakses method yang ada di parent maka kita bisa menggunakan super
     * Tidak hanya method saja ya, namun attribute juga bisa kita kenai super
     */

    String nama = "Makhluk Hidup";
    String jenis = "Belum didefinisikan";

    int jumlahKaki() {
        return 2;
    }
}
