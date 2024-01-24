public class Triangolo extends Forma{
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza){
        this.altezza=altezza;
        this.base=base;
    }

    @Override
    public String toString() {
        return "base= " + base +
                ", altezza= " + altezza;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza)/2;
    }

    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }
}
