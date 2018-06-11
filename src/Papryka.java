public class Papryka extends Dodatki{
    public Papryka(Pizza newPizza){
        super(newPizza);
        System.out.println("papryka dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", papryka";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt papryki" + 1.50);
        return tymczasowaPizza.getCena()+ 1.50;
    }
}
