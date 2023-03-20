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
    final int maxScreenRow = 12;
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


                player1stats = new JLabel("<html>Hello World!<br/>blahblahblah</html>");
                player1stats.setBounds(10, 700, 250, 70);
                Font fonty = new Font("SansSerif", Font.BOLD, 12);
                player1stats.setFont(fonty);
                player1stats.setBackground(Color.WHITE);
                player1stats.setOpaque(true);
                player1stats.setText("<html>Player 1 -- Money: $" + p1.getMoney() + ", Career: " + p1.getCareer() + ", Salary: $" + p1.getSalary() + ", Babies: " + p1.getBabies());
                player1stats.setVisible(true);
                add(player1stats);

                player2stats = new JLabel("<html>Hello World!<br/>blahblahblah</html>");
                player2stats.setBounds(10, 700, 250, 70);
                player2stats.setFont(fonty);
                player2stats.setBackground(Color.WHITE);
                player2stats.setOpaque(true);
                player2stats.setText("<html>Player 2 -- Money: $" + p2.getMoney() + ", Career: " + p2.getCareer() +", Salary: $" + p2.getSalary() + ", Babies: " + p2.getBabies());
                player2stats.setVisible(true);
                add(player2stats);

                if(start)
                {

                    player1 = new JLabel("The Label", SwingConstants.CENTER);
                    player1.setBounds(300, 50, 250, 70);
                    Font font = new Font("SansSerif", Font.BOLD, 18);
                    player1.setFont(font);
                    player1.setBackground(Color.WHITE);
                    player1.setOpaque(true);
                    player1.setText("Player 1 - Select a Career");
                    player1.setVisible(true);
                    add(player1);
                    JLabel label1;
                    label1 = new JLabel();
                    label1.setBounds(100,150,200,300);
                    label1.setBackground(Color.WHITE);
                    label1.setOpaque(true);
                    careerCard one = new careerCard();
                    Image temp1 = one.pickCard();
                    Image dup1 = temp1;
                    System.out.println("one " + one.getValue());
                    int money1 = one.getValue();
                    System.out.println(money1);
                    temp1 = temp1.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    ImageIcon icon1 = new ImageIcon(temp1);
                    label1.setIcon(icon1);
                    add(label1);
                    setVisible(true);

                    JLabel label2;
                    label2 = new JLabel();

                    label2.setBounds(340,150,200,300);
                    label2.setBackground(Color.black);
                    label2.setOpaque(true);
                    careerCard two = new careerCard();
                    Image temp2 = two.pickCard();
                    Image dup2 = temp2;
                    while(temp2 == dup1){
                        temp2 = two.pickCard();
                    }
                    System.out.println("two " + two.getValue());
                    int money2 = two.getValue();
                    System.out.println(money2);
                    temp2 = temp2.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    ImageIcon icon2 = new ImageIcon(temp2);
                    label2.setIcon(icon2);
                    add(label2);
                    setVisible(true);

                    JLabel label3;
                    label3 = new JLabel();
                    label3.setBounds(580,150,200,300);
                    label3.setBackground(Color.black);
                    label3.setOpaque(true);
                    careerCard three = new careerCard();
                    Image temp3 = three.pickCard();
                    while(temp3 == dup1 || temp3 == dup2){
                        temp3 = three.pickCard();
                    }
                    System.out.println("three " + three.getValue());
                    int money3 = three.getValue();
                    System.out.println(money3);
                    temp3 = temp3.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    ImageIcon icon3 = new ImageIcon(temp3);
                    label3.setIcon(icon3);
                    add(label3);

                    label3.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Point p = new Point();
                            start=false;
                            // while(label1.isVisible()){
                            player1.setText("Player 2 - Select a career");
                            player1.setBounds(300, 50, 250, 70);

                            //add(player1);
                            p1.setCareer(three.getCar());
                            p1.setSalary(money3);
                            System.out.println(p1.getSalary());
                            label3.setVisible(false);
                            label2.setVisible(false);
                            label1.setVisible(false);
                            // player1.setVisible(false);

                            //}
                            player2=true;




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
                    });
                    label2.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Point p = new Point();
                            System.out.println("Clicked");
                            start=false;
                            p1.setCareer(two.getCar());
                            p1.setSalary(money2);
                            System.out.println(p1.getSalary());
                            // while(label1.isVisible()){
                            label3.setVisible(false);
                            label2.setVisible(false);
                            label1.setVisible(false);
                            //}
                            // player1.setVisible(false);
                            player1.setText("Player 2 - Select a career");
                            player1.setBounds(300, 50, 250, 70);
                            //add(player1);
                            player2=true;




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
                    });

                    label1.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Point p = new Point();
                            System.out.println("Clicked");
                            start=false;
                            p1.setCareer(one.getCar());
                            p1.setSalary(one.getValue());
                            System.out.print(p1.getSalary());
                            player1.setBounds(300, 50, 250, 70);

                            // while(label1.isVisible()){
                            label3.setVisible(false);
                            label2.setVisible(false);
                            label1.setVisible(false);
                            player1.setText("Player 2 - Select a career");
                            //add(player1);
                            //player1.setVisible(false);
                            player2 = true;
                            //}




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
                    });
                }
                while(start){
                    repaint();
                    try {
                        gameThread.sleep(1000 / FPS);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                if(player2)
                {


                    JLabel label1;
                    label1 = new JLabel();
                    label1.setBounds(100,150,200,300);
                    label1.setBackground(Color.black);
                    label1.setOpaque(true);
                    careerCard one = new careerCard();
                    Image temp1 = one.pickCard();
                    Image dup1 = temp1;
                    System.out.println("one " + one.getValue());
                    int money1 = one.getValue();
                    System.out.println(money1);
                    temp1 = temp1.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    ImageIcon icon1 = new ImageIcon(temp1);
                    label1.setIcon(icon1);
                    add(label1);
                    setVisible(true);

                    JLabel label2;
                    label2 = new JLabel();

                    label2.setBounds(340,150,200,300);
                    label2.setBackground(Color.black);
                    label2.setOpaque(true);
                    careerCard two = new careerCard();
                    Image temp2 = two.pickCard();
                    Image dup2 = temp2;
                    while(temp2 == dup1){
                        temp2 = two.pickCard();
                    }

                    System.out.println("two " + two.getValue());
                    int money2 = two.getValue();
                    System.out.println(money2);
                    temp2 = temp2.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    ImageIcon icon2 = new ImageIcon(temp2);
                    label2.setIcon(icon2);
                    add(label2);
                    setVisible(true);

                    JLabel label3;
                    label3 = new JLabel();
                    label3.setBounds(580,150,200,300);
                    label3.setBackground(Color.black);
                    label3.setOpaque(true);
                    careerCard three = new careerCard();
                    Image temp3 = three.pickCard();
                    while(temp3 == dup1 || temp3 == dup2){
                        temp3 = three.pickCard();
                    }
                    System.out.println("three " + three.getValue());
                    int money3 = three.getValue();
                    System.out.println(money3);
                    temp3 = temp3.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                    ImageIcon icon3 = new ImageIcon(temp3);
                    label3.setIcon(icon3);
                    add(label3);

                    label3.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Point p = new Point();
                            player2=false;
                            // while(label1.isVisible()){
                            p2.setCareer(three.getCar());
                            p2.setSalary(money3);
                            System.out.println(p2.getSalary());
                            label3.setVisible(false);
                            label2.setVisible(false);
                            label1.setVisible(false);
                            player1.setVisible(false);
                            //}
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
                    });
                    label2.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Point p = new Point();
                            System.out.println("Clicked");
                            player2=false;
                            p2.setCareer(two.getCar());
                            p2.setSalary(money2);
                            System.out.println(p2.getSalary());
                            // while(label1.isVisible()){
                            label3.setVisible(false);
                            label2.setVisible(false);
                            label1.setVisible(false);
                            player1.setVisible(false);

                            //}




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
                    });

                    label1.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Point p = new Point();
                            System.out.println("Clicked");
                            player2=false;
                            p2.setCareer(one.getCar());
                            p2.setSalary(one.getValue());
                            System.out.print(p2.getSalary());
                            // while(label1.isVisible()){
                            player1.setVisible(false);

                            label3.setVisible(false);
                            label2.setVisible(false);
                            label1.setVisible(false);

                            //}




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
                    });

                }
                while(player2){
                    repaint();
                    try {
                        gameThread.sleep(1000 / FPS);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                try {
                    repaint();
                    gameThread.currentThread().sleep(1 * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(!start && !player2){
                    while(p1.getSteps() < 2700 || p2.getSteps() < 2700) {
                        Random rand = new Random();
                        int upperbound = 10;
                        spin=false;
                        if(p1.getSteps() < 2700 && !spin){
                            int_random = rand.nextInt(upperbound) + 1;
                            spinner temp = new spinner();
                            spinnerr = temp.showSpin(int_random);
                            Image idc =  Toolkit.getDefaultToolkit().getImage("tempsnip.png");
                            idc = idc.getScaledInstance(190, 160, Image.SCALE_SMOOTH);
                            ImageIcon spin1 = new ImageIcon(idc);

                            JLabel labelspin1;
                            labelspin1 = new JLabel();
                            labelspin1.setVisible(true);
                            labelspin1.setBounds(12 , 300 , 190 , 160);
                            labelspin1.setBackground(Color.blue);
                            labelspin1.setOpaque(true);
                            labelspin1.setIcon(spin1);
                            add(labelspin1);
                            setVisible(true);
                            repaint();
                            labelspin1.addMouseListener(new MouseListener() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    spin = true;
                                    labelspin1.setVisible(false);
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
                            });
                            while(!spin){
                                try {
                                    gameThread.currentThread().sleep(9 * 1000);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }

                            spin = false;
                            //int_random =7;
                            p1.setCnt(int_random);
                        }

                        while (p1.getCnt() > 0 && p1.getSteps() < 2700) {
                            movePieces();
                            System.out.println(p1.getCnt());
                            repaint();
                            try {
                                gameThread.sleep(1000 / FPS);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }

                        p1.setCnt(0);


                        if(p1.getSteps() == 586 || p1.getSteps() == 851 || p1.getSteps() == 951 || p1.getSteps() == 1291 || p1.getSteps() == 1561){
                            p1.setBabies(1);

                        }else if(p1.getSteps() == 1056 || p1.getSteps() == 1221 || p1.getSteps() == 1781 || p1.getSteps() == 2091){
                            p1.setBabies(2);
                        }else if(p1.getSteps() < 2700 && p1.getSteps() != 186 && p1.getSteps() !=416 && p1.getSteps() != 546 && p1.getSteps() != 751 && p1.getSteps() != 1141 && p1.getSteps() != 1681 && p1.getSteps()!=1881 && p1.getSteps() != 2411){
                            actionCard a = new actionCard();
                            cards = a.pickCard();
                            int val = a.getIndex();
                            //System.out.println(val);
                            if(val == 0){
                                p1.subMoney(50000);
                                // System.out.println(p1.getMoney());
                            }else if(val == 1){
                                p1.subMoney(30000);
                                // System.out.println(p1.getMoney());
                            }else if(val == 2){
                                p1.subMoney(50000);
                                // System.out.println(p1.getMoney());
                            }else if(val == 3){
                                p1.addMoney(50000);
                                // System.out.println(p1.getMoney());
                            }else if(val == 4){
                                p1.subMoney(50000);
                                //  System.out.println(p1.getMoney());
                            }else if(val == 5){
                                p1.subMoney(50000);
                                // System.out.println(p1.getMoney());
                            }else if(val == 6){
                                p1.addMoney(60000);
                                // System.out.println(p1.getMoney());
                            }else if(val == 7){
                                p1.subMoney(50000);
                                //  System.out.println(p1.getMoney());
                            }else if(val == 8){
                                p1.subMoney(50000);
                                //  System.out.println(p1.getMoney());
                            }else if(val == 9){
                                p1.addMoney(70000);
                                //   System.out.println(p1.getMoney());
                            }else if(val == 10){
                                p1.subMoney(60000);
                                //System.out.println(p1.getMoney());
                            }else if(val == 11){
                                p1.subMoney(80000);
                                System.out.println(p1.getMoney());
                            }else if(val == 12){
                                p1.subMoney(150000);
                                System.out.println(p1.getMoney());
                                p1.getMoney();
                            }else if(val == 13){
                                p1.subMoney(40000);
                                System.out.println(p1.getMoney());
                            }else if(val == 14){
                                p1.subMoney(80000);
                                System.out.println(p1.getMoney());
                            }else if(val == 15){
                                p1.addMoney(70000);
                                System.out.println(p1.getMoney());
                            }else if(val == 16){
                                p1.addMoney(80000);
                                System.out.println(p1.getMoney());
                            }else if(val == 17){
                                p1.addMoney(100000);
                                System.out.println(p1.getMoney());
                            }else if(val == 18){
                                p1.subMoney(70000);
                                System.out.println(p1.getMoney());
                            }else if(val == 19){
                                p1.subMoney(50000);
                                System.out.println(p1.getMoney());
                            }else if(val == 20){
                                p1.addMoney(50000);
                                System.out.println(p1.getMoney());
                            }else if(val == 21){
                                p1.addMoney(70000);
                                System.out.println(p1.getMoney());
                            }else{
                                p1.addMoney(80000);
                                System.out.println(p1.getMoney());
                            }
                            changes = true;
                        }
                        try {
                            repaint();
                            gameThread.currentThread().sleep(5 * 1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        changes = false;
                        player1stats.setText("<html>Player 1 -- Money: $" + p1.getMoney() + ", Career: " + p1.getCareer() + ", Salary: $" + p1.getSalary() + ", Babies: " + p1.getBabies());

                        repaint();
                        if(p2.getSteps() < 2700){
                            int_random = rand.nextInt(upperbound) + 1;
                            spin=false;
                            spinner temp = new spinner();
                            spinnerr = temp.showSpin(int_random);
                            Image idc =  Toolkit.getDefaultToolkit().getImage("tempsnip.png");
                            idc = idc.getScaledInstance(190, 160, Image.SCALE_SMOOTH);
                            ImageIcon spin1 = new ImageIcon(idc);

                            JLabel labelspin1;
                            labelspin1 = new JLabel();
                            labelspin1.setVisible(true);
                            labelspin1.setBounds(12 , 300 , 190 , 160);
                            labelspin1.setBackground(Color.blue);
                            labelspin1.setOpaque(true);
                            labelspin1.setIcon(spin1);
                            add(labelspin1);
                            setVisible(true);
                            repaint();
                            labelspin1.addMouseListener(new MouseListener() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    spin = true;
                                    labelspin1.setVisible(false);
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
                            });
                            try {
                                gameThread.currentThread().sleep(9 * 1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            spin = false;
                            //int_random =7;
                            p2.setCnt(int_random);
                        }
                        while (p2.getCnt() > 0 && p2.getSteps() < 2700) {
                            movePieces();
                            System.out.println(p2.getCnt());
                            try {
                                gameThread.sleep(1000 / FPS);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        if(p2.getSteps() == 586 || p2.getSteps() == 851 || p2.getSteps() == 951 || p2.getSteps() == 1291 || p2.getSteps() == 1561) {
                            p2.setBabies(1);

                        }else if(p2.getSteps() == 1056 || p2.getSteps() == 1221 || p2.getSteps() == 1781 || p2.getSteps() == 2091){
                            p2.setBabies(2);
                        }else if(p2.getSteps() < 2700 && p2.getSteps() < 2700 && p2.getSteps() != 186 && p2.getSteps() !=416 && p2.getSteps() != 546 && p2.getSteps() != 751 && p2.getSteps() != 1141 && p2.getSteps() != 1681 && p2.getSteps()!=1881 && p2.getSteps() != 2471){
                            actionCard a = new actionCard();
                            cards = a.pickCard();
                            int val = a.getIndex();
                            if(val == 0){
                                p2.subMoney(50000);
                            }else if(val == 1){
                                p2.subMoney(30000);
                            }else if(val == 2){
                                p2.subMoney(50000);
                            }else if(val == 3){
                                p2.addMoney(50000);
                            }else if(val == 4){
                                p2.subMoney(50000);
                            }else if(val == 5){
                                p2.subMoney(50000);
                            }else if(val == 6){
                                p2.addMoney(60000);
                            }else if(val == 7){
                                p2.subMoney(50000);
                            }else if(val == 8){
                                p2.subMoney(50000);
                            }else if(val == 9){
                                p2.addMoney(70000);
                            }else if(val == 10){
                                p2.subMoney(60000);
                            }else if(val == 11){
                                p2.subMoney(80000);
                            }else if(val == 12){
                                p2.subMoney(150000);
                            }else if(val == 13){
                                p2.subMoney(40000);
                            }else if(val == 14){
                                p2.subMoney(80000);
                            }else if(val == 15){
                                p2.addMoney(70000);
                            }else if(val == 16){
                                p2.addMoney(80000);
                            }else if(val == 17){
                                p2.addMoney(100000);
                            }else if(val == 18){
                                p2.subMoney(70000);
                            }else if(val == 19){
                                p2.subMoney(50000);
                            }else if(val == 20){
                                p2.addMoney(50000);
                            }else if(val == 21){
                                p2.addMoney(70000);
                            }else{
                                p2.addMoney(80000);
                            }
                            changes = true;
                        }
                        try {
                            repaint();
                            gameThread.currentThread().sleep(5 * 1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        p2.setCnt(0);
                        changes = false;
                        player2stats.setText("<html>Player 2 -- Money: $" + p2.getMoney() + ", Career: " + p2.getCareer() +", Salary: $" + p2.getSalary() + ", Babies: " + p2.getBabies());
                        repaint();
                    }
                    //print end game totals here
                    for(int i = p1.getBabies(); i >-1; i--){
                        p1.addMoney(20000);
                    }

                    for(int i = p2.getBabies(); i >-1; i--){
                        p2.addMoney(20000);
                    }
                    System.out.println("Player 1's Money: "+ "$" + p1.getMoney());
                    System.out.println("Player 1's Number of Children: " + p1.getBabies());
                    System.out.println("Player 2's Number of Children: " + p2.getBabies());
                    System.out.println("Player 2's Money: "+ "$" + p2.getMoney());
                    winner();
                }// end of true false if
            }
        };


        gameThread.start();
    }


    public void winner() {

        if (p1.getMoney() > p2.getMoney()) {
            one = true;

        }else
            two = true;
    }


    public void setCard(Image card){

    }
    //erika eat cheeseee
//test pushh

    public void movePieces() {

        if(p1.getSteps() < 2800 && p1.getCnt() > 0){
            p1.move();
            p1.setSteps();
            repaint();

        }
        if(p2.getSteps()< 2800 && p2.getCnt() > 0 ){
            p2.move();
            p2.setSteps();
            repaint();
        }

    }

    public void paintComponent(Graphics g)  {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;





        Image img1 = Toolkit.getDefaultToolkit().getImage("lastGameBoard.jpg"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 870 , 580 , this);




        if(one )
        {
            Image p1 = Toolkit.getDefaultToolkit().getImage("P1wins.PNG");
            g2.drawImage(p1,35,35,800,510,this);
        }
        if(two)
        {
            Image p2 = Toolkit.getDefaultToolkit().getImage("P2wins.PNG");
            g2.drawImage(p2,35,35,800,510,this);
        }

        if(spin){
            g2.drawImage(spinnerr, 12 , 300 , 190 , 160 , this);
        }
        Image spin = Toolkit.getDefaultToolkit().getImage("10.gif");
        //g2.rotate(Math.toRadians(30), 10,10);
        g2.drawImage(spin,12,271,200,200,this);

        Image actionCard = Toolkit.getDefaultToolkit().getImage("actionCard.PNG");

        g2.drawImage(actionCard,742,7,110,145,this);



        Image houseCard = Toolkit.getDefaultToolkit().getImage("houseCard.PNG");
        g2.drawImage(houseCard,685,157,170,85,this);

        Image careerCard = Toolkit.getDefaultToolkit().getImage("careerCard.PNG");
        g2.drawImage(careerCard,685,246,170,85,this);





        if (p1 != null){
            p1.drawSelf(g, 1);
        }
        if(p2 != null){
            p2.drawSelf(g, 2);

        }
        if(changes){
            g2.drawImage(cards, 300,100, 250  , 350, this);
        }



        if(one == true)
        {
            Image p1 = Toolkit.getDefaultToolkit().getImage("P1wins.PNG");
            g2.drawImage(p1,35,35,800,510,this);
        }
        if(two == true)
        {
            Image p2 = Toolkit.getDefaultToolkit().getImage("P2wins.PNG");
            g2.drawImage(p2,35,35,800,510,this);
        }



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


