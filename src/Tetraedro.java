
    public class  Tetraedro extends Poliedro {


        public Tetraedro (double arista, long id, String color)
        {
            super(id, color, arista);
        }

        public double calculaVolumen () {return (Math.sqrt(2) / 12) * (Math.pow(arista,3)) ;}

        @Override
        public String toString() {
            return "Tetraedro{" +
                    "id=" + id +
                    ", arista=" + arista +
                    "}";
        }

    }

