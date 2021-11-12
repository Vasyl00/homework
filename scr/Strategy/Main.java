package Strategy;

public class Main {
    public static void main(String[] args) {
        Knife knife = new Knife();
        Axe axe = new Axe();
        BowAndArrow bow = new BowAndArrow();
        Sword sword = new Sword();


        King k = new King(axe);
        k.fight();
        k.setW(knife);
        k.fight();

        Troll t = new Troll(knife);
        k.fight();
        t.setW(sword);
        t.fight();

        Qveen q = new Qveen(sword);
        k.fight();
        q.setW(bow);
        q.fight();

        Knight kn = new Knight(sword);
        k.fight();
        kn.setW(axe);
        kn.fight();

    }
}
