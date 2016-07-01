
public class Icosaedro extends Poliedro {

    public Icosaedro (double arista, long id, String color)
    {
        super (id, color, arista);
    }

    public double calculaVolumen () {return (5.0 / 12.0) * (3 + Math.sqrt(5)) * (Math.pow(arista, 3));}

    @Override
    public String toString() {
        return "Icosaedro{"+
                "id=" + id +
                ", arista=" + arista +
                "}";
    }

}
