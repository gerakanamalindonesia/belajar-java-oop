public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person(); // cara pertama membuat object
        person1.name = "Irwanto"; // menagakses field/attribute di class
        person1.address = "Ciledug";
        // person1.ditrict = "Bantul"; // jangan lakukan ini ya, karena pasti error (final tidak bisa diubah datanya)

        person1.sayHello("Rina Pratama");
    }
}
