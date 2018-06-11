public class Szynka extends Dodatki{
    public Szynka(Pizza newPizza){
        super(newPizza);
        System.out.println("Szynka dodano");
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis()+", szynka";
    }

    @Override
    public Double getCena() {
        System.out.println("Koszt szynki" + 2.00);
        return tymczasowaPizza.getCena()+ 2.00;
    }
}
