public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(12345678,"Enrique Jaime","Bahamonde Lagos",9876543,"Modelo",1,"Pasaje Los alelies 25","San Antonio",62);
        Cliente cliente2 = new Cliente(23456789,"Bastian Luis Antonio","Gongora Gongora",8765432,"Modelo",2,"San Antonio 25","San Antonio",28);

        Usuario usuario1 = new Usuario("Kevin Rojas","1993-01-04",9876789);
        Usuario usuario2 = new Usuario("Mauro Boccardo","1990-02-06",12345678);

        Capacitacion capacitacion1 = new Capacitacion("FullStackJava",78191530,16,"21:00","Zoom",50,3);
        Capacitacion capacitacion2 = new Capacitacion("FullStackPython",79590987,27,"15:00","Teams",60,2);


        System.out.println("IMPRESION DE OBJETOS INSTANCIADOS");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(capacitacion1.toString());
        System.out.println(capacitacion2.toString()+"\n");



        //MODIFICACION DE OBJETOS CON METODOS ACCESORES (SETTER)
        cliente1.setRut(8151833);
        cliente2.setApellidos("Gongora Barrera");

        usuario1.setRut(18202088);
        usuario2.setRut(17256833);

        capacitacion1.setCantidadAsistentes(10);
        capacitacion2.setDuracion(30);


        System.out.println("\nIMPRESION DATOS DE CLIENTES");
        System.out.println("\nDatos de cliente 1: ");
        System.out.println("Rut: "+cliente1.getRut());
        System.out.println(cliente1.obtenerNombre());
        System.out.println("Telefono: "+cliente1.getTelefono());
        System.out.println("Afp : "+cliente1.getAfp());
        System.out.println("Sistema de Salud: "+cliente1.obtenerSistemaSalud());
        System.out.println("Dirección: "+cliente1.getDireccion());
        System.out.println("Comuna: "+cliente1.getComuna());
        System.out.println("\nDatos de cliente 2: ");
        System.out.println("Rut: "+cliente2.getRut());
        System.out.println(cliente2.obtenerNombre());
        System.out.println("Telefono: "+cliente2.getTelefono());
        System.out.println("Afp : "+cliente2.getAfp());
        System.out.println("Sistema de Salud: "+cliente2.obtenerSistemaSalud());
        System.out.println("Dirección: "+cliente2.getDireccion());
        System.out.println("Comuna: "+cliente2.getComuna());


        System.out.println("\nIMPRESION DATOS DE USUARIOS");
        System.out.println("\nDatos de usuario 1: ");
        System.out.println("Rut: "+usuario1.getRut());
        System.out.println("Nombre: "+usuario1.getNombre());
        System.out.println(usuario1.mostrarEdad()) ;
        System.out.println("\nDatos de usuario 2: ");
        System.out.println("Rut: "+usuario2.getRut());
        System.out.println("Nombre: "+usuario2.getNombre());
        System.out.println(usuario2.mostrarEdad()) ;

        System.out.println("\nIMPRESION DATOS DE CAPACITACIONES");
        System.out.println("\nDatos de capacitacion 1: ");
        System.out.println("ID Capacitación: "+capacitacion1.getIdCapacitacion());
        System.out.println("Rut: "+capacitacion1.getRut());
        System.out.println("Cantidad Asistentes: "+capacitacion1.getCantidadAsistentes());
        System.out.println(capacitacion1.mostrarDetalle());
        System.out.println("\nDatos de capacitacion 2: ");
        System.out.println("ID Capacitación: "+capacitacion2.getIdCapacitacion());
        System.out.println("Rut: "+capacitacion2.getRut());
        System.out.println("Cantidad Asistentes: "+capacitacion2.getCantidadAsistentes());
        System.out.println(capacitacion2.mostrarDetalle());

    }
}
