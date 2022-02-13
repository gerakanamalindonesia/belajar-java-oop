class Kendaraan {
    /**
     * Inheritance / Pewarisan
     * Inheritance adalah kemampuan untuk menurunkan sebuah class ke class lain
     * Dalam artian, kita bisa membuat class parent dan class child yang menjadi turunan dari parent
     * Pada class child hanya bisa punya satu class parent, sedangkan class parent bisa punya banyak class child
     * Saat sebuah class diturunkan, maka semua field dan method yang ada di class parent secara
       otomatis akan dimiliki oleh class child
     * Untuk melakukan pewarisan, di class child kita harus menggunakan kata kunci "extends" lalu
       diikuti dengan nama class parent nya
     */
    String name;

    void sayMerk(String name) {
        System.out.println("Halo " + name + ", ini adalah kendaraan merk " + this.name);
    }
}
