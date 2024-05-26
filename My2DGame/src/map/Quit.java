package map;

import entity.Player;
import main.Panel;

public class Quit extends MapObject {

    public Quit(Panel gp, int col, int row) {
        super(gp, col, row);
        name = "Quit";

    }

    @Override
    public void effect(Player player) {
        gp.gameState = gp.titleState;
        gp.Ui.commandNum = 0;
    }
}
