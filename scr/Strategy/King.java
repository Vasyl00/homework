package Strategy;

public class King extends Character {
    private WeaponBehaviourable w;

    public void setW(WeaponBehaviourable w) {
        this.w = w;
    }

    public King(WeaponBehaviourable w) {

        this.w = w;
    }

    @Override
    void fight() {
        w.WeaponBehaviour();

    }


}
