package heroes;

public abstract class Hero {
    protected String name;
    protected int HP;
    protected int mana;
    protected int dmg;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", mana=" + mana +
                '}';
    }

    public Hero(String name, int HP, int mana, int dmg) {
        this.name = name;
        this.HP = HP;
        this.mana = mana;
        this.dmg = dmg;
    }

    public abstract void firePrimary();
    public abstract void fireSecondary();
    public abstract void fireThird();
    public abstract void recieveHit();

}
