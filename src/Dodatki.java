abstract class Dodatki implements Pizza {
    protected Pizza tymczasowaPizza;
    public Dodatki(Pizza newPizza){
        tymczasowaPizza=newPizza;
    }

    @Override
    public String getOpis() {
        return tymczasowaPizza.getOpis();
    }

    @Override
    public Double getCena() {
        return tymczasowaPizza.getCena();
    }
}
