public class Cebula extends Dodatki{
    public Cebula(Pizza newPizza){
        super(newPizza);
        System.out.println("cebula dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", cebula";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt cebuli" + 0.50);
        return tymczasowaPizza.getCena()+ 0.50;
    }
}
