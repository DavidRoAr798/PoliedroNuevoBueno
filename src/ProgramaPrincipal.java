import java.util.*;

public class ProgramaPrincipal {

    public static final String CUBOS = "Cubos";
    private static Map<String,List<? extends Poliedro>>mapPoliedro = new HashMap<>();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<Poliedro> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de poliedros, para cada tipo:  ");
        int numero = sc.nextInt();


        ObtenerCubo(sc, arrayList, numero);

        ObtenerOctaedro(sc, arrayList, numero);

        ObtenerTetraedro(sc, arrayList, numero);

        ObtenerDodecaedro(sc, arrayList, numero);

        ObtenerIcosaedro(sc, arrayList, numero);

        procesarPoliedros(arrayList, numero);

        mostrarMapPoliedros();

        consultarMapPoliedros(CUBOS);
    }

    private static void consultarMapPoliedros(String tipoPoliedro) {
        List<Poliedro> poliedroList = (List<Poliedro>) mapPoliedro.get("tipoPoliedro");
        System.out.println("La lista de" + tipoPoliedro + "es: ");
        System.out.println(poliedroList);
    }

    private static void procesarPoliedros(List<Poliedro> arrayList, int numero) {
        Poliedro max = null;
        Poliedro min = null;
        double totalVolumen = 0.0;
        int cont20to = 0;
        int cont20to100 = 0;
        int contOver100 = 0;

        int contAzul = 0;
        int contBlanco = 0;
        int contRojo = 0;
        int contVerde = 0;
        int contNaranja= 0;

        for (Poliedro poliedro : arrayList) // recorremos el array
        {
            double volumenActual = poliedro.calculaVolumen();
            String color = poliedro.getColor();
            //double perimetro = figuraGeometrica.calculaPerimetro();
            System.out.println("El volumen de la figura geometrica " + poliedro.getId() + " es = " + volumenActual);
            //System.out.println("El perimetro de la figura geometrica " + " es =" + perimetro);

            totalVolumen = totalVolumen + volumenActual;

            if (poliedro instanceof Cubo) {
                Cubo cubo = (Cubo) poliedro;
                double diagonal = cubo.calculaDiagonal();
                System.out.println("La diagonal del cubo es= " + diagonal);

            }

            if (max == null) {
                max = poliedro;
            } else {
                if (volumenActual > max.calculaVolumen()) {
                    max = poliedro;
                }
            }

            if (min == null) {
                min = poliedro;
            } else {
                if (volumenActual < min.calculaVolumen()) {
                    min = poliedro;
                }
            }

            if (volumenActual <= 20) {
                cont20to++;
            } else if (volumenActual <= 100) {
                cont20to100++;
            } else {
                contOver100++;
            }



            if (poliedro.getColor().equals("Azul")) {
                contAzul++;
            } else if (poliedro.getColor().equals("Blanco")) {
                contBlanco++;
            } else if (poliedro.getColor().equals("Rojo")){
                contRojo++;
            } else if (poliedro.getColor().equals("Verde")){
                contVerde++;
            }else if (poliedro.getColor().equals("Naranja")){
                contNaranja++;
            }


        }


        int totalFiguras = numero * 3;
        double media = totalVolumen / totalFiguras;
        System.out.println("La media del volumen de las figuras geometricas es: " + media);
        System.out.println("El poliedro con volumen maximo es: " + max);
        System.out.println("El poliedro con volumen min es " + min);

        System.out.println("El numero de figuras con volumen inferior a 20 es:" + cont20to);
        System.out.println("El numero de figuras con volumen entre 20 y 100 es:" + cont20to100);
        System.out.println("El numero de figuras con volumen superior a 100 es:" + contOver100);

        System.out.println("El numero de figuras de el color Azul es : " + contAzul);
        System.out.println("El numero de figuras de el color Blanco es : " + contBlanco);
        System.out.println("El numero de figuras de el color Rojo es : " + contRojo);
        System.out.println("El numero de figuras de el color Verde es : " + contVerde);
        System.out.println("El numero de figuras de el color Naranja es : " + contNaranja);
    }

    private static void mostrarMapPoliedros() {
        System.out.println("Map de Poliedros: ");
        System.out.println(mapPoliedro);
    }

    private static void ObtenerIcosaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Icosaedro> icosaedroList = new ArrayList<>();
        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del Icosaedro " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();
            String colorSeleccionado = solicitarColor();

            Icosaedro icosaedro = new Icosaedro(arista, i+ numero * 4, colorSeleccionado);
            arrayList.add(icosaedro);
            icosaedroList.add(icosaedro);
        }
        mapPoliedro.put("Icosaedros",icosaedroList);
    }

    private static void ObtenerDodecaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Dodecaedro> dodecaedroList = new ArrayList<>();
        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del Dodecaedro " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();
            String colorSeleccionado = solicitarColor();

            Dodecaedro dodecaedro = new Dodecaedro(arista, i+ numero * 3, colorSeleccionado); //no entiendo?¿?
            arrayList.add(dodecaedro);
            dodecaedroList.add(dodecaedro);
        }
        mapPoliedro.put("Dodecaedros",dodecaedroList);
    }

    private static void ObtenerTetraedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Tetraedro> tetraedroList = new ArrayList<>();
        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del Tetraedro " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();
            String colorSeleccionado = solicitarColor();


            Tetraedro tetraedro = new Tetraedro(arista, i+ numero * 2, colorSeleccionado);
            arrayList.add(tetraedro);
            tetraedroList.add(tetraedro);
        }
        mapPoliedro.put("Tetraedros",tetraedroList);

    }

    private static void ObtenerOctaedro(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Octaedro> octaedroList = new ArrayList<>();
        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del Octaedro " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();
            String colorSeleccionado = solicitarColor();

            Octaedro octaedro = new Octaedro(arista, i+ numero, colorSeleccionado);
            arrayList.add(octaedro);
            octaedroList.add(octaedro);
        }
        mapPoliedro.put("Octaedros",octaedroList);

    }

    private static void ObtenerCubo(Scanner sc, List<Poliedro> arrayList, int numero) {
        List<Cubo> cuboList = new ArrayList<>();
        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del cubo " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();
            String colorSeleccionado = solicitarColor();

            Cubo cubo = new Cubo(arista, +i, colorSeleccionado);
            arrayList.add(cubo);
            cuboList.add(cubo);

        }
        mapPoliedro.put(CUBOS,cuboList);
    }


    private static String solicitarColor() {
        System.out.println("Introduce un color: Azul=1, Blanco=2, Rojo=3, Verde=4, Naranja=5");
        Scanner sc = new Scanner(System.in);
        int opcionColorNum=sc.nextInt();
        String colorSeleccionado="null";

        switch (opcionColorNum) {

                case 1:
                    colorSeleccionado="Azul";
                    break;
                case 2:
                    colorSeleccionado= "Blanco";
                    break;
                case 3:
                    colorSeleccionado=  "Rojo";
                    break;
                case 4:
                    colorSeleccionado= "Verde";
                    break;
                case 5:
                    colorSeleccionado= "Naranja";
                    break;

                default:
                    System.out.println(colorSeleccionado + " No se corresponde con ningun color");
                    break;


        }



        // crear con el scanner una petición
        // el usuario debera introducir el numero entero de 1 a 5
        // por lo tanto se mostrará un menu del estilo de :
        //1.azul 2.blanco 3.rojo 4.verde 5.naranja
        //si selecciona el cuatro, se debera devolver 4.verde

        System.out.println("El color seleccionado es: " + colorSeleccionado);
        return colorSeleccionado;



    }


}




