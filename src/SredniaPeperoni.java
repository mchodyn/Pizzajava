public class SredniaPeperoni implements Pizza {


    String Opis="sos pomidorowy, ser zolty, salami";
    Double Cena=0.00;

    private SredniaPeperoni(String opis, Double cena) {
        Opis = opis;
        Cena = cena;
    }
    @Override
    public Double getCena() {
        return Cena;
    }

    @Override
    public String getOpis() {
        return Opis;
    }

    public static class SredniaPeperoniBuilder {
        private String opis;
        private Double cena;

        public SredniaPeperoniBuilder setOpis(String opis) {
            this.opis = opis;
            return this;
        }

        public SredniaPeperoniBuilder setCena(Double cena) {
            this.cena = cena;
            return this;
        }

        public SredniaPeperoni createSredniaPeperoni() {
            return new SredniaPeperoni(opis, cena);
        }
    }
}
