public class Docente extends Persona {
    private String especialidad;

    public Docente(String id, String nombre, String correo, String especialidad) {
        super(id, nombre, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }

    @Override
    public String obtenerRol() {
        return "Docente";
    }
}