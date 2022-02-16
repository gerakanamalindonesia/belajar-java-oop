public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Temo"); // bisa juga kok kita make var employee = new Employee();
        employee.sayHello("Rani");

        employee = new Manager("Dani", "Telo Tech");
        employee.sayHello("Fajarwati"); // sebenarnya employee ini tipenya adalah Employee, namun karen diset ke Manager (employee = new Manager()) maka saat mengakses sayHello() hasilnya adalah punya Manager yang akan dieksekusi

        employee = new ViceManager("Irni");
        employee.sayHello("Dwi Kuswanti"); // sebenarnya employee ini tipenya adalah Employee, namun karen diset ke Manager (employee = new ViceManager()) maka saat mengakses sayHello() hasilnya adalah punya ViceManager yang akan dieksekusi

        System.out.println("");

        sayHello(new Employee("Irwanto"));
        sayHello(new Manager("Wibowo"));
        sayHello(new ViceManager("Mantabb"));
    }

    /**
     * Method polymorphism
     * Selain di class, kita juga bisa memanfaatkan polimarfisme di method
     * Jadi kita bikin satu aja method kemudian parametrnya adalah class paling atas
     * Sehingga saat kita panggil, tinggal kita kasih object yang mau kita pakai (misal sayHello(new Employee()), sayHello(new Manager()), sayHello(new ViceManager()))
     */
    static void sayHello(Employee employee) { // parameter nya adalah class paling atas ya (karena kasus kita adalah Employee maka kita kasih nama parameternya Employee)
        System.out.println("Hello " + employee.name);
    }
}
