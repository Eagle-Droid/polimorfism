package heroes;

public class HeroesGame {
    public static void main(String[] args) {
        Goku hero1= new Goku("Goku",400,200);
        Mage hero2= new Mage("China",200,800);
        Superman hero3= new Superman("Clark",500,300);

        hero1.firePrimary();
        hero2.recieveHit();
        hero3.recieveHit();

        hero2.fireSecondary();
        hero1.recieveHit();
        hero1.recieveHit();
        hero3.recieveHit();
        hero3.recieveHit();

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());


    }
}
