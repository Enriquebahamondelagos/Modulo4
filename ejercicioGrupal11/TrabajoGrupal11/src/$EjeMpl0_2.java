// No se esta utilizando y desconocemos el package Clase11
package Clase11;
// El nombre de la clase debe empezar con una palabra sin simbolos
public class $EjeMpl0_2 {
    public static void main(String[] args) {
        //Las buenas practicas dice que un valor constante se debe escribir toda la varibale en mayuscula
        final boolean valorconstante = false;

        //Al seperar con Enter no se considera dentro el mismo String

        String mensaje = "Lorem ipsum dolor sit amet,
        consectetur adipiscing elit. Donec facilisis est ac ante viverra,
        vel efficitur leo consequat. Maecenas quis lorem sit amet diam
        consequat lacinia non nec lacus. Phasellus egestas quam non dui
        dictum, sed fermentum dolor efficitur. Aliquam volutpat ex
        sodales pulvinar scelerisque. Donec sodales cursus tortor eu
        aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in
        faucibus orci luctus et ultrices posuere cubilia curae;
        Suspendisse pretium, quam non consectetur scelerisque, diam
        tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at
        consequat enim. Orci varius natoque penatibus et magnis dis
        parturient montes, nascetur ridiculus mus. Donec sit amet
        ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        //Crear variables con nombres mas atingentes por el tema que se esta trabajando
        int Ola;

        Ola = 10;
        //Considerar que las intrucciones del for deben estar en la misma línea
        for (int i = 0;
             i < Ola; i++) {

            System.out.println("Valor: " + (i * i));
        }
//Esto es un comentario
//demasiado grande
//para que esté en una
//sola línea
// El mensaje se puede escribir en una sola línea, no es necesario concadenar 2 textos
        System.out.println("El mensaje " + " es" + mensaje);
        System.out.println(" El valor de la constante es: " +
                valorconstante);
    }
}
// Sobra una llave
//}
