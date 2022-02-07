public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Irwanto", "Ciledug"); // constructor dua parameter

        System.out.println(person1.name);
        System.out.println(person1.address);
        person1.sayHello("Rina");

        Person person2 = new Person("Budi", "Jakarta"); // constructor satu parameter
        person2.address = "Jakarta";
        person2.sayHello("Ani");

        /*
        Person person3;
        person3 = new Person(); // constuctor tanpa parameter
        person3.name = "Joko";
        person3.address = "Cirebon";
        person3.sayHello("Marni");
        */
    }
}
