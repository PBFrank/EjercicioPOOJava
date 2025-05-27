public class Personal {
    private Integer Id;
    private String Nombre;
    private String Apellidos;
    private Integer Edad;

    public void Concentrarse(){}
    public void Viajar(){}

    public Personal(){}

    public Personal(Integer id, String nombre, String apellidos, Integer edad) {
        Id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }
}
