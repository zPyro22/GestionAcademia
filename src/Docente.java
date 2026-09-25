public class Docente extends Persona {
    private String especialidad;

    public Docente(String id, String nombre, String correo, String especialidad) {
        super(id, nombre, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public String obtenerRol() {
        return "Docente";
    }
}
