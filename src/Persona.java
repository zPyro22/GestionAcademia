public abstract class Persona {
    private String id;
    private String nombre;
    private String correo;

    public Persona(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }

    public void setId(String id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }

    // Método abstracto para sobreescritura obligatoria en subclases
    public abstract String obtenerRol();

    // Sobreescritura (Override) de toString
    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Rol: " + obtenerRol();
    }
}