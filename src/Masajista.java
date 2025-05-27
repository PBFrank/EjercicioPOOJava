public class Masajista extends Personal{
    private String Titulacion;
    private Integer AniosExperiencia;
    //Metodos
    @Override public void Concentrarse(){
        super.Concentrarse();
    }
    @Override public void Viajar(){
        super.Viajar();
    }

    public void darMasaje(){}

    //Constructores y Encapsulamiento
    public Masajista() {
    }

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        Titulacion = titulacion;
        AniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return AniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        AniosExperiencia = aniosExperiencia;
    }
}
