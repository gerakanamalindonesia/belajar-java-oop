public class MakhlukHidupApp {
    public static void main(String[] args) {
        // dari class MakhlukHidup
        var manusia = new MakhlukHidup();
        System.out.println(manusia.jumlahKaki());

        // dari class Hewan
        var hewan = new Hewan();
        System.out.println(hewan.jumlahKaki());
        System.out.println(hewan.getJumlahKaki());
        hewan.identitas();
    }
}
