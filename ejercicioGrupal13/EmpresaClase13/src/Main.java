import java.util.Scanner;

/**
 * @author Enrique Bahamonde
 * @author Bastian Gongora
 * @author Mauro Boccardo
 * @author Kevin Rojas
 * @version 1.0
 */
public class Main {
    public static void main(String args[]) {
        int cantidadUsuarios,rut, cantidadClientes,sistemaSalud,telefono,edad,cantidadCapacitaciones,dia,cantidadAsistentes;
        String nombre,fechaNacimiento,apellidos,afp,direccion,comuna,idCapacitacion, horaCapacitacion, lugar;
        float duracion;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de usuarios que desea crear: ");
        cantidadUsuarios = leer.nextInt();

        Usuario usuarios[] = new Usuario[cantidadUsuarios];


        for(int i=0; i<cantidadUsuarios;i++){
            leer = new Scanner(System.in);
            System.out.print("Ingrese nombre: ");
            nombre = leer.nextLine();
            System.out.print("Ingrese fecha de nacimiento: ");
            fechaNacimiento = leer.nextLine();
            System.out.print("Ingrese rut: ");
            rut = leer.nextInt();
            while(rut>99999999){
                System.out.println("Rut debe ser menor a 99999999, favor vuelva a ingresar.");
                System.out.print("Ingrese rut: ");
                rut = leer.nextInt();
            }
            Usuario usuario = new Usuario(nombre,fechaNacimiento,rut);
            usuarios[i]=(usuario);
        }

        //CREAR INSTANCIAS DE LAS CLASES
        //CREANDO USUARIO

        /*
        Usuario usuario1 = new Usuario("Enrique Bahamonde","1959-11-05",8151833);
        Usuario usuario2 = new Usuario("Mauro Boccardo","1990-02-06",17256833);
        Usuario usuario3 = new Usuario("Bastian Góngora","1991-05-24",17815733);

        usuarios[0] = usuario1;
        usuarios[1] = usuario2;
        usuarios[2] = usuario3;
        */

        System.out.print("Ingrese la cantidad de Clientes que desea crear: ");
        cantidadClientes = leer.nextInt();

        Cliente clientes[] = new Cliente[cantidadClientes];

        for(int i=0; i<cantidadClientes;i++){
            leer = new Scanner(System.in);
            System.out.print("Ingrese rut: ");
            rut = leer.nextInt();
            while(rut>99999999){
                System.out.println("Rut debe ser menor a 99999999, favor vuelva a ingresar.");
                System.out.print("Ingrese rut: ");
                rut = leer.nextInt();
            }
            leer = new Scanner(System.in);
            System.out.print("Ingrese nombres: ");
            nombre = leer.nextLine();
            System.out.print("Ingrese apellidos: ");
            apellidos = leer.nextLine();
            System.out.print("Ingrese telefono: ");
            telefono = leer.nextInt();
            leer = new Scanner(System.in);
            System.out.print("Ingrese sistema de AFP: ");
            afp = leer.nextLine();
            System.out.print("Ingrese sistema de salud\n1) Fonasa\n2)Isapre\nIngrese opción : ");
            sistemaSalud = leer.nextInt();
            while(sistemaSalud<=0 || sistemaSalud>=3){
                System.out.print("Opción ingresada no es válida.\nIngrese nuevamente :");
                sistemaSalud = leer.nextInt();
            }
            leer = new Scanner(System.in);
            System.out.print("Ingrese dirección: ");
            direccion = leer.nextLine();
            System.out.print("Ingrese comuna: ");
            comuna = leer.nextLine();
            System.out.print("Ingrese edad: ");
            edad = leer.nextInt();

            Cliente cliente = new Cliente(rut,nombre,apellidos,telefono,afp,sistemaSalud,direccion,comuna,edad);
            clientes[i]=(cliente);
        }

        System.out.print("Ingrese la cantidad de capacitaciones que desea crear: ");
        cantidadCapacitaciones = leer.nextInt();

        Capacitacion capacitaciones[] = new Capacitacion[cantidadCapacitaciones];

        for(int i=0; i<cantidadCapacitaciones;i++){
            leer = new Scanner(System.in);
            System.out.print("Ingrese identificador de capacitación: ");
            idCapacitacion = leer.nextLine();
            System.out.print("Ingrese rut: ");
            rut = leer.nextInt();
            while(rut>99999999){
                System.out.println("Rut debe ser menor a 99999999, favor vuelva a ingresar.");
                System.out.print("Ingrese rut: ");
                rut = leer.nextInt();
            }
            leer = new Scanner(System.in);
            System.out.print("Ingrese dia: ");
            dia = leer.nextInt();
            leer = new Scanner(System.in);
            System.out.print("Ingrese hora de capacitación: ");
            horaCapacitacion = leer.nextLine();
            System.out.print("Ingrese lugar de capacitación: ");
            lugar = leer.nextLine();
            System.out.print("Ingrese duración (en horas): ");
            duracion = leer.nextFloat();
            leer = new Scanner(System.in);
            System.out.print("Ingrese cantidad de asistentes: ");
            cantidadAsistentes = leer.nextInt();

            Capacitacion capacitacion = new Capacitacion(idCapacitacion,rut,dia,horaCapacitacion,lugar,duracion,cantidadAsistentes);
            capacitaciones[i]=(capacitacion);
        }

        //Imprimir usuarios
        for(int i=0; i<cantidadUsuarios;i++) {
            System.out.println(usuarios[i].toString());
        }
        //Imprimir Clientes
        for(int i=0; i<cantidadClientes;i++) {
            System.out.println(clientes[i].toString());
        }
        //Imprimir Capacitaciones
        for(int i=0; i<cantidadCapacitaciones;i++) {
            System.out.println(capacitaciones[i].toString());
        }

        /*
        usuarios[i].setNombre(leer.nextLine());
        usuarios[i].setRut(leer.nextInt());*/
    }
}
