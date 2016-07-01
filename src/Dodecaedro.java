
public class Dodecaedro extends Poliedro {

    public Dodecaedro(double arista, long id, String color)
    {
        super(id, color, arista);
    }

    public double calculaVolumen () {return (1.0 / 4.0) * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);}

    @Override
    public String toString() {
        return "Dodecaedro{"+
                "id=" + id +
                ", arista=" + arista +
                "color=" + color +
                "}";
    }
}
