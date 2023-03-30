import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class ball {
    double x, y;
    boolean lose = false;
    GamePanel gp;
    final int oneX = 400;
    final int oneY = 100;
    final int twoX = 350;
    final int twoY = 170;
    final int threeX = 460;
    final int threeY = 170;
    final int fourX = 290;
    final int fourY = 250;
    final int fiveX = 400;
    final int fiveY = 250;
    final int sixX = 520;
    final int sixY = 240;
    final int sevenX = 240;
    final int sevenY = 320;
    final int eightX = 350;
    final int eightY = 330;
    final int nineX = 460;
    final int nineY = 320;
    final int tenX = 570;
    final int tenY = 320;
    final int elevenX = 180;
    final int elevenY = 400;
    final int twelveX = 290;
    final int twelveY = 400;
    final int thirteenX = 400;
    final int thirteenY = 400;
    final int fourteenX = 520;
    final int fourteenY = 400;
    final int fifteenX = 630;
    final int fifteenY = 400;
    final int sixteenX = 120;
    final int sixteenY = 480;
    final int seventeenX = 240;
    final int seventeenY = 480;
    final int eighteenX = 350;
    final int eighteenY = 480;
    final int nineteenX = 460;
    final int nineteenY = 480;
    final int twentyX = 580;
    final int twentyY = 480;
    final int twentyOneX = 690;
    final int twentyOneY = 480;
    final int twentyTwoX = 60;
    final int twentyTwoY = 560;
    final int twentyThreeX = 180;
    final int twentyThreeY = 560;
    final int twentyFourX = 300;
    final int twentyFourY = 560;
    final int twentyFiveX = 410;
    final int twentyFiveY = 560;
    final int twentySixX = 520;
    final int twentySixY = 560;
    final int twentySevenX = 640;
    final int twentySevenY = 560;
    final int twentyEightX = 750;
    final int twentyEightY = 560;
    boolean alive = true;

    boolean[] spaces;
    boolean[] lives;
    boolean dead;
    public ball(int xVal, int yVal, GamePanel gp, boolean d){
        x = xVal;
        y = yVal;
        this.gp = gp;
        dead = d;

    }

    public void drawSelf(Graphics g){
        if(alive){
            Image ball = Toolkit.getDefaultToolkit().getImage("ball.png"); /*the image cannot be in the SRC folder*/
            g.drawImage(ball, (int)x, (int)y, 70,70,gp );
        }

    }

    public void pick(){
        Random rand = new Random();
        int upperbound =  2;
        int int_random = rand.nextInt(upperbound) + 1;
        if(int_random==1){
            down();
        }else{
            right();
        }
    }



    public void down(){
        if(x==oneX && y==oneY){
            x = twoX;
            y = twoY;

        }else if(x==twoX && y==twoY){
            x=fourX;
            y=fourY;

        }else if(x==threeX && y==threeY){
            x=fiveX;
            y=fiveY;

        }else if(x==fourX && y==fourY){
            x=sevenX;
            y=sevenY;

        }else if(x==fiveX && y==fiveY){
            x=eightX;
            y=eightY;

        }else if(x==sixX && y==sixY){
            x=nineX;
            y=nineY;

        }else if(x==sevenX && y==sevenY){
            x=elevenX;
            y=elevenY;

        }else if(x==eightX && y==eightY){
            x=twelveX;
            y=twelveY;

        }else if(x==nineX && y==nineY){
            x=thirteenX;
            y=thirteenY;

        }else if(x==tenX && y==tenY){
            x=fourteenX;
            y=fourteenY;

        }else if(x==elevenX && y==elevenY){
            x=sixteenX;
            y=sixteenY;

        }else if(x==twelveX && y==twelveY){
            x=seventeenX;
            y=seventeenY;

        }else if(x==thirteenX && y==thirteenY){
            x=eighteenX;
            y=eighteenY;

        }else if(x==fourteenX && y==fourteenY){
            x=nineteenX;
            y=nineteenY;

        }else if(x==fifteenX && y==fifteenY){
            x=twentyX;
            y=twentyY;

        }else if(x==sixteenX && y==sixteenY){
            x=twentyTwoX;
            y=twentyTwoY;

        }else if(x==seventeenX && y==seventeenY){
            x=twentyThreeX;
            y=twentyThreeY;

        }else if(x==eighteenX && y==eighteenY){
            x=twentyFourX;
            y=twentyFourY;

        }else if(x==nineteenX && y==nineteenY){
            x=twentyFiveX;
            y=twentyFiveY;

        }else if(x==twentyX && y==twentyY){
            x=twentySixX;
            y=twentySixY;

        }else if(x==twentyOneX && y==twentyOneY){
            x=twentySevenX;
            y=twentySevenY;

        }else if(x==twentyTwoX && y==twentyTwoY){
            x+=60;
            y+=80;
            setXY();
        }else if(x==twentyThreeX && y==twentyThreeY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentyFourX && y==twentyFourY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentyFiveX && y==twentyFiveY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentySixX && y==twentySixY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentySevenX && y==twentySevenY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentyEightX && y==twentyEightY){
            x-=60;
            y-=80;
            setXY();
        }
    }

    public void right() {
        if(x==oneX && y==oneY) {
            x = threeX;
            y = threeY;

        }else if(x==twoX && y==twoY){
            x=fiveX;
            y=fiveY;

        }else if(x==threeX && y==threeY){
            x=sixX;
            y=sixY;

        }else if(x==fourX && y==fourY){
            x=eightX;
            y=eightY;

        }else if(x==fiveX && y==fiveY){
            x=nineX;
            y=nineY;

        }else if(x==sixX && y==sixY){
            x=tenX;
            y=tenY;

        }else if(x==sevenX && y==sevenY){
            x=twelveX;
            y=twelveY;

        }else if(x==eightX && y==eightY){
            x=thirteenX;
            y=thirteenY;

        }else if(x==nineX && y==nineY){
            x=fourteenX;
            y=fourteenY;

        }else if(x==tenX && y==tenY){
            x=fifteenX;
            y=fifteenY;

        }else if(x==elevenX && y==elevenY){
            x=seventeenX;
            y=seventeenY;

        }else if(x==twelveX && y==twelveY){
            x=eighteenX;
            y=eighteenY;

        }else if(x==thirteenX && y==thirteenY){
            x=nineteenX;
            y=nineteenY;

        }else if(x==fourteenX && y==fourteenY){
            x=twentyX;
            y=twentyY;

        }else if(x==fifteenX && y==fifteenY){
            x=twentyOneX;
            y=twentyOneY;

        }else if(x==sixteenX && y==sixteenY){
            x=twentyThreeX;
            y=twentyThreeY;

        }else if(x==seventeenX && y==seventeenY){
            x=twentyFourX;
            y=twentyFourY;

        }else if(x==eighteenX && y==eighteenY){
            x=twentyFiveX;
            y=twentyFiveY;

        }else if(x==nineteenX && y==nineteenY){
            x=twentySixX;
            y=twentySixY;

        }else if(x==twentyX && y==twentyY){
            x=twentySevenX;
            y=twentySevenY;

        }else if(x==twentyOneX && y==twentyOneY){
            x=twentyEightX;
            y=twentyEightY;

        }else if(x==twentyTwoX && y==twentyTwoY){
            x+=60;
            y+=80;
            setXY();
        }else if(x==twentyThreeX && y==twentyThreeY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentyFourX && y==twentyFourY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentyFiveX && y==twentyFiveY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentySixX && y==twentySixY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentySevenX && y==twentySevenY){
            x-=60;
            y-=80;
            setXY();
        }else if(x==twentyEightX && y==twentyEightY){
            x-=60;
            y-=80;
            setXY();
        }
    }
    public void setXY(){
        x = twoX;
        y = twoY;
    }

    public int getX(){
        return (int)x;
    }
    public int getY(){
        return (int)y;
    }
}

