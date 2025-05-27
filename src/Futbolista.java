public class Futbolista extends Personal {
    private Integer Dorsal;
    private String Demarcacion;
//Metodos
    @Override public void Concentrarse(){
        super.Concentrarse();
    }

    @Override public void Viajar(){
        super.Viajar();
    }

    public void JugarPartido(){
    }

    public void Entrenar(){
    }

    //Constructores y Getter and Setters.
    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion) {
        Dorsal = dorsal;
        Demarcacion = demarcacion;
    }

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        Dorsal = dorsal;
        Demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return Dorsal;
    }

    public void setDorsal(Integer dorsal) {
        Dorsal = dorsal;
    }

    public String getDemarcacion() {
        return Demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        Demarcacion = demarcacion;
    }
}
