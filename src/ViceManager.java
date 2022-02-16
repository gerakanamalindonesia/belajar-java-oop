public class ViceManager extends Manager {
    ViceManager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Halo " + name + ", saya adalah Vice Manager " + this.name);
    }
}
