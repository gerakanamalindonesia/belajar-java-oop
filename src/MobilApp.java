public class MobilApp {
    public static void main(String[] args) {
        // membuat object dari class Kendaraan (parent class)
        var kendaraan = new Kendaraan();
        kendaraan.name = "Pajero Sport";
        kendaraan.sayMerk("Irwanto");

        // membuat object dari class Mobil (child class) yang merupakan turunan dari class Kendaraan
        var mobil = new Mobil();
        mobil.name = "Alphard";
        mobil.sayMerk("Rina"); // karena sayMerk didefinisikan ulang di child, maka method child-lah yang akan dipakai

        // membuat object dari child class
        var motor = new Motor();
        motor.name = "Vario";
        motor.sayMerk("Pukis"); // karena sayMerk didefinisikan ulang di child, maka method child-lah yang akan dipakai
    }
}
