public class SerZolty extends Dodatki{
    public SerZolty(Pizza newPizza){
        super(newPizza);
        System.out.println("ser zolty dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", ser zolty";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt sera zoltego" + 1.50);
        return tymczasowaPizza.getCena()+ 1.00;
    }
}
