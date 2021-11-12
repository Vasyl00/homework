package Strategy;

public class Troll extends Character  {
    public void setW(WeaponBehaviourable w) {
        this.w = w;
    }
    private WeaponBehaviourable w;




    public Troll(WeaponBehaviourable w) {

        this.w = w;
    }

    @Override
    void fight() {
       w.WeaponBehaviour();
    }
}
