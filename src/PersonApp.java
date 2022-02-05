public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Irwanto", "Ciledug"); // "Irwanto" dan "Ciledug" adalah diberikan karena kita membuat constructor yang membutuhkan parameter name dan address

        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.sayHello("Rina");

        Person person2 = new Person("Budi", "Jakarta");
        person2.sayHello("Ani");

        Person person3;
        person3 = new Person("Joko", "Cirebon");
        person3.sayHello("Marni");
    }
}
