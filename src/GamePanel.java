import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.imageio.ImageIO;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.MouseEvent;
        import java.awt.event.MouseListener;
        import java.awt.font.FontRenderContext;
        import java.awt.font.GlyphVector;
        import java.awt.geom.AffineTransform;
        import java.awt.geom.Rectangle2D;
        import java.awt.image.*;
        import java.awt.image.renderable.RenderableImage;
        import java.io.IOException;
        import java.text.AttributedCharacterIterator;
        import java.util.Map;
        import java.util.Random;
        import java.util.ResourceBundle;
        import java.net.URL;
        import java.awt.Rectangle;
        import java.awt.Shape;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

        import java.util.concurrent.TimeUnit;

public class GamePanel extends JPanel implements MouseListener {
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 18;
    final int maxScreenRow = 15;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    Image spinnerr;
    Image cards;
    boolean spin;
    boolean changes;
    int int_random;
    boolean win1 = false;
    boolean win2 = false;
    int FPS = 60;
    Thread gameThread;
    boolean start =true;
    boolean player2 = false;
    JLabel label1;
    JLabel label2;
    JLabel label3;

    JLabel player1stats;
    JLabel player2stats;

    boolean one = false;
    boolean two = false;


    JLabel player1;
    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        this.setDoubleBuffered(true);

    }

    public void startGameThread() {

        gameThread = new Thread() {
            public void run() {
                        try {
                            repaint();
                            gameThread.currentThread().sleep(5 * 1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
            }
        };


        gameThread.start();
    }



    public void paintComponent(Graphics g)  {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Image img1 = Toolkit.getDefaultToolkit().getImage("Qbert map.PNG"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 870 , 800 , this);

        Rectangle2D one = new Rectangle(50,60, 150,200);

        int xPoly24[] = {325, 270, 325, 380};
        int yPoly24[] = {590,615,645,615};
        Polygon poly24 = new Polygon(xPoly24, yPoly24, xPoly24.length);
        g2.setColor(Color.YELLOW);
        g2.drawPolygon(poly24);
        g2.fill(poly24);

        int xPoly25[] = {435, 380, 435, 490};
        int yPoly25[] = {590,615,645,615};
        Polygon poly25 = new Polygon(xPoly25, yPoly25, xPoly25.length);
        g2.setColor(Color.YELLOW);
        g2.drawPolygon(poly25);
        g2.fill(poly25);

        int xPoly26[] = {550, 495, 550, 605};
        int yPoly26[] = {590,615,645,615};
        Polygon poly26 = new Polygon(xPoly26, yPoly26, xPoly26.length);
        g2.setColor(Color.YELLOW);
        g2.drawPolygon(poly26);
        g2.fill(poly26);

        int xPoly27[] = {660, 605, 660, 715};
        int yPoly27[] = {590,615,645,615};
        Polygon poly27 = new Polygon(xPoly27, yPoly27, xPoly27.length);
        g2.setColor(Color.YELLOW);
        g2.drawPolygon(poly27);
        g2.fill(poly27);

        int xPoly28[] = {775,720,775,825};
        int yPoly28[] = {590,615,645,615};
        Polygon poly28 = new Polygon(xPoly28, yPoly28, xPoly28.length);
        g2.setColor(Color.YELLOW);
        g2.drawPolygon(poly28);
        g2.fill(poly28);


    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


