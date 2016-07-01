
public class Cubo extends Poliedro {

    public Cubo (double arista, long id, String color)

    {
        super(id, color, arista);
    }

    public double calculaVolumen () {return Math.pow(arista, 3);}

    public double calculaDiagonal () {return (Math.sqrt(3)) * arista;}

    @Override
    public String toString() {
        return "Cubo{" +
                "id=" + id +
                ", arista=" + arista +
                "color=" + color +
                "}" ;
    }

}
