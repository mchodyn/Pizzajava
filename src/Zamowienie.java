import java.util.ArrayList;

public class Zamowienie {
    ArrayList<Pizza> zamowienie= new ArrayList<>();
    Double wartoscZamowienia=0.00;
    private static Zamowienie firstInstance=null;
    private Zamowienie(){}
    public static Zamowienie getInstance(){
        if(firstInstance==null)
        {
            firstInstance=new Zamowienie();
        }
        return firstInstance;
    }
    public Zamowienie dodajPizze(Pizza p) {
    zamowienie.add(p);
    wartoscZamowienia+=p.getCena();
    return this;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +

                " wartoscZamowienia=" + wartoscZamowienia +
                '}';
    }
}