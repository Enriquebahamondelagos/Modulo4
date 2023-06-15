package ejercicioGrupal10;

import java.util.Scanner;

/**
 * @author Enrique Bahamonde
 * @author Mauro Bocardo
 * @author Bastian Gongora
 * @author Kevin Rojas
 * @version 1.0
 */
public class Capacitacion {
    public static void main(String[] args) {

        //SCANNER

        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //DECLARACION DE VARIABLES
        String lugar, hora, nombre, nota,notaAux;
        int cantidadAsistentes, dia;
        float duracionCapacitacion, sumaNotas, promedio,notaMin, notaMax;

        sumaNotas = 0;
        notaMin = 7;
        notaMax = 1;

        //INGRESO DE DATOS


        System.out.print("Ingrese dia de capacitacion: ");
        dia = leer.nextInt();

        System.out.print("Ingrese hora de capacitacion: ");
        hora = leer.next();

        System.out.print("Ingrese lugar de capacitacion: ");
        lugar = leer.next();

        System.out.print("Ingrese duracion (en horas) de capacitacion: ");
        duracionCapacitacion = leer.nextFloat();

        System.out.print("Ingrese cantidad de asistentes: ");
        cantidadAsistentes = leer.nextInt();

        //ARREGLO

        String asistentes[][] = new String [cantidadAsistentes][2];


        // CICLO FOR DESDE 0 A CANTIDAD DE ASISTENTES PARA LLENAR ARREGLO CON NOMBRE Y NOTA.

        System.out.println("----------------------------------------------------------------");
        System.out.println("---------------------Ingreso de asistentes----------------------");

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.print("Ingrese nombre del asistente "+(i+1)+":");
            nombre = sc.nextLine();

            System.out.print("Ingrese nota del asistente "+(i+1)+":");
            nota = sc.nextLine();

            if (nota.contains(String.valueOf(",")) == true){
                nota = String.valueOf(Float.parseFloat(nota.replaceAll(",", ".")));
            }

            asistentes[i][0] = nombre;
            asistentes[i][1] = nota;

            sumaNotas = sumaNotas+convertirNumero(nota);

            if (convertirNumero(nota) <= notaMin){
                notaMin = convertirNumero(nota);
            }
            if (convertirNumero(nota) >= notaMax){
                notaMax = convertirNumero(nota);
            }
        }

        System.out.println("-----------------Fin ingreso de asistentes----------------------");
        System.out.println("----------------------------------------------------------------\n");


        // IMPRESION DE DATOS

        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------- Curso Full Stack Java ------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Lugar: \t\t\t\t\t\t" + lugar);
        System.out.println("Hora: \t\t\t\t\t\t" + hora);
        System.out.println("Duracion: \t\t\t\t\t" + duracionCapacitacion);
        System.out.println("Cantidad de asistentes: \t" + cantidadAsistentes);

        System.out.println("Nombre \t\t\t\t\t Nota");
        for (int i = 0; i < cantidadAsistentes; i++) {

            System.out.println(asistentes[i][0].toUpperCase() + "\t\t\t\t\t\t\t" + asistentes[i][1]);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Promedio del curso: " + calcularPromedio(sumaNotas, cantidadAsistentes));
        System.out.println("Nota máxima obtenida en el curso: " + notaMax);
        System.out.println("Nota mínima obtenida en el curso: " + notaMin);
    }

    public static float convertirNumero(String numero){
        return Float.parseFloat(numero);
    }

    public static float calcularPromedio(float sumaNotas, int cantidadAsistentes){
        return sumaNotas/cantidadAsistentes;
    }


}


