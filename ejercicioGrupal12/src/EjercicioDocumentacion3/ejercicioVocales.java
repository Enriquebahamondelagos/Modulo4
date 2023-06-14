package EjercicioDocumentacion3;

import java.util.Scanner;
/**
 * @author <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a>
 * @version 1.0 / Fecha: 13-06-2023
 */
public class ejercicioVocales {
    /**
     * @param args Comandos de las lineas de código
     * <h1>Descripción</h1>
     * <p>Programa que sirve para encontrar la cantidad de vocales y consonantes de una frase o texto ingresada por teclado.</p>
     */
    public static void main(String[] args) {
        String cadenaTexto;
        int contadorVocales = 0, contadorConsonantes = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese texto: ");

        cadenaTexto = scanner.nextLine();

        while (cadenaTexto.length() == 0) {
            System.out.print("La cadena de texto no puede estar vacia.\nIntroduzca una cadena de texto: ");
            cadenaTexto = scanner.nextLine();
        }


        for (int i = 0; i < cadenaTexto.length(); i++) {
            System.out.println(cadenaTexto.charAt(i));
            char letra = cadenaTexto.charAt(i);
            letra = Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
            if (letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' || letra == 'q'
                    || letra == 'r' || letra == 's' || letra == 't' || letra == 'v' || letra == 'w' || letra == 'x' || letra == 'y' || letra == 'z') {
                contadorConsonantes++;
            }

        }
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println("Cantidad de consonantes: " + contadorConsonantes);
    }
}
