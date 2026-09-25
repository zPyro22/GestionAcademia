public class Lote extends Propiedad {
    public Lote(double valorVenta) {
        super(valorVenta);
    }

    @Override
    public double calcularComision(double valorVenta) {
        return valorVenta * 0.04;
    }
}