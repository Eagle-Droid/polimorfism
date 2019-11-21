package heroes;

public class Goku extends Hero {
    public Goku(String name, int HP, int mana) {
        super(name, HP, mana);
    }
    int c;
    @Override
    public void fireThird() {
        c=mana-50;
        dmg=12%mana-c;
        mana=c;
    }
    @Override
    public void firePrimary() {
        c=mana-100;
        dmg=25%mana-c;
        mana=c;
    }


    @Override
    public void fireSecondary() {
        c=mana-75;
        dmg=17%mana-c;
        mana=c;
    }

    @Override
    public void recieveHit() {
      HP=HP-super.dmg;
    }
}
