import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private List<Propiedad> ventas = new ArrayList<>();
    private double comisionExtra = 0;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }


    public void registrarVenta(Propiedad p) {
        ventas.add(p);
    }


    public void registrarVenta(Propiedad p, double bono) {
        ventas.add(p);
        comisionExtra += bono;
    }

    public double calcularComisionTotal() {
        double total = comisionExtra;
        for (Propiedad p : ventas) {
            total += p.calcularComision(p.getValorVenta());
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}