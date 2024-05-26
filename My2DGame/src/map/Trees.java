package map;

import entity.Entity;
import main.Panel;

public class Trees extends MapObject {

    public Trees(Panel gp, int col, int row) {
        super(gp, col, row);
        name = "Trees";
        collision = false;

    }

    @Override
    public void effect(Entity entity) {

    }
}
