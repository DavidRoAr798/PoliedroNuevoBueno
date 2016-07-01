
import java.util.*;

public class MapColores {
   static Map<String, List<Cubo>> coloresMap = new HashMap<>(); //cómo defino el hashMap?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de cubos color rojo: ");
        int numero = sc.nextInt();
        System.out.println("Introduce el numero de cubos color amarillo: ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el numero de cubos color verde: ");
        int numero3 = sc.nextInt();

        ObtenerCubo(sc, numero, "Rojo");
        ObtenerCubo(sc, numero2, "Amarillo");
        ObtenerCubo(sc, numero3, "Verde");


        System.out.println(coloresMap); // cómo lo imprimo?

    }


    private static void ObtenerCubo(Scanner sc, int numero, String colorSeleccionado) {
        List<Cubo> cuboList = new ArrayList<>();
        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del cubo " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();


            Cubo cubo = new Cubo(arista, +i, colorSeleccionado);

            cuboList.add(cubo);

        }
        coloresMap.put(colorSeleccionado,cuboList);
    }
}