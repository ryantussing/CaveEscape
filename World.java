/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caveescape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Image;
import javax.swing.ImageIcon;

/*      NOTES

SCORE IS SET TO 8

TO DO:
floor layout is set up --> implement
map randomly changes? or shifting windows?

*/

/**
 *
 * @author 802793
 */
public class World extends JPanel{
    
    private Timer timer;
    private int rand = createRandom();
    private Rectangle bounds;
    private Image img;
    private ImageIcon ii;
    private int quad;
    // BORDERS
    private Border top;
    private Border topq3;
    private Border topq4;
    private Border topq2;
    private Border topq1;
    private Border bottom;
    private Border bottomq3;
    private Border bottomq4;
    private Border bottomq2;
    private Border bottomq1;
    private Border left;
    private Border leftq3;
    private Border leftq4;
    private Border leftq2;
    private Border leftq1;
    private Border right;
    private Border rightq3;
    private Border rightq4;
    private Border rightq2;
    private Border rightq1;
    // OBJECTS
    private Player player;
    private Key key;
    private LockDoor exitdoor;
    // DOORS
    private Door door;
    private Door door2;
    private Door door3;
    private Door door4;
    private Door door5;
    private Door door6;
    private Door door7;
    private Door door8;
    private boolean done = false;
    private boolean dtwo = false;
    private boolean dthree = false;
    private boolean dfour = false;
    private boolean dfive = false;
    private boolean dsix = false;
    private boolean dseven = false;
    private boolean deight = false;
    private boolean playergotone = false;
    private boolean playergottwo = false;
    private boolean playergotthree = false;
    private boolean playergotfour = false;
    private boolean playergotfive = false;
    private boolean playergotsix = false;
    private boolean playergotseven = false;
    private boolean playergoteight = false;
    // WALLS
    private Border wall;
    private Border wall2;
    private Border wall3;
    private Border wall4;
    private Border wall5;
    private Border wall6;
    private Border wall7;
    private Border wall8;
    private Border wall9;
    private Border wall10;
    private Border wall11;
    private Border wall12;
    private Border wall13;
    private Border wall14;
    private Border wall15;
    private Border wall16;
    private Border wall17;
    private Border wall18;
    private Border wall19;
    private Border wall20;
    private Border wall21;
    private Border wall22;
    private Border wall23;
    private Border wall24;
    private Border wall25;
    private Border wall26;
    private Border wall27;
    private Border wall28;
    private Border wall29;
    private Border wall30;
    private Border wall31;
    private Border wall32;
    private Border wall33;
    private Border wall34;
    private Border wall35;
    private Border wall36;
    private Border wall37;
    private Border wall38;
    private Border wall39;
    private Border wall40;
    private Border wall41;
    private Border wall42;
    private Border wall43;
    private Border wall44;
    private Border wall45;
    private Border wall46;
    private Border wall47;
    private Border wall48;
    private Border wall49;
    
