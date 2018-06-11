import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static String getinput() {
        return input.nextLine().trim();
    }
    public static void main(String[] args) {
String wybor;
Zamowienie zamowienie= Zamowienie.getInstance();
    do {
        System.out.println("0. wybierz gotowa pizze");
        System.out.println("1. dodaj pizze");
        System.out.println("2. wyswietl wartosc zamowienia");
        System.out.println("x. zakoncz zamowienie");
        wybor=getinput();
        if (wybor.equals("0"))
        {
            System.out.println("WYBIERZ PIZZE");
            System.out.println("1. Peperoni");
            System.out.println("x. wroc");
            String wybor2=getinput();
            if (wybor2.equals("1"))
            {
                System.out.println("Wybierz wielkosc");
                System.out.println("1.mala 18zl");
                System.out.println("2.srednia 23zl");
                System.out.println("3.duza 28zl");
                String wybor3=getinput();
                if (wybor3.equals("1"))
                {
                    Pizza pizza = new SredniaPeperoni.SredniaPeperoniBuilder().setCena(18.00).createSredniaPeperoni();
                    zamowienie.dodajPizze(pizza);
                }
                if (wybor3.equals("2"))
                {
                    Pizza pizza = new SredniaPeperoni.SredniaPeperoniBuilder().setCena(23.00).createSredniaPeperoni();
                    zamowienie.dodajPizze(pizza);

                }
                if (wybor3.equals("3"))
                {
                    Pizza pizza = new SredniaPeperoni.SredniaPeperoniBuilder().setCena(28.00).createSredniaPeperoni();
                    zamowienie.dodajPizze(pizza);

                }

            }
            if (wybor2.equals("x"))
            {

            }

        }
        if (wybor.equals("1"))
        {
            System.out.println("WYBIERZ ROZMIAR PIZZY");
            System.out.println("1. Mala pizza");
            System.out.println("2. Srednia pizza");
            System.out.println("3. Duza pizza");
            String wybor2;
            wybor2=getinput();
            if(wybor2.equals("1")) {
                Pizza pizza = new MalaPizza();
                String wybor3;
                do {
                    System.out.println("WYBIERZ DODATKI");
                    System.out.println("1. sos czosnkowy");
                    System.out.println("2. sos pomidorowy");
                    System.out.println("3. salami");
                    System.out.println("4. szynka");
                    System.out.println("5. cebula");
                    System.out.println("6. papryka");
                    System.out.println("7. kukurydza");
                    System.out.println("8. ser zolty");
                    System.out.println("9. mozzarella");
                    System.out.println("x. koniec");

                    wybor3 = getinput();
                    if (wybor3.equals("1"))
                        pizza = new SosCzosnkowy(pizza);
                    if (wybor3.equals("2"))
                        pizza = new SosPomidorowy(pizza);
                    if (wybor3.equals("3"))
                        pizza = new Salami(pizza);
                    if (wybor3.equals("4"))
                        pizza = new Szynka(pizza);
                    if (wybor3.equals("5"))
                        pizza = new Cebula(pizza);
                    if (wybor3.equals("6"))
                        pizza = new Papryka(pizza);
                    if (wybor3.equals("7"))
                        pizza = new Kukurydza(pizza);
                    if (wybor3.equals("8"))
                        pizza = new SerZolty(pizza);
                    if (wybor3.equals("9"))
                        pizza = new Mozzarella(pizza);

                } while (!wybor3.equals("x"));
                zamowienie.dodajPizze(pizza);
            }
            if(wybor2.equals("2"))
            {   String wybor3;
                Pizza pizza = new SredniaPizza();
                do {
                    System.out.println("WYBIERZ DODATKI");
                    System.out.println("1. sos czosnkowy");
                    System.out.println("2. sos pomidorowy");
                    System.out.println("3. salami");
                    System.out.println("4. szynka");
                    System.out.println("5. cebula");
                    System.out.println("6. papryka");
                    System.out.println("7. kukurydza");
                    System.out.println("8. ser zolty");
                    System.out.println("9. mozzarella");
                    System.out.println("x. koniec");
                    wybor3 = getinput();
                    if (wybor3.equals("1"))
                        pizza = new SosCzosnkowy(pizza);
                    if (wybor3.equals("2"))
                        pizza = new SosPomidorowy(pizza);
                    if (wybor3.equals("3"))
                        pizza = new Salami(pizza);
                    if (wybor3.equals("4"))
                        pizza = new Szynka(pizza);
                    if (wybor3.equals("5"))
                        pizza = new Cebula(pizza);
                    if (wybor3.equals("6"))
                        pizza = new Papryka(pizza);
                    if (wybor3.equals("7"))
                        pizza = new Kukurydza(pizza);
                    if (wybor3.equals("8"))
                        pizza = new SerZolty(pizza);
                    if (wybor3.equals("9"))
                        pizza = new Mozzarella(pizza);

                } while (!wybor3.equals("x"));
                zamowienie.dodajPizze(pizza);
            }
            if(wybor2.equals("3"))
            {String wybor3;
                Pizza pizza = new DuzaPizza();
                do {
                    System.out.println("WYBIERZ DODATKI");
                    System.out.println("1. sos czosnkowy");
                    System.out.println("2. sos pomidorowy");
                    System.out.println("3. salami");
                    System.out.println("4. szynka");
                    System.out.println("5. cebula");
                    System.out.println("6. papryka");
                    System.out.println("7. kukurydza");
                    System.out.println("8. ser zolty");
                    System.out.println("9. mozzarella");
                    System.out.println("x. koniec");
                    wybor3 = getinput();
                    if (wybor3.equals("1"))
                        pizza = new SosCzosnkowy(pizza);
                    if (wybor3.equals("2"))
                        pizza = new SosPomidorowy(pizza);
                    if (wybor3.equals("3"))
                        pizza = new Salami(pizza);
                    if (wybor3.equals("4"))
                        pizza = new Szynka(pizza);
                    if (wybor3.equals("5"))
                        pizza = new Cebula(pizza);
                    if (wybor3.equals("6"))
                        pizza = new Papryka(pizza);
                    if (wybor3.equals("7"))
                        pizza = new Kukurydza(pizza);
                    if (wybor3.equals("8"))
                        pizza = new SerZolty(pizza);
                    if (wybor3.equals("9"))
                        pizza = new Mozzarella(pizza);

                } while (!wybor3.equals("x"));
                zamowienie.dodajPizze(pizza);
            }
        }
        if (wybor.equals("2"))
        {
            System.out.println(zamowienie);
        }

    }while(!wybor.equals("x"));
    }
}
