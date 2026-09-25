import java.util.ArrayList;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    private Docente docenteAsignado;
    private List<Estudiante> estudiantesInscritos;

    public Asignatura(String codigo, String nombre, int creditos, Docente docenteAsignado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docenteAsignado = docenteAsignado;
        this.estudiantesInscritos = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) {
        estudiantesInscritos.add(e);
    }

    public void mostrarReporte() {
        System.out.println("==================================================");
        System.out.println("Asignatura: " + nombre + " (" + codigo + ")");
        System.out.println("Docente: " + docenteAsignado.getNombre());
        System.out.println("--------------------------------------------------");
        System.out.println("Estudiantes inscritos:");
        for (Estudiante e : estudiantesInscritos) {
            double def = e.calcularNotaDefinitiva();
            String estado = e.estaAprobado() ? "APROBADO" : "REPROBADO";
            System.out.println("- " + e.getNombre() + " | Definitiva: " + String.format("%.2f", def) + " | Estado: " + estado);
        }
        System.out.println("==================================================");
    }
}