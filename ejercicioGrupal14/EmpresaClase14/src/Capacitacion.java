public class Capacitacion {
    //ATRIBUTOS
    private String idCapacitacion;
    private int rut;
    private int dia;
    private String hora;
    private String lugar;
    private float duracion;
    private int cantidadAsistentes;


    //Constructores


    public Capacitacion() {
    }

    public Capacitacion(String idCapacitacion, int rut, int dia, String hora, String lugar, float duracion, int cantidadAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    //GETTER AND SETTER

    public String getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(String idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    //METODOS

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion='" + idCapacitacion + '\'' +
                ", rut=" + rut +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }

    public String mostrarDetalle(){
        return "La capacitación sera en "+this.getLugar() + " a las " + this.getHora() + " del día " + this.getDia() + " y durará " + this.getDuracion() + " minutos";
    }

}
