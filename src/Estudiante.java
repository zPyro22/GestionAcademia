import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements Evaluable {
    private String programaAcademico;
    private List<Double> notas;

    public Estudiante(String id, String nombre, String correo, String programaAcademico) {
        super(id, nombre, correo);
        this.programaAcademico = programaAcademico;
        this.notas = new ArrayList<>();
    }

    public String getProgramaAcademico() { return programaAcademico; }

    // SOBRECARGA (Overloading) #1: Agregar una sola nota
    public void registrarNota(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notas.add(nota);
        } else {
            System.out.println("Error: La nota debe estar entre 0.0 y 5.0");
        }
    }

    // SOBRECARGA (Overloading) #2: Agregar múltiples notas con ponderación igual
    public void registrarNota(double nota1, double nota2, double nota3) {
        registrarNota(nota1);
        registrarNota(nota2);
        registrarNota(nota3);
    }

    @Override
    public double calcularNotaDefinitiva() {
        if (notas.isEmpty()) return 0.0;
        double suma = 0.0;
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
