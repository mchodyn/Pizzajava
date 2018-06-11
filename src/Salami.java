public class Salami extends Dodatki{
    public Salami(Pizza newPizza){
        super(newPizza);
        System.out.println("Salami dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", salami";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt salami" + 2.00);
        return tymczasowaPizza.getCena()+ 2.00;
    }
}
