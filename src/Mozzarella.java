public class Mozzarella extends Dodatki{
    public Mozzarella(Pizza newPizza){
        super(newPizza);
        System.out.println("mozzarella dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", mozzarella";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt mozzarellio" + 1.50);
        return tymczasowaPizza.getCena()+ 1.00;
    }
}
