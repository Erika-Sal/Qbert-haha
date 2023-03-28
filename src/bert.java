import java.awt.*;
import java.awt.geom.Point2D;

public class bert {
double x, y;
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
    public bert(int xVal, int yVal, GamePanel gp, boolean[] bool, boolean[] l){
        x = xVal;
        y = yVal;
        this.gp = gp;
        spaces = bool;
        lives = l;
    }

    public void drawSelf(Graphics g){
        if(alive){
            Image qBert = Toolkit.getDefaultToolkit().getImage("bert.png"); /*the image cannot be in the SRC folder*/
            g.drawImage(qBert, (int)x, (int)y, 70,70,gp );
        }

    }


    public void up() {
        if (x == twoX && y == twoY) {
            x = oneX;
            y = oneY;
            spaces[0] = true;
        } else if (x == fourX && y == fourY) {
            x = twoX;
            y = twoY;
            spaces[1] = true;
        } else if (x == fiveX && y == fiveY) {
            x = threeX;
            y = threeY;
            spaces[2] = true;
        } else if (x == sevenX && y == sevenY) {
            x = fourX;
            y = fourY;
            spaces[3] = true;
        } else if (x == eightX && y == eightY) {
            x = fiveX;
            y = fiveY;
            spaces[4] = true;
        } else if (x == nineX && y == nineY) {
            x = sixX;
            y = sixY;
            spaces[5] = true;
        } else if (x == elevenX && y == elevenY) {
            x = sevenX;
            y = sevenY;
            spaces[6] = true;
        }else if(x==twelveX && y==twelveY){
            x = eightX;
            y = eightY;
            spaces[7] = true;
        }else if(x==thirteenX && y==thirteenY){
            x = nineX;
            y = nineY;
            spaces[8] = true;
        }else if(x==fourteenX && y==fourteenY){
            x = tenX;
            y = tenY;
            spaces[9] = true;
        }else if(x==sixteenX && y==sixteenY){
            x = elevenX;
            y = elevenY;
            spaces[10] = true;
        }else if(x==seventeenX && y==seventeenY){
            x = twelveX;
            y = twelveY;
            spaces[11] = true;
        }else if(x==eighteenX && y==eighteenY){
            x = thirteenX;
            y = thirteenY;
            spaces[12] = true;
        }else if(x==nineteenX && y==nineteenY){
            x = fourteenX;
            y = fourteenY;
            spaces[13] = true;
        }else if(x==twentyX && y==twentyY){
            x = fifteenX;
            y = fifteenY;
            spaces[14] = true;
        }else if(x==twentyTwoX && y==twentyTwoY){
            x = sixteenX;
            y = sixteenY;
            spaces[15] = true;
        }else if(x==twentyThreeX && y==twentyThreeY){
            x = seventeenX;
            y = seventeenY;
            spaces[16] = true;
        }else if(x==twentyFourX && y==twentyFourY){
            x = eighteenX;
            y = eighteenY;
            spaces[17] = true;
        }else if(x==twentyFiveX && y==twentyFiveY){
            x=nineteenX;
            y=nineteenY;
            spaces[18] = true;
        }else if(x==twentySixX && y==twentySixY){
            x=twentyX;
            y=twentyY;
            spaces[19] = true;
        }else if(x==twentySevenX && y==twentySevenY){
            x=twentyOneX;
            y=twentyOneY;
            spaces[20] = true;
        }
    }

