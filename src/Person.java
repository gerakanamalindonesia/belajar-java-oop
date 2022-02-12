class Person {
    /**
     * Memahami kata kunci this
     * Ketika kita membuat kode di dalam block constructor atau method di dalam class, kita
       bisa menggunakan kata kunci "this" untuk mengakses object saat ini
     * Misal kadang kita butuh mengakses sebauh field yang namanya sama dengan parameter method,
       hal ini tidak akan bisa dilakukan jika langsung menyebut nama field, dalam arti lain akan
       terjadi variabel shadowing. Namun jika terpaksa ada nama yang sama maka kita bisa
       mengakses nama field tersebut dengan meggunakan "this"
     * This tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa
       digunakan untuk mengakses method
     * Dan tentu saja this ini bisa digunakan untuk mengatasi masalah variabel shadowing
     */

    String name;
    String address;
    final String district = "Gunungkidul";

    Person(String name, String address) {
        this.name = name; // this.name ini menunjukkan kalau nilai dari fiel name di class sama denga nilai parameter name di function
        this.address = address;
    }

    void sayHello() {
        this.sayHello("Bos");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name + ", and i live in " + this.address);
    }
}
