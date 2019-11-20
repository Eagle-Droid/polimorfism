package heroes;

public class Goku extends Hero {
    public Goku(String name, int HP, int mana) {
        super(name, HP, mana);
    }

    @Override
    public void firePrimary() {
        mana-=5;
    }

    @Override
    public void fireSecondary() {
        mana-=40;
    }

    @Override
    public void recieveHit() {
        HP-=1;
        mana+=3;
    }
}
