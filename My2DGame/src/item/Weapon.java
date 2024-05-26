package item;

import java.awt.Rectangle;

import entity.Player;
import main.Panel;

public class Weapon extends Item {

    public int iATK;
    public Rectangle attackArea;

    public Weapon(Panel gp, int col, int row) {
        super(gp, col, row);
        type = 3;
    }

    @Override
    public void ieffect(Player player) {

    }

}
