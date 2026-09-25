import java.util.ArrayList;

public class Estudiante extends Persona implements Evaluable {
    private String carrera;
    private ArrayList<Double> notas;

    public Estudiante(String id, String nombre, String correo, String carrera) {
        super(id, nombre, correo);
        this.carrera = carrera;
        this.notas = new ArrayList<>();
    }

    public void registrarNota(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            notas.add(nota);
        } else {
            System.out.println("Nota invalida");
        }
    }

    public void registrarNota(double n1, double n2, double n3) {
        registrarNota(n1);
        registrarNota(n2);
        registrarNota(n3);
    }

    @Override
    public double calcularNotaDefinitiva() {
        if (notas.isEmpty()) return 0.0;

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    @Override
    public boolean estaAprobado() {
        return calcularNotaDefinitiva() >= 3.0;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }
}