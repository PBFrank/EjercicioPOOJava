public class Entrenador extends Personal{
    private String IdFederacion;
//Metodos
    @Override public void Concentrarse(){
        super.Concentrarse();
    }
    @Override public void Viajar(){
        super.Viajar();
    }

    public void dirigirPartido(){}
    public void dirigirEntrenamiento(){}

    //Constructores y Encapsulamiento
    public Entrenador() {
    }

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        IdFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return IdFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        IdFederacion = idFederacion;
    }
}
