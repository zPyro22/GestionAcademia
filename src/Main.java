import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Docente doc1 = new Docente("D1", "Stevens Correa", "StevensCorrea@gmail.com", "Software");
        Estudiante est1 = new Estudiante("E1", "Henrry Tarazona", "tarazonahenrry2@gmail.com", "Software");
        Estudiante est2 = new Estudiante("E2", "Ramiro Urrutia", "R.Urrutia@gmail.com", "Software");

        Estudiante est1 = new Estudiante("E201", "Carlos Mendoza", "cmendoza@unicorsalud.edu.co", "Ingeniería de Software");
        Estudiante est2 = new Estudiante("E202", "Ana Lopez", "alopez@unicorsalud.edu.co", "Ingeniería de Software");

        // Ejemplo de POLIMORFISMO mediante la lista de tipo Persona
        List<Persona> directorio = new ArrayList<>();
        directorio.add(docente1);
        directorio.add(est1);
        directorio.add(est2);

        System.out.println("--- DIRECTORIO DE USUARIOS (POLIMORFISMO) ---");
        for (Persona p : directorio) {
            // Llama a la versión de obtenerRol() de cada subclase concreta
            System.out.println(p.toString());
        }
        System.out.println();

        // Uso de SOBRECARGA en el registro de notas
        est1.registrarNota(4.5, 3.8, 4.0); // Método sobrecargado con 3 parámetros
        est2.registrarNota(2.5);           // Método con 1 parámetro
        est2.registrarNota(2.0);

        // Creación de asignatura e inscripción de estudiantes
        Asignatura po01 = new Asignatura("POO-01", "Programación Orientada a Objetos", 4, docente1);
        po01.inscribirEstudiante(est1);
        po01.inscribirEstudiante(est2);

        // Generar reporte
        po01.mostrarReporte();
    }
}