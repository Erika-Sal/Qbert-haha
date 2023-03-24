import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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

public class GamePanel extends JPanel implements ActionListener, KeyListener {
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
Timer t = new Timer(5,this);
    boolean[] lives = {true, true, true};
    boolean[] spaces = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    bert p1 = new bert(400,100, this, spaces, lives);
    public GamePanel() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

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

        g2.setColor(Color.YELLOW);
        Image img1 = Toolkit.getDefaultToolkit().getImage("Qbert map.PNG"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 870 , 800 , this);

        Rectangle2D one = new Rectangle(50,60, 150,200);



        if(p1.getSpaces()[0]){
            int xPoly1[] = {435,493,435,382};
            int yPoly1[] = {128,154,180,152};
            Polygon poly1 = new Polygon(xPoly1, yPoly1, xPoly1.length);
            g2.drawPolygon(poly1);
            g2.fill(poly1);
        }

        if(p1.getSpaces()[1]){
            int xPoly2[] = {377,435,382,326};
            int yPoly2[] = {203,232,260,232};
            Polygon poly2 = new Polygon(xPoly2, yPoly2, xPoly2.length);
            g2.drawPolygon(poly2);
            g2.fill(poly2);
        }

        if(p1.getSpaces()[2]){
            int xPoly3[] = {495,550,495,440};
            int yPoly3[] = {203,232,258,232};
            Polygon poly3 = new Polygon(xPoly3, yPoly3, xPoly3.length);
            g2.drawPolygon(poly3);
            g2.fill(poly3);
        }

        if(p1.getSpaces()[3]){
            int xPoly4[] = {326,382,326,270};
            int yPoly4[] = {280,310,340,310};
            Polygon poly4 = new Polygon(xPoly4, yPoly4, xPoly4.length);
            g2.drawPolygon(poly4);
            g2.fill(poly4);
        }

        if(p1.getSpaces()[4]){
            int xPoly5[] = {435,492,435,382};
            int yPoly5[] = {280,308,338,310};
            Polygon poly5 = new Polygon(xPoly5, yPoly5, xPoly5.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly5);
            g2.fill(poly5);
        }

        if(p1.getSpaces()[5]){
            int xPoly6[] = {550,605,550,495};
            int yPoly6[] = {280,308,338,310};
            Polygon poly6 = new Polygon(xPoly6, yPoly6, xPoly6.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly6);
            g2.fill(poly6);
        }

        if(p1.getSpaces()[6]){
            int xPoly7[] = {270,326,272,215};
            int yPoly7[] = {358,386,413,386};
            Polygon poly7 = new Polygon(xPoly7, yPoly7, xPoly7.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly7);
            g2.fill(poly7);
        }

        if(p1.getSpaces()[7]){
            int xPoly8[] = {382,326,382,435};
            int yPoly8[] = {358,386,413,386};
            Polygon poly8 = new Polygon(xPoly8, yPoly8, xPoly8.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly8);
            g2.fill(poly8);
        }

        if(p1.getSpaces()[8]){
            int xPoly9[] = {496,551,494,435};
            int yPoly9[] = {356,386,413,386};
            Polygon poly9 = new Polygon(xPoly9, yPoly9, xPoly9.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly9);
            g2.fill(poly9);
        }

        if(p1.getSpaces()[9]){
            int xPoly10[] = {605,550,605,660};
            int yPoly10[] = {358,386,413,386};
            Polygon poly10 = new Polygon(xPoly10, yPoly10, xPoly10.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly10);
            g2.fill(poly10);
        }

        if(p1.getSpaces()[10]){
            int xPoly11[] = {215,270,215,160};
            int yPoly11[] = {435,464,490,462};
            Polygon poly11 = new Polygon(xPoly11, yPoly11, xPoly11.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly11);
            g2.fill(poly11);
        }

        if(p1.getSpaces()[11]){
            int xPoly12[] = {327,380,327,270};
            int yPoly12[] = {435,462,490,462};
            Polygon poly12 = new Polygon(xPoly12, yPoly12, xPoly12.length);
            g2.drawPolygon(poly12);
            g2.fill(poly12);
        }

        if(p1.getSpaces()[12]){
            int xPoly13[] = {438,496,438,380};
            int yPoly13[] = {435,462,490,462};
            Polygon poly13 = new Polygon(xPoly13, yPoly13, xPoly13.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly13);
            g2.fill(poly13);
        }

        if(p1.getSpaces()[13]){
            int xPoly14[] = {552,605,552,494};
            int yPoly14[] = {435,462,490,462};
            Polygon poly14 = new Polygon(xPoly14, yPoly14, xPoly14.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly14);
            g2.fill(poly14);
        }

