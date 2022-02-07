class Person {
    /**
     * Variabek Shadowing
     * Variabel shadowing adalah kejadian ketika kita membuat
       nama variabel dengan nama yang sama di scope yang menutupi
       variabel dengan nama yang sama di scope di atasnya
     * Ini biasa terjadi seperti kita membuat nama parameter di method
       sama dengan nama field di class
     * Saat terjadi variabel shadowing maka secara otomatis variabel
       di atasnya tidak bisa diakses
     */

    String name;
    String address;
    final String district = "Gunungkidul";

    Person(String name, String address) {
        name = name; // name di ( = name ) ini ngambil di parameter, bukan di field si atasnya, sehingga name tidak akan berubah
        address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", nama saya adalah " + name + ". Saya beralamat di " + address + ", dan serasal dari " + district);
    }

    /*
    // membuat constructor
    Person(String paramName, String paramAddres) {
        name = paramName;
        address = paramAddres;
    }

    Person(String paramName) {
        // name = paramName;
        this(paramName, null); // ini memanggi constructor Person di atas, dan karena di constructor ini tidak ada param address maka kita buat parameter keduanya null
    }

    Person() {
        this(null); // ini memanggi constructor Person di atas, dan karena di constructor ini tidak ada param name maka kita buat parameternya null
    }


    // membuat method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", nama saya adalah " + name + ". Saya beralamat di " + address + ", dan serasal dari " + district);
    }
    */

}
