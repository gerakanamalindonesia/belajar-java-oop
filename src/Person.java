class Person {
    /**
     * Constructor
     * Constructor adalah method yang pertama kali dijalankan saat pertama kali object dibuat
     * Mirip seperti di metod, kita bisa memberi parameter pada constructor
     * Nama constructor harus sama dengan nama class, dan tidak membutuhkan kara kuci void serta tidak mengembalikan value
     * Jika kita memberikan parameter di constructornya, maka saat membuat objek kita WAJIB mengisi parameternya ya
     */

    String name;
    String address;
    final String district = "Gunungkidul";

    // membuat constructor
    Person(String paramName, String paramAddres) {
        name = paramName;
        address = paramAddres;
    }

    // membuat method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", nama saya adalah " + name + ". Saya beralamat di " + address + ", dan saya berasal dari " + district);
    }

}
