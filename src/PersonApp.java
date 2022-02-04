public class PersonApp {
    /**
     * Objek
     * Adalah hasil instansiasi dari class
     * Lebih sederhananya adalah kita buat sesuatu yang merujuk ke class-nya, bisa memiliki variabel dari
       classnya dan bisa mengakses methodnya
     * Untuk membuat objeck kita bisa gunakan kata kunci "new" diikuti nama classnya
     */

    public static void main(String[] args) {
        var person1 = new Person(); // cara pertama membuat object

        Person person2 = new Person(); // cara kedua membuat object

        Person person3; // cara ketiga membuat object
        person3 = new Person();
    }
}
