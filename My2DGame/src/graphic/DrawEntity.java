package graphic;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Panel;
import main.UtilityTool;

public class DrawEntity {

    BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    Panel gp;
    public int xS, yS;

    public BufferedImage setupImage(String imagePath, int width, int height) {
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath));
            image = uTool.scaleImage(image, width, height);
        } catch (IOException e) {
        }
        return image;
    }
}