    public void down(){
       if(x==oneX && y==oneY){
           x = twoX;
           y = twoY;
           spaces[1] = true;
       }else if(x==twoX && y==twoY){
           x=fourX;
           y=fourY;
           spaces[3] = true;
       }else if(x==threeX && y==threeY){
           x=fiveX;
           y=fiveY;
           spaces[4] = true;
       }else if(x==fourX && y==fourY){
           x=sevenX;
           y=sevenY;
           spaces[6] = true;
       }else if(x==fiveX && y==fiveY){
           x=eightX;
           y=eightY;
           spaces[7] = true;
       }else if(x==sixX && y==sixY){
           x=nineX;
           y=nineY;
           spaces[8] = true;
       }else if(x==sevenX && y==sevenY){
           x=elevenX;
           y=elevenY;
           spaces[10] = true;
       }else if(x==eightX && y==eightY){
           x=twelveX;
           y=twelveY;
           spaces[11] = true;
       }else if(x==nineX && y==nineY){
           x=thirteenX;
           y=thirteenY;
           spaces[12] = true;
       }else if(x==tenX && y==tenY){
           x=fourteenX;
           y=fourteenY;
           spaces[13] = true;
       }else if(x==elevenX && y==elevenY){
           x=sixteenX;
           y=sixteenY;
           spaces[15] = true;
       }else if(x==twelveX && y==twelveY){
           x=seventeenX;
           y=seventeenY;
           spaces[16] = true;
       }else if(x==thirteenX && y==thirteenY){
           x=eighteenX;
           y=eighteenY;
           spaces[17] = true;
       }else if(x==fourteenX && y==fourteenY){
           x=nineteenX;
           y=nineteenY;
           spaces[18] = true;
       }else if(x==fifteenX && y==fifteenY){
           x=twentyX;
           y=twentyY;
           spaces[19] = true;
       }else if(x==sixteenX && y==sixteenY){
           x=twentyTwoX;
           y=twentyTwoY;
           spaces[21] = true;
       }else if(x==seventeenX && y==seventeenY){
           x=twentyThreeX;
           y=twentyThreeY;
           spaces[22] = true;
       }else if(x==eighteenX && y==eighteenY){
           x=twentyFourX;
           y=twentyFourY;
           spaces[23] = true;
       }else if(x==nineteenX && y==nineteenY){
           x=twentyFiveX;
           y=twentyFiveY;
           spaces[24] = true;
       }else if(x==twentyX && y==twentyY){
           x=twentySixX;
           y=twentySixY;
           spaces[25] = true;
       }else if(x==twentyOneX && y==twentyOneY){
           x=twentySevenX;
           y=twentySevenY;
           spaces[26] = true;
       }
    }

    public void right() {
        if(x==oneX && y==oneY) {
            x = threeX;
            y = threeY;
            spaces[2] = true;
        }else if(x==twoX && y==twoY){
            x=fiveX;
            y=fiveY;
            spaces[4] = true;
        }else if(x==threeX && y==threeY){
            x=sixX;
            y=sixY;
            spaces[5] = true;
        }else if(x==fourX && y==fourY){
            x=eightX;
            y=eightY;
            spaces[7] = true;
        }else if(x==fiveX && y==fiveY){
            x=nineX;
            y=nineY;
            spaces[8] = true;
        }else if(x==sixX && y==sixY){
            x=tenX;
            y=tenY;
            spaces[9] = true;
        }else if(x==sevenX && y==sevenY){
            x=twelveX;
            y=twelveY;
            spaces[11] = true;
        }else if(x==eightX && y==eightY){
           x=thirteenX;
           y=thirteenY;
            spaces[12] = true;
        }else if(x==nineX && y==nineY){
            x=fourteenX;
            y=fourteenY;
            spaces[13] = true;
        }else if(x==tenX && y==tenY){
            x=fifteenX;
            y=fifteenY;
            spaces[14] = true;
        }else if(x==elevenX && y==elevenY){
            x=seventeenX;
            y=seventeenY;
            spaces[16] = true;
        }else if(x==twelveX && y==twelveY){
            x=eighteenX;
            y=eighteenY;
            spaces[17] = true;
        }else if(x==thirteenX && y==thirteenY){
            x=nineteenX;
            y=nineteenY;
            spaces[18] = true;
        }else if(x==fourteenX && y==fourteenY){
            x=twentyX;
            y=twentyY;
            spaces[19] = true;
        }else if(x==fifteenX && y==fifteenY){
            x=twentyOneX;
            y=twentyOneY;
            spaces[20] = true;
        }else if(x==sixteenX && y==sixteenY){
            x=twentyThreeX;
            y=twentyThreeY;
            spaces[22] = true;
        }else if(x==seventeenX && y==seventeenY){
            x=twentyFourX;
            y=twentyFourY;
            spaces[23] = true;
        }else if(x==eighteenX && y==eighteenY){
            x=twentyFiveX;
            y=twentyFiveY;
            spaces[24] = true;
        }else if(x==nineteenX && y==nineteenY){
            x=twentySixX;
            y=twentySixY;
            spaces[25] = true;
        }else if(x==twentyX && y==twentyY){
            x=twentySevenX;
            y=twentySevenY;
            spaces[26] = true;
        }else if(x==twentyOneX && y==twentyOneY){
            x=twentyEightX;
            y=twentyEightY;
            spaces[27] = true;
        }
    }

