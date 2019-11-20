package heroes;

public class Mage extends Hero {
    public Mage(String name, int HP, int mana) {
        super(name, HP, mana);
    }

    @Override
    public void firePrimary() {
        mana-=15;
    }

    @Override
    public void fireSecondary() {
        mana-=40;
    }

    @Override
    public void recieveHit() {
        HP-=30;
    }
}
