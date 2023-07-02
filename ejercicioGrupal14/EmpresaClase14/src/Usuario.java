public class Usuario {
    //ATRIBUTOS
    private String nombre;
    private String fechaNacimiento;
    private int rut;

    //CONSTRUCTORES


    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }


    //METODOS


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", rut=" + rut +
                '}';
    }


    public String mostrarEdad() {
        int edad = 2023 - Integer.parseInt(fechaNacimiento.substring(0, 4));
        return "El usuario tiene " + edad + " años";
    }


}

