public class Manusia {
    /**
     * Memahami super constructor
     * Tidak hanya untuk mengakses method atau field yang ada di parent class saja, namun keyword super
       juga bisa digunakan untuk mengakses constructor
     * Namun cara yang digunakan berbeda ya, untuk mengakses parent class constructor kita harus mengaksesnya
       di dalam class child constructor (jadi constructor dapat di panggi di dalam constructor saja)
     * Jika class parent tidak memiliki constructor yang tidak ada parameternya, artinya dia memiliki parameter
       di parent class-nya, maka di child class WAJIB mengakses constructor tersebut (jika tidak maka akan error)
     * Namun jika contructor itu tidak memiliki parameter maka di child juga tidak masalah jika tidak memanggil contructornya
     * Dan jika di parent ada lebih dari satu constructor, maka di chil-nya bebas mau manggil contructor yang mana,
       intinya di child harus manggil minimal satu contructor
     */

    String nama;
    String address;

    Manusia(String nama) {
        this.nama = nama;
    }

    Manusia(String nama, String address) {
        this.nama = nama;
        this.address = address;
    }

    void greeting(String name) {
        System.out.println("Hello " + name + ", nama saya adalah " + nama + " dan saya berlamat di " + address);
    }
}
