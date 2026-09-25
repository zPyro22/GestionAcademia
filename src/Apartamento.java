public class Apartamento extends Propiedad {
    public Apartamento(double valorVenta) {
        super(valorVenta);
    }

    @Override
    public double calcularComision(double valorVenta) {
        return valorVenta * 0.025;
    }
}