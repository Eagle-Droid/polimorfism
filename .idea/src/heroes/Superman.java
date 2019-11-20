package heroes;

public class Superman extends Hero {

    public Superman(String name, int HP, int mana) {
        super(name, HP, mana);
    }

    @Override
    public void firePrimary() {
        mana-=10;
        HP++;
    }

    @Override
    public void fireSecondary() {
        mana-=30;
        HP+=3;
    }

    @Override
    public void recieveHit() {
        HP--;
    }
}
