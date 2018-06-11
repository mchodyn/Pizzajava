public class Kukurydza extends Dodatki{
    public Kukurydza(Pizza newPizza){
        super(newPizza);
        System.out.println("kukurydza dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", kukurydza";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt kukurydzy" + 1.50);
        return tymczasowaPizza.getCena()+ 1.50;
    }
}
