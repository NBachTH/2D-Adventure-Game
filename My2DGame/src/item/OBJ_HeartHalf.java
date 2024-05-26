package item;

import entity.Player;
import main.Panel;

public class OBJ_HeartHalf extends Item {

    public OBJ_HeartHalf(Panel gp, int col, int row) {

        super(gp, col, row);
        name = "Heart_Half";
        value = 6;
        type = 1;
    }

    @Override
    public void ieffect(Player entity) {
        gp.Ui.addMessage("HP + " + value);
        entity.HP += value;
    }
}