    public void left() {
        if(x==oneX && y==oneY){
            x-=60;
            y-=80;
            die();
        }
        if(x==threeX&& y==threeY){
            x=oneX;
            y=oneY;
            spaces[0] = true;
        }else if(x==fiveX && y==fiveY){
            x=twoX;
            y=twoY;
            spaces[1] = true;
        }else if(x==sixX && y==sixY){
            x=threeX;
            y=threeY;
            spaces[2] = true;
        }else if(x==eightX && y==eightY){
            x=fourX;
            y=fourY;
            spaces[3] = true;
        }else if(x==nineX && y==nineY){
            x=fiveX;
            y=fiveY;
            spaces[4] = true;
        }else if(x==tenX && y==tenY){
            x=sixX;
            y=sixY;
            spaces[5] = true;
        }else if(x==twelveX && y==twelveY){
            x=sevenX;
            y=sevenY;
            spaces[6] = true;
        }else if(x==thirteenX && y==thirteenY){
            x=eightX;
            y=eightY;
            spaces[7] = true;
        }else if(x==fourteenX && y==fourteenY){
            x=nineX;
            y=nineY;
            spaces[8] = true;
        }else if(x==fifteenX && y==fifteenY){
            x=tenX;
            y=tenY;
            spaces[9] = true;
        }else if(x==seventeenX && y==seventeenY){
            x=elevenX;
            y=elevenY;
            spaces[10] = true;
        }else if(x==eighteenX && y==seventeenY){
            x=twelveX;
            y=twelveY;
            spaces[11] = true;
        }else if(x==nineteenX && y==nineteenY){
            x=thirteenX;
            y=thirteenY;
            spaces[12] = true;
        }else if(x==twentyX && y==twentyY){
            x=fourteenX;
            y=fourteenY;
            spaces[13] = true;
        }else if(x==twentyOneX && y==twentyOneY){
            x=fifteenX;
            y=fifteenY;
            spaces[14] = true;
        }else if(x==twentyThreeX && y==twentyThreeY){
            x=sixteenX;
            y=sixteenY;
            spaces[15] = true;
        }else if(x==twentyFourX && y==twentyFourY){
            x=seventeenX;
            y=seventeenY;
            spaces[16] = true;
        }else if(x==twentyFiveX && y==twentyFiveY){
            x=eighteenX;
            y=eighteenY;
            spaces[17] = true;
        }else if(x==twentySixX && y==twentySixY){
            x=nineteenX;
            y=nineteenY;
            spaces[18] = true;
        }else if(x==twentySevenX && y==twentySevenY){
            x=twentyX;
            y=twentyY;
            spaces[19] = true;
        }else if(x==twentyEightX && y==twentyEightY){
            x=twentyOneX;
            y=twentyOneY;
            spaces[20] = true;
        }

    }

    //hi

    public boolean[] getSpaces(){
        return spaces;
    }

    public boolean win(){
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] == false){
                return false;
            }
        }
        return true;
    }

    public void die(){
        alive = false;
        if(lives[2]){
            lives[2] = false;
        }else if(lives[1]){
            lives[1] = false;
        }else{
            lives[0] = false;
        }

    }

    public boolean[] getLives(){
        return lives;
    }
}

