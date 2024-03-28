package bangundatar;

public abstract class Segitiga implements Shape {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public abstract double getLuas();

    @Override
    public abstract double getKeliling();
}
