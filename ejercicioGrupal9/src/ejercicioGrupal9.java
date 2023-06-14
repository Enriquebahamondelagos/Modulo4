import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Enrique Bahamonde
 * @author Bastian Gongora
 * @author Mauro Boccardo
 * @author Kevin Rojas
 */
public class ejercicioGrupal9 {

    public static void main(String[] args) {

        //CLIENTE TIENE RUT NOMBRE DIRECCION COMUNA Y NUMERO TELEFONO

        //CAPACITACIONES TIENE NOMBRECAPACITACION, DIA, HORA, LUGAR, DURACION Y CANTIDAD DE ASISTENTES

        String nombreCliente, rutCliente, direccionCliente, comunaCliente, telefonoCliente;
        String nombreCapacitacion, lugarCapacitacion, fechaCapacitacion, textoAuxiliar, edadAux;
        textoAuxiliar = "";
        double duracionCapacitacion;
        int cantidadAsistentes, opcion;
        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int contadorMenor25 = 0, contadorMayor25Menor35 = 0, contadorMayor35 = 0;
        int edadAsistente = 0;

        System.out.println("*************************************************");


        System.out.print("Ingrese nombre del cliente: ");
        nombreCliente = sc.nextLine();
        while (nombreCliente.length() == 0) {
            System.out.print("Ingrese un nombre valido: ");
            nombreCliente = sc.nextLine();
        }
        System.out.print("Ingrese rut del cliente: ");
        rutCliente = sc.nextLine();
        while (rutCliente.length() == 0) {
            System.out.print("Ingrese un rut valido: ");
            rutCliente = sc.nextLine();
        }
        System.out.print("Ingrese direccion del cliente: ");
        direccionCliente = sc.nextLine();
        while (direccionCliente.length() == 0) {
            System.out.print("Ingrese una direccion valida: ");
            direccionCliente = sc.nextLine();
        }
        System.out.print("Ingrese comuna del cliente: ");
        comunaCliente = sc.nextLine();
        while (comunaCliente.length() == 0) {
            System.out.print("Ingrese una comuna valida: ");
            comunaCliente = sc.nextLine();
        }
        System.out.print("Ingrese telefono del cliente: ");
        telefonoCliente = sc.nextLine();
        while (telefonoCliente.length() == 0) {
            System.out.print("Ingrese un telefono valido: ");
            telefonoCliente = sc.nextLine();
        }

        System.out.print("");

        System.out.println("¿Desea crear una nueva capacitacion?");
        System.out.print("1-Si\n2-No\nIngrese opcion: ");
        opcion = leer.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.print("Ingrese una opcion valida");
            opcion = leer.nextInt();
        }
        if (opcion == 1) {
            System.out.print("Ingrese nombre de la capacitacion: ");
            nombreCapacitacion = sc.nextLine();
            while (nombreCapacitacion.length() == 0) {
                System.out.print("Ingrese un nombre valido: ");
                nombreCapacitacion = sc.nextLine();
            }
            System.out.print("Ingrese lugar de la capacitacion: ");
            lugarCapacitacion = sc.nextLine();
            while (lugarCapacitacion.length() == 0) {
                System.out.print("Ingrese un lugar valido: ");
                lugarCapacitacion = sc.nextLine();
            }
            System.out.print("Ingrese fecha de la capacitacion: ");
            fechaCapacitacion = sc.nextLine();
            while (fechaCapacitacion.length() == 0) {
                System.out.print("Ingrese una fecha valida: ");
                fechaCapacitacion = sc.nextLine();
            }
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Ingrese duración de capacitación: ");
                if (scanner.hasNextDouble()) {
                    duracionCapacitacion = scanner.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Error: Tipo de dato inválido. Intenta nuevamente.");
                    scanner.next(); // Limpiar el buffer de entrada
                }
            }
            System.out.print("Ingrese cantidad de asistentes: ");
            cantidadAsistentes = leer.nextInt();
            while (cantidadAsistentes <= 0) {
                System.out.print("Ingrese una cantidad valida: ");
                cantidadAsistentes = leer.nextInt();
            }
            System.out.println("*************************************************");
            System.out.println("La capacitación fue creada con exito");
            System.out.println("*************************************************");
            System.out.println("");
            System.out.println("**************INGRESO ASISTENTES*****************");
            for (int i = 1; i < cantidadAsistentes + 1; i++) {
                System.out.println("----------------Asistente N°" + (i) + "-------------------");
                System.out.print("Ingrese nombre del asistente: ");
                String nombreAsistente = sc.nextLine();
                while (nombreAsistente.length() == 0) {
                    System.out.print("Ingrese un nombre valido: ");
                    nombreAsistente = sc.nextLine();
                }
                boolean valorInput = false;
                while (!valorInput) {
                    System.out.print("Ingrese edad : ");
                    if (scanner.hasNextInt()) {
                        edadAsistente = scanner.nextInt();
                        valorInput = true;
                    } else {
                        System.out.println("Error: Tipo de dato inválido. Intenta nuevamente.");
                        scanner.next(); // Limpiar el buffer de entrada
                    }
                }
                if (edadAsistente < 25 && edadAsistente > 0) {
                    contadorMenor25++;
                }
                else if (edadAsistente >= 25 && edadAsistente < 35){
                    contadorMayor25Menor35++;
                }
                else{
                    contadorMayor35++;
                }


                textoAuxiliar = textoAuxiliar + "\nAsistente Nro " + i + "\n" + "Nombre: \t" + nombreAsistente + "\nEdad: \t\t" + edadAsistente + "\n";
            }
            System.out.print("");

            System.out.println("¿Desea crear ver los datos ingresados?");
            System.out.print("1-Si\n2-No\nIngrese opcion: ");
            opcion = leer.nextInt();
            while (opcion < 1 || opcion > 2) {
                System.out.print("Ingrese una opcion valida");
                opcion = leer.nextInt();
            }

            switch (opcion) {
                case 1:
                    System.out.println(textoAuxiliar);
                    System.out.println("Asistentes menor a 25: " + contadorMenor25);
                    System.out.println("Asistentes mayor a 25 y menor a 35: " + contadorMayor25Menor35);
                    System.out.println("Asistentes mayor a 35: " + contadorMayor35);
                    break;
                case 2:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Valor ingresado no es válido");
            }

            System.out.println("*****************Fin del programa****************");
        }
    }
}








