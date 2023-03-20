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


