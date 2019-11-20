package heroes;

public abstract class Hero {
    protected String name;
    protected int HP;
    protected int mana;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", mana=" + mana +
                '}';
    }

    public Hero(String name, int HP, int mana) {
        this.name = name;
        this.HP = HP;
        this.mana = mana;
    }

    public abstract void firePrimary();
    public abstract void fireSecondary();
    public abstract void recieveHit();

}
