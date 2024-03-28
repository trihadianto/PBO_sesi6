import bangundatar.*;
import bangunruang.*;

public class App {
    public static void main(String[] args) {
        System.out.println("penggunaan untuk bangun datar");
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga samaSisi = new SegitigaSamaSisi(6, 0);
        SegitigaSamaKaki samaKaki = new SegitigaSamaKaki(4, 5, 0);
        Segitiga sembarang = new SegitigaSembarang(3, 4, 5, 6, 7);

        System.out.println("Luas persegi: " + persegi.getLuas());
        System.out.println("Keliling persegi: " + persegi.getKeliling());
        System.out.println("Luas lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.getKeliling());
        System.out.println("Luas segitiga sama sisi: " + samaSisi.getLuas());
        System.out.println("Keliling segitiga sama sisi: " + samaSisi.getKeliling());
        System.out.println("Luas segitiga sama kaki: " + samaKaki.getLuas());
        System.out.println("Keliling segitiga sama kaki: " + samaKaki.getKeliling());
        System.out.println("Luas segitiga sembarang: " + sembarang.getLuas());
        System.out.println("Keliling segitiga sembarang: " + sembarang.getKeliling());

        System.out.println("penggunaan untuk bangun ruang");
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 5, 6);
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(5, 8);

        System.out.println("Volume kubus: " + kubus.getVolume());
        System.out.println("Luas permukaan kubus: " + kubus.getLuasPermukaan());
        System.out.println("Volume balok: " + balok.getVolume());
        System.out.println("Luas permukaan balok: " + balok.getLuasPermukaan());
        System.out.println("Volume bola: " + bola.getVolume());
        System.out.println("Luas permukaan bola: " + bola.getLuasPermukaan());
        System.out.println("Volume tabung: " + tabung.getVolume());
        System.out.println("Luas permukaan tabung: " + tabung.getLuasPermukaan());
    }
}
