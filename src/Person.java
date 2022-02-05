class Person {
    /**
     * Constructor Overloading
     * Sama seperti di method / function, kita bisa melakukan overloading
     * Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda
     */

    /**
     * Sama juga seperti di function, coinstructor bisa memanggil constructor lain
     * Hal ini memudahkan saat kita butuh menginisialisasi data degan berbagai kemungkinan
     * Cara memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this
     */

    String name;
    String address;
    final String district = "Gunungkidul";

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
        System.out.println("Hello " + paramName + ", nama saya adalah " + name + ". Saya beralamat di " + address + ", dan saya berasal dari " + district);
    }

}