    public World() {
        super();
        // BORDERS
            // MAIN
            top = new Border(1, 1, 1080, 3, Color.BLACK);
            bottom = new Border(1, 16, 1080, 3, Color.BLACK);
            left = new Border(1, 1, 3, 600, Color.BLACK);
            right = new Border(28, 1, 3, 603, Color.BLACK);
            //QUAD 3
            bottomq3 = new Border(1, 16, 1125, 3, new Color (49, 51, 53));
            leftq3 = new Border(1, 0, 3, 640, new Color (49, 51, 53));
            rightq3 = new Border (29, 0, 3, 640, new Color (255, 255, 255, 0));
            topq3 = new Border (1, 0, 1125, 3, new Color (255, 255, 255, 0));
            //QUAD 4
            bottomq4 = new Border (0, 16, 1123, 3, new Color (49, 51, 53));
            leftq4 = new Border (0, 0, 3, 640, new Color (255, 255, 255, 0));
            topq4 = new Border (0, 0, 1125, 3, new Color (255, 255, 255, 0));
            rightq4 = new Border (28, 0, 3, 640, new Color (49, 51, 53));
            //QUAD 2
            leftq2 = new Border (1, 1, 3, 640, new Color(49, 51, 53));
            rightq2 = new Border (29, 1, 3, 640, new Color (255, 255, 255, 0));
            topq2 = new Border (1, 1, 1125, 3, new Color(49, 51, 53));
            bottomq2 = new Border(1, 17, 1125, 3, new Color (255, 255, 255, 0));
            // QUAD 1
            bottomq1 = new Border (0, 17, 1125, 3, new Color (255, 255, 255, 0));
            rightq1 = new Border (28, 1, 3, 640, new Color (49, 51, 53));
            leftq1 = new Border (0, 1, 3, 640, new Color (255, 255, 255, 0));
            topq1 = new Border (0, 1, 1123, 3, new Color(49, 51, 53));
        // WALLS
            // WORLD 1
                wall = new Border(4, 10, 2, 240, Color.BLACK);
                wall2 = new Border(4, 10, 120, 2, Color.BLACK);
                wall3 = new Border(7, 10, 2, 120, Color.BLACK);
                wall4 = new Border(10, 7, 2, 240, Color.BLACK);
                wall5 = new Border(4, 7, 120, 2, Color.BLACK);
                wall6 = new Border(7, 4, 2, 120, Color.BLACK);
                wall7 = new Border(10, 7, 120, 2, Color.BLACK);
                wall8 = new Border(1, 7, 120, 2, Color.BLACK);
                wall9 = new Border(4, 4, 120, 2, Color.BLACK);
                wall10 = new Border(10, 1, 2, 120, Color.BLACK);
                wall11 = new Border(13, 4, 2, 120, Color.BLACK);
                wall12 = new Border(13, 10, 2, 240, Color.BLACK);
                wall13 = new Border(16, 10, 2, 120, Color.BLACK);
                wall14 = new Border(19, 10, 2, 120, Color.BLACK);
                wall15 = new Border(16, 10, 120, 2, Color.BLACK);
                wall16 = new Border(22, 7, 2, 240, Color.BLACK);
                wall17 = new Border(25, 7, 2, 120, Color.BLACK);
                wall18 = new Border(25, 7, 120, 2, Color.BLACK);
                wall19 = new Border(22, 13, 240, 2, Color.BLACK);
                wall20 = new Border(16, 7, 240, 2, Color.BLACK);
                wall21 = new Border(16, 4, 2, 120, Color.BLACK);
                wall22 = new Border(22, 4, 2, 120, Color.BLACK);
                wall23 = new Border(19, 4, 120, 2, Color.BLACK);
                wall24 = new Border(25, 1, 2, 120, Color.BLACK);
            // WORLD 2
                // QUAD 3       *bottom border is 16
                wall25 = new Border (4, 13, 120, 2, Color.BLACK);
                wall26 = new Border (7, 13, 122, 2, Color.BLACK);
                wall27 = new Border (13, 13, 120, 2, Color.BLACK);
                wall28 = new Border (10, 10, 2, 120, Color.BLACK);
                wall29 = new Border (13, 10, 2, 120, Color.BLACK);
                wall30 = new Border (1, 10, 120, 2, Color.BLACK);
                wall31 = new Border (4, 10, 120, 2, Color.BLACK);
                wall32 = new Border (4, 4, 2, 120, Color.BLACK);
                wall33 = new Border (7, 4, 2, 120, Color.BLACK);
                wall34 = new Border (7, 7, 120, 2, Color.BLACK);
                wall35 = new Border (10, 7, 2, 120, Color.BLACK);
        // DOORS
        door = new Door (1030, 310);
        door2 = new Door (190, 190);
        door3 = new Door (790, 190);
        door4 = new Door (670, 430);
        door5 = new Door (190, 430);
        door6 = new Door (1030, 550);
        door7 = new Door (70, 550);
        door8 = new Door (190, 430);
        // OBJECTS
        player = new Player (552, 312);
        key = new Key (550, 145);
        exitdoor = new LockDoor (550, 490);
        // OTHERS
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/24);
        quad = 0;
        this.setSize(1200, 720);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if ( player.getMap() == 1 ) {
            this.setBackground (new Color (66, 165, 245));

            if (player.isAlive()){
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(40 , 40 , 1080 , 600);
            }

                if (player.getScore() == 1){
                    g.setColor ( new Color( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                }
                if (player.getScore() == 2){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                }
                if (player.getScore() == 3){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                }
                if (player.getScore() == 4){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                }
                if (player.getScore() == 5){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                }
                if (player.getScore() == 6){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 890 , 510 , 20 , 20 );
                        g.fillRect ( 910 , 530 , 20 , 20 );
                        g.fillRect ( 910 , 490 , 20 , 20 );
                        g.fillRect ( 930 , 550 , 20 , 20 );
                        g.fillRect ( 930 , 470 , 20 , 20 );
                        g.fillRect ( 950 , 570 , 20 , 20 );
                        g.fillRect ( 950 , 450 , 20 , 20 );
                        g.fillRect ( 970 , 430 , 20 , 20 );
                        g.fillRect ( 970 , 590 , 20 , 20 );
                        g.fillRect ( 990 , 410 , 20 , 20 );
                        g.fillRect ( 990 , 610 , 20 , 20 );
                        g.fillRect ( 1010 , 590 , 20 , 20 );
                        g.fillRect ( 1010 , 430 , 20 , 20 );
                        g.fillRect ( 1030 , 570 , 20 , 20 );
                        g.fillRect ( 1030 , 450 , 20 , 20 );
                        g.fillRect ( 1050 , 550 , 20 , 20 );
                        g.fillRect ( 1050 , 470 , 20 , 20 );
                        g.fillRect ( 1070 , 530 , 20 , 20 );
                        g.fillRect ( 1070 , 490 , 20 , 20 );
                        g.fillRect ( 1090 , 510 , 20 , 20 );
                }
                if (player.getScore() == 7) {
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 890 , 510 , 20 , 20 );
                        g.fillRect ( 910 , 530 , 20 , 20 );
                        g.fillRect ( 910 , 490 , 20 , 20 );
                        g.fillRect ( 930 , 550 , 20 , 20 );
                        g.fillRect ( 930 , 470 , 20 , 20 );
                        g.fillRect ( 950 , 570 , 20 , 20 );
                        g.fillRect ( 950 , 450 , 20 , 20 );
                        g.fillRect ( 970 , 430 , 20 , 20 );
                        g.fillRect ( 970 , 590 , 20 , 20 );
                        g.fillRect ( 990 , 410 , 20 , 20 );
                        g.fillRect ( 990 , 610 , 20 , 20 );
                        g.fillRect ( 1010 , 590 , 20 , 20 );
                        g.fillRect ( 1010 , 430 , 20 , 20 );
                        g.fillRect ( 1030 , 570 , 20 , 20 );
                        g.fillRect ( 1030 , 450 , 20 , 20 );
                        g.fillRect ( 1050 , 550 , 20 , 20 );
                        g.fillRect ( 1050 , 470 , 20 , 20 );
                        g.fillRect ( 1070 , 530 , 20 , 20 );
                        g.fillRect ( 1070 , 490 , 20 , 20 );
                        g.fillRect ( 1090 , 510 , 20 , 20 );
                    // MULTI-SQUARES
                    g.setColor( new Color ( 255 , 0 , 0 , 130));
                        g.fillRect ( 340 , 170 , 20 , 20 );
                        g.fillRect ( 320 , 190 , 20 , 20 );
                        g.fillRect ( 300 , 210 , 20 , 20 );
                        g.fillRect ( 280 , 230 , 20 , 20 );
                        g.fillRect ( 260 , 250 , 20 , 20 );
                        g.fillRect ( 240 , 270 , 20 , 20 );
                        g.fillRect ( 220 , 290 , 20 , 20 );
                        g.fillRect ( 200 , 310 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 200 , 350 , 20 , 20 );
                        g.fillRect ( 220 , 370 , 20 , 20 );
                        g.fillRect ( 240 , 390 , 20 , 20 );
                        g.fillRect ( 260 , 410 , 20 , 20 );
                        g.fillRect ( 280 , 430 , 20 , 20 );
                        g.fillRect ( 300 , 450 , 20 , 20 );
                        g.fillRect ( 320 , 470 , 20 , 20 );
                        g.fillRect ( 340 , 490 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 360 , 490 , 20 , 20 );
                        g.fillRect ( 380 , 470 , 20 , 20 );
                        g.fillRect ( 400 , 450 , 20 , 20 );
                        g.fillRect ( 420 , 430 , 20 , 20 );
                        g.fillRect ( 440 , 410 , 20 , 20 );
                        g.fillRect ( 460 , 390 , 20 , 20 );
                        g.fillRect ( 480 , 370 , 20 , 20 );
                        g.fillRect ( 500 , 350 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 500 , 310 , 20 , 20 );
                        g.fillRect ( 480 , 290 , 20 , 20 );
                        g.fillRect ( 460 , 270 , 20 , 20 );
                        g.fillRect ( 440 , 250 , 20 , 20 );
                        g.fillRect ( 420 , 230 , 20 , 20 );
                        g.fillRect ( 400 , 210 , 20 , 20 );
                        g.fillRect ( 380 , 190 , 20 , 20 );
                        g.fillRect ( 360 , 170 , 20 , 20 );
                }
                if (player.getScore() == 8) {
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 890 , 510 , 20 , 20 );
                        g.fillRect ( 910 , 530 , 20 , 20 );
                        g.fillRect ( 910 , 490 , 20 , 20 );
                        g.fillRect ( 930 , 550 , 20 , 20 );
                        g.fillRect ( 930 , 470 , 20 , 20 );
                        g.fillRect ( 950 , 570 , 20 , 20 );
                        g.fillRect ( 950 , 450 , 20 , 20 );
                        g.fillRect ( 970 , 430 , 20 , 20 );
                        g.fillRect ( 970 , 590 , 20 , 20 );
                        g.fillRect ( 990 , 410 , 20 , 20 );
                        g.fillRect ( 990 , 610 , 20 , 20 );
                        g.fillRect ( 1010 , 590 , 20 , 20 );
                        g.fillRect ( 1010 , 430 , 20 , 20 );
                        g.fillRect ( 1030 , 570 , 20 , 20 );
                        g.fillRect ( 1030 , 450 , 20 , 20 );
                        g.fillRect ( 1050 , 550 , 20 , 20 );
                        g.fillRect ( 1050 , 470 , 20 , 20 );
                        g.fillRect ( 1070 , 530 , 20 , 20 );
                        g.fillRect ( 1070 , 490 , 20 , 20 );
                        g.fillRect ( 1090 , 510 , 20 , 20 );
                    // MULTI-SQUARES
                    g.setColor( new Color ( 255 , 0 , 0 , 130));
                        g.fillRect ( 340 , 170 , 20 , 20 );
                        g.fillRect ( 320 , 190 , 20 , 20 );
                        g.fillRect ( 300 , 210 , 20 , 20 );
                        g.fillRect ( 280 , 230 , 20 , 20 );
                        g.fillRect ( 260 , 250 , 20 , 20 );
                        g.fillRect ( 240 , 270 , 20 , 20 );
                        g.fillRect ( 220 , 290 , 20 , 20 );
                        g.fillRect ( 200 , 310 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 200 , 350 , 20 , 20 );
                        g.fillRect ( 220 , 370 , 20 , 20 );
                        g.fillRect ( 240 , 390 , 20 , 20 );
                        g.fillRect ( 260 , 410 , 20 , 20 );
                        g.fillRect ( 280 , 430 , 20 , 20 );
                        g.fillRect ( 300 , 450 , 20 , 20 );
                        g.fillRect ( 320 , 470 , 20 , 20 );
                        g.fillRect ( 340 , 490 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 360 , 490 , 20 , 20 );
                        g.fillRect ( 380 , 470 , 20 , 20 );
                        g.fillRect ( 400 , 450 , 20 , 20 );
                        g.fillRect ( 420 , 430 , 20 , 20 );
                        g.fillRect ( 440 , 410 , 20 , 20 );
                        g.fillRect ( 460 , 390 , 20 , 20 );
                        g.fillRect ( 480 , 370 , 20 , 20 );
                        g.fillRect ( 500 , 350 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 500 , 310 , 20 , 20 );
                        g.fillRect ( 480 , 290 , 20 , 20 );
                        g.fillRect ( 460 , 270 , 20 , 20 );
                        g.fillRect ( 440 , 250 , 20 , 20 );
                        g.fillRect ( 420 , 230 , 20 , 20 );
                        g.fillRect ( 400 , 210 , 20 , 20 );
                        g.fillRect ( 380 , 190 , 20 , 20 );
                        g.fillRect ( 360 , 170 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 780 , 170 , 20 , 20 );
                        g.fillRect ( 760 , 190 , 20 , 20 );
                        g.fillRect ( 740 , 210 , 20 , 20 );
                        g.fillRect ( 720 , 230 , 20 , 20 );
                        g.fillRect ( 700 , 250 , 20 , 20 );
                        g.fillRect ( 680 , 270 , 20 , 20 );
                        g.fillRect ( 660 , 290 , 20 , 20 );
                        g.fillRect ( 640 , 310 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 640 , 350 , 20 , 20 );
                        g.fillRect ( 660 , 370 , 20 , 20 );
                        g.fillRect ( 680 , 390 , 20 , 20 );
                        g.fillRect ( 700 , 410 , 20 , 20 );
                        g.fillRect ( 720 , 430 , 20 , 20 );
                        g.fillRect ( 740 , 450 , 20 , 20 );
                        g.fillRect ( 760 , 470 , 20 , 20 );
                        g.fillRect ( 780 , 490 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 800 , 490 , 20 , 20 );
                        g.fillRect ( 820 , 470 , 20 , 20 );
                        g.fillRect ( 840 , 450 , 20 , 20 );
                        g.fillRect ( 860 , 430 , 20 , 20 );
                        g.fillRect ( 880 , 410 , 20 , 20 );
                        g.fillRect ( 900 , 390 , 20 , 20 );
                        g.fillRect ( 920 , 370 , 20 , 20 );
                        g.fillRect ( 940 , 350 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 940 , 310 , 20 , 20 );
                        g.fillRect ( 920 , 290 , 20 , 20 );
                        g.fillRect ( 900 , 270 , 20 , 20 );
                        g.fillRect ( 880 , 250 , 20 , 20 );
                        g.fillRect ( 860 , 230 , 20 , 20 );
                        g.fillRect ( 840 , 210 , 20 , 20 );
                        g.fillRect ( 820 , 190 , 20 , 20 );
                        g.fillRect ( 800 , 170 , 20 , 20 );
                }
            // OBJECTS
            if ( player.getScore() == 8) {
                exitdoor.draw(g);
                if (!player.isKey()) {
                    key.setAlive(true);
                    key.draw(g);
                }
                else if (player.isKey()) {
                    
                }
            }
            // DOORS
            if (rand > 0 && rand < 5 ){
                if (playergotone) {
                    rand = createRandom();
                }
                if (!playergotone) {
                    door.draw(g);
                    done = true;
                }
            }
            else if (rand >= 5 && rand < 10 ){
                if (playergottwo) {
                    rand = createRandom();
                }
                if (!playergottwo) {
                    door2.draw(g);
                    dtwo = true;
                }
            }
            else if (rand >= 10 && rand < 15 ){
                if (playergotthree) {
                    rand = createRandom();
                }
                if (!playergotthree) {
                    door3.draw(g);
                    dthree = true;
                }
            }
            else if (rand >= 15 && rand < 20 ){
                if (playergotfour) {
                    rand = createRandom();
                }
                if (!playergotfour) {
                    door4.draw(g);
                    dfour = true;
                }
            }
            else if (rand >= 20 && rand < 25 ){
                if (playergotfive) {
                    rand = createRandom();
                }
                if (!playergotfive) {
                    door5.draw(g);
                    dfive = true;
                }
            }
            else if (rand >= 25 && rand < 30 ){
                if (playergotsix) {
                    rand = createRandom();
                }
                if (!playergotsix) {
                    door6.draw(g);
                    dsix = true;
                }
            }
            else if (rand >= 30 && rand < 35 ){
                if (playergotseven) {
                    rand = createRandom();
                }
                if (!playergotseven) {
                    door7.draw(g);
                    dseven = true;
                }
            }
            else if (rand >= 35 && rand <= 40 ){
                if (playergoteight) {
                    rand = createRandom();
                }
                if (!playergoteight) {
                    door8.draw(g);
                    deight = true;
                }
            }
            player.draw(g);
            // BORDERS
            top.draw(g);
            bottom.draw(g);
            left.draw(g);
            right.draw(g);
            // WALLS
            wall.draw(g);
            wall2.draw(g);
            wall3.draw(g);
            wall4.draw(g);
            wall5.draw(g);
            wall6.draw(g);
            wall7.draw(g);
            wall8.draw(g);
            wall9.draw(g);
            wall10.draw(g);
            wall11.draw(g);
            wall12.draw(g);
            wall13.draw(g);
            wall14.draw(g);
            wall15.draw(g);
            wall16.draw(g);
            wall17.draw(g);
            wall18.draw(g);
            wall19.draw(g);
            wall20.draw(g);
            wall21.draw(g);
            wall22.draw(g);
            wall23.draw(g);
            wall24.draw(g);
            // Strings
            if (player.isAlive()){
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 40, 28);
                g.drawString ("D E A T H S : " + player.getDeaths(), 220, 28);
            }
        }
        
        if ( player.getMap() == 2 ) {
            
            this.setBackground( Color.LIGHT_GRAY );
            
            if (quad == 3) {
                
                g.setColor(new Color (253, 253, 150));
                g.fillRect(40 , 0 , 1125 , 640);
                // BORDERS
                bottomq3.draw(g);
                leftq3.draw(g);
                topq3.draw(g);
                rightq3.draw(g); 
                // WALLS
                wall25.draw(g);
                wall26.draw(g);
                wall27.draw(g);
                wall28.draw(g);
                wall29.draw(g);
                wall30.draw(g);
                wall31.draw(g);
                wall32.draw(g);
                wall33.draw(g);
                wall34.draw(g);
                wall35.draw(g);
                // TEXT
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 40, 668);
                g.drawString ("D E A T H S : " + player.getDeaths(), 220, 668);
                
            }
            if (quad == 4) {
                g.setColor(new Color (253, 253, 150));
                g.fillRect(0 , 0 , 1123 , 640);
                bottomq4.draw(g);
                leftq4.draw(g);
                topq4.draw(g);
                rightq4.draw(g);
                
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 812, 668);
                g.drawString ("D E A T H S : " + player.getDeaths(), 992, 668);
                
            }
            if (quad == 2) {
                g.setColor(new Color (253, 253, 150));
                g.fillRect(40 , 40 , 1125 , 640);
                bottomq2.draw(g);
                leftq2.draw(g);
                topq2.draw(g);
                rightq2.draw(g);
                
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 40, 28);
                g.drawString ("D E A T H S : " + player.getDeaths(), 220, 28);
                
            }
            if (quad == 1) {
                g.setColor(new Color (253, 253, 150));
                g.fillRect(0 , 40 , 1123 , 640);
                bottomq1.draw(g);
                leftq1.draw(g);
                topq1.draw(g);
                rightq1.draw(g);
                
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 812, 28);
                g.drawString ("D E A T H S : " + player.getDeaths(), 992, 28);
                
            }
            
            player.draw(g);
            
        }
        
    }

    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {  
            player.update();
            checkCollisions();
            repaint();
        }
    }
    
    public static int createRandom() {
        int rand = (int) ( (Math.random() * 40) + 1);
        return rand;
    }
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {              
            player.move("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.move("left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.move("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.move("down");
        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.setSPEED(30);
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.stopHor();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.stopHor();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.stopVert();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.stopVert();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.setSPEED(10);
        }
    }
    
    public void checkCollisions(){
        if ( player.getMap() == 1 ) {
            if (player.getBounds().intersects(top.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(bottom.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(left.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(right.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall2.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall3.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall4.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall5.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall6.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall7.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall8.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall9.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall10.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall11.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall12.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall13.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall14.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall15.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall16.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall17.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall18.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall19.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall20.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall21.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall22.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall23.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall24.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(door.getBounds()) && (done == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotone = true;
                rand = createRandom();
                done = false;
            }
            if (player.getBounds().intersects(door2.getBounds())  && (dtwo == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergottwo = true;
                rand = createRandom();
                dtwo = false;
            }
            if (player.getBounds().intersects(door3.getBounds())  && (dthree == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotthree = true;
                rand = createRandom();
                dthree = false;
            }
            if (player.getBounds().intersects(door4.getBounds())  && (dfour == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotfour = true;
                rand = createRandom();
                dfour = false;
            }
            if (player.getBounds().intersects(door5.getBounds())  && (dfive == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotfive = true;
                rand = createRandom();
                dfive = false;
            }
            if (player.getBounds().intersects(door6.getBounds())  && (dsix == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotsix = true;
                rand = createRandom();
                dsix = false;
            }
            if (player.getBounds().intersects(door7.getBounds())  && (dseven == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotseven = true;
                rand = createRandom();
                dseven = false;
            }
            if (player.getBounds().intersects(door8.getBounds())  && (deight == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergoteight = true;
                rand = createRandom();
                deight = false;
            }
            if ((player.getBounds().intersects(key.getBounds())) && key.isAlive() ) {
                player.setKey(true);
            }
            if ((player.isKey()) && (player.getBounds().intersects(exitdoor.getBounds()))) {
                player.setX(72);
                player.setY(552);
                player.setKey(false);
                player.setScore(0);
                player.setMap(2);
                quad = 3;
            }
        }
        if (player.getMap() == 2) {
            if (quad == 3) {
                if (player.getBounds().intersects(leftq3.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(bottomq3.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(rightq3.getBounds())) {
                    player.setBounds(new Rectangle (32, player.getY(), player.getWidth(), player.getHeight())); 
                    player.setX(32);
                    quad = 4;
                }
                if (player.getBounds().intersects(topq3.getBounds())) {
                    player.setBounds(new Rectangle (player.getX(), 592, player.getWidth(), player.getHeight()));
                    player.setY(592);
                    quad = 2;
                }
            }
            if (quad == 4) {
                if (player.getBounds().intersects(leftq4.getBounds())) {
                    player.setX(1076);
                    quad = 3;
                }
                if (player.getBounds().intersects(bottomq4.getBounds())) {
                    player.setX(1034); player.setY(552);
                }
                if (player.getBounds().intersects(rightq4.getBounds())) {
                    player.setX(1034); player.setY(552);
                }
                if (player.getBounds().intersects(topq4.getBounds())) {
                    player.setBounds(new Rectangle (player.getX(), 592, player.getWidth(), player.getHeight()));
                    player.setY(592);
                    quad = 1;
                }
            }
            if (quad == 2) {
                if (player.getBounds().intersects(leftq2.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(bottomq2.getBounds())) {
                    player.setY(32);
                    quad = 3;
                }
                if (player.getBounds().intersects(rightq2.getBounds())) {
                    player.setBounds(new Rectangle (32, player.getY(), player.getWidth(), player.getHeight()));
                    player.setX(32);
                    quad = 1;
                }
                if (player.getBounds().intersects(topq2.getBounds())) {
                    player.setX(72); player.setY(72);
                }
            }
            if (quad == 1) {
                if (player.getBounds().intersects(leftq1.getBounds())) {
                    
                    player.setX(1076);
                    quad = 2;
                }
                if (player.getBounds().intersects(bottomq1.getBounds())) {
                    player.setY(32);
                    quad = 4;
                }
                if (player.getBounds().intersects(rightq1.getBounds())) {
                    player.setX(1034); player.setY(72);
                }
                if (player.getBounds().intersects(topq1.getBounds())) {
                    player.setX(1034); player.setY(72);
                }
            }
        }
    }
}