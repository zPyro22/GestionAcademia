import java.util.ArrayList;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    private Docente profesor;
    private ArrayList<Estudiante> listaEstudiantes;

    public Asignatura(String codigo, String nombre, int creditos, Docente profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

    public void mostrarReporte() {
        System.out.println("=== REPORTE DE MATERIA ===");
        System.out.println("Materia: " + nombre + " (" + codigo + ")");
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("---------------------------");

        for (Estudiante e : listaEstudiantes) {
            double def = e.calcularNotaDefinitiva();
            String estado = e.estaAprobado() ? "APROBADO" : "REPROBADO";
            System.out.println("- " + e.getNombre() + " | Definitiva: " + def + " | Estado: " + estado);
        }
    }
}