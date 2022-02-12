public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Irwanto", "Ciledug");
        /**
         * Di atas kita membuaty object dari class Person
         * Di dalam class person kita memberi nilai constructor yaitu Irwanto dan Ciledug
         * Jika diliat constractor Person memerlukan parameter name dan address, sehingga Irwanto dan Ciledug akan mengisi itu
         * Karena nama field dan name parameternya sama, maka untuk memberitahu bahwa field name sama dengan parameter name dipakailah this di situ
         */

        System.out.println(person1.name);
        System.out.println(person1.address);
        person1.sayHello("Rina");

        Person person2 = new Person("Budi", "Jakarta");
        person2.address = "Bandung"; // ini akan me-replace constructor "Jakarta" menjadi "Bandung"
        person2.sayHello("Ani");
    }
}
