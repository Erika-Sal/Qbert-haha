import java.awt.*;

public class bert {
double x, y;
    GamePanel gp;
    public bert(int xVal, int yVal, GamePanel gp){
        x = xVal;
        y = yVal;
        this.gp = gp;
    }

    public void drawSelf(Graphics g){
        Image qBert = Toolkit.getDefaultToolkit().getImage("bert.png"); /*the image cannot be in the SRC folder*/
        g.drawImage(qBert, (int)x, (int)y, 70,70,gp );
    }
}

