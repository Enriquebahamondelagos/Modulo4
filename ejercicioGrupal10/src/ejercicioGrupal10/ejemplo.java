package ejercicioGrupal10;

public class ejemplo {
    public static void main(String[] args) {
        String nota = "5,3";
        float nota2 = Float.parseFloat(nota.replaceAll(",", "."));

        System.out.println(nota2);

        boolean isExist = nota.contains(String.valueOf(","));
        System.out.println(isExist);
    }
}
