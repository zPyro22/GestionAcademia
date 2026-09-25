public abstract class Propiedad implements Comisionable {
    protected double valorVenta;

    public Propiedad(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - $" + valorVenta;
    }
}