package EjercicioDocumentacion;

import java.util.Scanner;

/**
 * @author <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a>
 * @version 1.0 / Fecha: 13-06-2023
 */
public class ejercicioGrupal8 {
    /**
     * @param args[] es un arreglo con los parámetros que el reciba por consola
     * @return void
     * <h1>Descripción</h1>
     * <p>Programa que sirve para ingresar los datos de un usuario e imprimirlos por consola mediante <b>metodo imprimir()</b>.</p>
     */
    public static void main(String[] args) {
        //CREACION DE VARIABLE LEER PARA LECTURA POR TECLADO
        Scanner leer;
        leer = new Scanner(System.in);

        //DECLARACION DE VARIABLES

        String nombre,rut,fechaNacimiento,departamento,funcion,nombreSuperior,telefono,direccion;
        int opcion,perfil,annosExperiencia,cantidadEmpleados;


        //INGRESO DE DATOS Y ASIGNACION A VARIABLES
        System.out.println("Ingrese nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese rut: ");
        rut = leer.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fechaNacimiento = leer.nextLine();

        //SE UTULIZA /n PARA SALTOS DE LINEA EN MENU

        System.out.println("Ingrese tipo de perfil \n 1) Cliente \n 2) Profesional \n 3) Administrativo");

        //CREACION DE NUEVO SCANNER PARA OPCION
        opcion = new Scanner(System.in).nextInt();

        direccion = "Sin datos";
        telefono = "Sin datos";
        cantidadEmpleados = 0;
        annosExperiencia = 0;
        departamento = "Sin datos";
        nombreSuperior = "Sin datos";
        funcion = "Sin datos";

        switch (opcion) {
            case 1:{
                System.out.println("Ingrese dirección:");
                direccion = leer.nextLine();
                System.out.println("Ingrese telefono:");
                telefono = leer.nextLine();
                System.out.println("Ingrese cantidad de empleados:");
                cantidadEmpleados = leer.nextInt();
                break;
            }
            case 2:{
                System.out.println("Ingrese años de experiencia:");
                annosExperiencia = leer.nextInt();
                System.out.println("Ingrese departamento:");
                departamento = leer.nextLine();
                break;
            }
            case 3:{
                System.out.println("Ingrese nombre superior:");
                nombreSuperior = leer.nextLine();
                System.out.println("Ingrese función:");
                funcion = leer.nextLine();
                break;
            }
            default:{
                System.out.println("Opción ingresada no es válida");
            }
        }
        imprimir(nombre,rut,fechaNacimiento,direccion,telefono,cantidadEmpleados,annosExperiencia,departamento,nombreSuperior,funcion);
    }

    /**
     * Metodo sirve para imprimir los datos del usuario
     * @param nombre Variable que almacena nombre de usuario
     * @param rut     Variable que almacena rut de usuario
     * @param fechaNacimiento   Variable que almacena fecha de nacimiento de usuario
     * @param direccion Variable que almacena direccion de usuario
     * @param telefono Variable que almacena telefono de usuario
     * @param cantidadEmpleados Variable que almacena cantidad de empleados de usuario
     * @param annosExperiencia Variable que almacena años de experiencia de usuario
     * @param departamento Variable que almacena departamento de usuario
     * @param nombreSuperior Variable que almacena nombre de usuario superior
     * @param funcion Variable que almacena función de usuario
     */
    public static void imprimir(String nombre, String rut, String fechaNacimiento, String direccion, String telefono, int cantidadEmpleados, int annosExperiencia, String departamento, String nombreSuperior, String funcion){
        System.out.println("-----------------------------------");
        System.out.println("Nombre:\t\t\t\t\t"+nombre);
        System.out.println("Rut:\t\t\t\t\t"+rut);
        System.out.println("Fecha de nacimiento:\t"+fechaNacimiento);
        System.out.println("Direccion:\t\t\t\t"+direccion);
        System.out.println("Telefono:\t\t\t\t"+telefono);
        System.out.println("Cantidad de empleados:\t"+cantidadEmpleados);
        System.out.println("Años de experiencia:\t"+annosExperiencia);
        System.out.println("Departamento:\t\t\t"+departamento);
        System.out.println("Nombre superior:\t\t"+nombreSuperior);
        System.out.println("Función:\t\t\t\t"+funcion);
        System.out.println("-----------------------------------");
    }
}
