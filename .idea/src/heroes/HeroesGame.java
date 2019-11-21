package heroes;


public class HeroesGame {
    public static void main(String[] args) {
        Goku hero1= new Goku("Goku",400,200);
        Mage hero2= new Mage("China",200,800);
        Superman hero3= new Superman("Clark",500,300);

        do {
            System.out.println(hero1.toString());
        }while(hero1.HP>0);


    }
}
