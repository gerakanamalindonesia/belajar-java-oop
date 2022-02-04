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
        person1.name = "Irwanto"; // menagakses field/attribute di class
        person1.address = "Ciledug";
        // person1.ditrict = "Bantul"; // jangan lakukan ini ya, karena pasti error (final tidak bisa diubah datanya)

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.ditrict);
    }
}
