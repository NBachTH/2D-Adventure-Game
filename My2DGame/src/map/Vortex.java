package map;

import main.Panel;

public class Vortex extends MapObject {

    public Vortex(Panel gp, int col, int row) {
        super(gp, col, row);
        name = "Vortex";
        collision = false;
    }
}
