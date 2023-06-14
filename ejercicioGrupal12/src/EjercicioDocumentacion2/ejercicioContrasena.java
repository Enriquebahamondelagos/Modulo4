package EjercicioDocumentacion2;

import java.util.Scanner;
/**
 * @author <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a>
 * @version 1.0 / Fecha: 13-06-2023
 */
public class ejercicioContrasena {
    /**
     * @param args Comandos de las lineas de código
     * <h1>Descripción</h1>
     * <p>Programa que sirve para validar una contraseña en 3 intentos ingresada por el usuario, la cual ya está definida por los desarrolladores.</p>
     */
    public static void main(String[] args) {
        // Definir variables
        String password = "admin123";
        String pass;
        int contador;

        contador = 0;

        Scanner leer;
        leer = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        pass = leer.nextLine();
        contador++;


        if (password.equals(pass)) {
            System.out.println("Contraseña correcta");
        } else {
            while (!password.equals(pass) && contador <= 2) {
                System.out.println("Contraseña incorrecta, intente nuevamente");
                System.out.println("Le quedan " + (3 - contador) + " intentos");
                System.out.print("Ingrese la contraseña: ");
                pass = leer.nextLine();
                if (password.equals(pass)) {
                    System.out.println("Contraseña correcta");
                    break;
                } else {
                    contador++;
                }
            }
        }

        if (contador == 3) {
            System.out.println("Contraseña incorrecta, ha completado todos los intentos, favor comuniquese con soporte");
        }

    }
}

