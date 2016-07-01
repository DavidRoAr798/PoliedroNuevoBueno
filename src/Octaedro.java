
public class Octaedro extends Poliedro {


    public Octaedro (double arista, long id, String color)
    {
        super(id, color, arista);
    }

    public double calculaVolumen () {return (Math.sqrt(2) / 3) * (Math.pow(arista,3)) ;}

    @Override
    public String toString() {
        return "Octaedro{" +
                "id=" + id +
                ", arista=" + arista +
                "}";
    }

}