        if(p1.getSpaces()[14]){
            int xPoly15[] = {660,716,660,605};
            int yPoly15[] = {435,462,490,462};
            Polygon poly15 = new Polygon(xPoly15, yPoly15, xPoly15.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly15);
            g2.fill(poly15);
        }


        if(p1.getSpaces()[15]){
            int xPoly16[] = {160,105,160,211};
            int yPoly16[] = {515,540,570,539};
            Polygon poly16 = new Polygon(xPoly16, yPoly16, xPoly16.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly16);
            g2.fill(poly16);
        }

        if(p1.getSpaces()[16]){
            int xPoly17[] = {273,215,270,323};
            int yPoly17[] = {513,539,570,539};
            Polygon poly17 = new Polygon(xPoly17, yPoly17, xPoly17.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly17);
            g2.fill(poly17);
        }

        if(p1.getSpaces()[17]){
            int xPoly18[] = {383,325,380,435};
            int yPoly18[] = {513,540,570,539};
            Polygon poly18 = new Polygon(xPoly18, yPoly18, xPoly18.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly18);
            g2.fill(poly18);
        }

        if(p1.getSpaces()[18]){
            int xPoly19[] = {495,440,495,545};
            int yPoly19[] = {515,540,565,539};
            Polygon poly19 = new Polygon(xPoly19, yPoly19, xPoly19.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly19);
            g2.fill(poly19);
        }

        if(p1.getSpaces()[19]){
            int xPoly20[] = {605,550,605,660};
            int yPoly20[] = {515,540,565,539};
            Polygon poly20 = new Polygon(xPoly20, yPoly20, xPoly20.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly20);
            g2.fill(poly20);
        }

        if(p1.getSpaces()[20]){
            int xPoly21[] = {715,660,715,770};
            int yPoly21[] = {515,540,565,539};
            Polygon poly21 = new Polygon(xPoly21, yPoly21, xPoly21.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly21);
            g2.fill(poly21);
        }


        if(p1.getSpaces()[21]){
            int xPoly22[] = {105, 47, 105, 160};
            int yPoly22[] = {590,615,645,615};
            Polygon poly22 = new Polygon(xPoly22, yPoly22, xPoly22.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly22);
            g2.fill(poly22);
        }

        if(p1.getSpaces()[22]){
            int xPoly23[] = {215, 157, 215, 270};
            int yPoly23[] = {590,615,645,615};
            Polygon poly23 = new Polygon(xPoly23, yPoly23, xPoly23.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly23);
            g2.fill(poly23);
        }

        if(p1.getSpaces()[23]){
            int xPoly24[] = {325, 270, 325, 380};
            int yPoly24[] = {590,615,645,615};
            Polygon poly24 = new Polygon(xPoly24, yPoly24, xPoly24.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly24);
            g2.fill(poly24);
        }

        if(p1.getSpaces()[24]){
            int xPoly25[] = {435, 380, 435, 490};
            int yPoly25[] = {590,615,645,615};
            Polygon poly25 = new Polygon(xPoly25, yPoly25, xPoly25.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly25);
            g2.fill(poly25);
        }

        if(p1.getSpaces()[25]){
            int xPoly26[] = {550, 495, 550, 605};
            int yPoly26[] = {590,615,645,615};
            Polygon poly26 = new Polygon(xPoly26, yPoly26, xPoly26.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly26);
            g2.fill(poly26);
        }

        if(p1.getSpaces()[26]){
            int xPoly27[] = {660, 605, 660, 715};
            int yPoly27[] = {590,615,645,615};
            Polygon poly27 = new Polygon(xPoly27, yPoly27, xPoly27.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly27);
            g2.fill(poly27);
        }

        if(p1.getSpaces()[27]){
            int xPoly28[] = {775,720,775,825};
            int yPoly28[] = {590,615,645,615};
            Polygon poly28 = new Polygon(xPoly28, yPoly28, xPoly28.length);
            g2.setColor(Color.YELLOW);
            g2.drawPolygon(poly28);
            g2.fill(poly28);

        }
        p1.drawSelf(g2);

        if(p1.win()){
            Image img3 = Toolkit.getDefaultToolkit().getImage("QbertLevelComplete.PNG"); /*the image cannot be in the SRC folder*/
            g2.drawImage(img3, 0 , 0 , 870 , 800 , this);

        }


    }







    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();
    if(code == KeyEvent.VK_UP){
        p1.up();
        repaint();
    }
    if(code==KeyEvent.VK_DOWN){
        p1.down();
        repaint();
    }
    if(code==KeyEvent.VK_LEFT){
        p1.left();
        repaint();
    }
    if(code==KeyEvent.VK_RIGHT){
        p1.right();
        repaint();
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


