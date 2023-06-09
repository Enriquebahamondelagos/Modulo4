//INTEGRANTES
// ENRIQUE BAHAMONDE
// BASTIAN GONGORA
// KEVIN ROJAS


import java.util.Scanner;

public class ejercicioGrupal8 {
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
