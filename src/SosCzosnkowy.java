public class SosCzosnkowy extends Dodatki{
    public SosCzosnkowy(Pizza newPizza){
        super(newPizza);
        System.out.println("sos czosnkowy dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", sos czosnkowy";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt sosu czosnkowego" + 1.00);
        return tymczasowaPizza.getCena()+ 1.00;
    }
}
