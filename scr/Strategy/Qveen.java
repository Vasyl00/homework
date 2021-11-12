package Strategy;

public class Qveen extends Character  {

    public void setW(WeaponBehaviourable w) {
        this.w = w;
    }

    public Qveen(WeaponBehaviourable w) {
        this.w = w;
    }

    private WeaponBehaviourable w;



    @Override
    void fight() {
        w.WeaponBehaviour();
    }
}