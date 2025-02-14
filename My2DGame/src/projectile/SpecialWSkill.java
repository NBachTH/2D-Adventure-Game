package projectile;

import entity.Entity;
import main.Panel;

public class SpecialWSkill extends Projectile {

    public SpecialWSkill(Panel gp, Entity entity) {
        super(gp, entity);
        name = "Ném dầu ăn";
        speed = 5;
        tempSpeed = speed;
        MaxHP = 40;
        ATK = user.ATK;
        time = 40;
        HP = MaxHP;
        cost = 0;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void set(int x, int y, int direction, boolean alive, int ATK) {
        super.set(x, y, direction, alive, ATK);
        this.ATK = user.ATK;
    }
}
