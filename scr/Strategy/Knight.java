package Strategy;

public class Knight extends Character{
    public void setW(WeaponBehaviourable w) {
        this.w = w;
    }

    public Knight(WeaponBehaviourable w) {
        this.w = w;
    }

    private WeaponBehaviourable w;



    @Override
    void fight() {
        w.WeaponBehaviour();
    }
}

