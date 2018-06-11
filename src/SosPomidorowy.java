public class SosPomidorowy extends Dodatki{
    public SosPomidorowy(Pizza newPizza){
        super(newPizza);
        System.out.println("sos pomidorowy dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", sos pomidorowy";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt sosu pomidorowego" + 1.00);
        return tymczasowaPizza.getCena()+ 1.00;
    }
}
