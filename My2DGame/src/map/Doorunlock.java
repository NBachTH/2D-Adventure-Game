package map;

import main.Panel;

public class Doorunlock extends MapObject {

    public Doorunlock(Panel gp, int col, int row) {
        super(gp, col, row);
        name = "Door_unlock";
        collision = false;
    }
}
