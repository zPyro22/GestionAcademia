public class Casa extends Propiedad {
    public Casa(double valorVenta) {
        super(valorVenta);
    }

    @Override
    public double calcularComision(double valorVenta) {
        return valorVenta * 0.03;
    }
}