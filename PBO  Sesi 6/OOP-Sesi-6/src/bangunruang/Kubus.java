package bangunruang;

import bangundatar.Persegi;

public class Kubus extends Persegi implements Geometri {
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double getVolume() {
        return super.getLuas() * getSisi();
    }

    @Override
    public double getLuasPermukaan() {
        return 6 * super.getLuas();
    }
}
