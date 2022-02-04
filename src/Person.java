class Person {
    /**
     * Method
     * Selain attribute, kita bisa menambahkan method ke dalam object
     * Method itu bisa dibilang fungsi yang kita deklarasikan di class, kemudian bisa kita panggil pada saat membuat objek
     */

    String name;
    String address;
    final String district = "Gunungkidul";

    // membuat method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", nama saya adalah " + name + ". Saya beralamat di " + address + ", dan saya berasal dari " + district);
    }

}
