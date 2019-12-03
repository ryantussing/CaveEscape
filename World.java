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

/*      NOTES

WORLD ONE ASSOCIATES TO WORLD TWO BASED ON SCORE. SCORE ALWAYS EXISTS BUT ISN'T ALWAYS DISPLAYED.

TO DO:
death counter
map randomly changes? or shifting windows?

*/

/**
 *
 * @author 802793
 */
public class World extends JPanel{
    
    private Timer timer;
    private int rand = createRandom();
    // BORDERS
    private Border top;
    private Border bottom;
    private Border left;
    private Border right;
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
    
    public World() {
        super();
        // BORDERS
        top = new Border(1, 1, 1080, 3, Color.BLACK);
        bottom = new Border(1, 16, 1080, 3, Color.BLACK);
        left = new Border(1, 1, 3, 600, Color.BLACK);
        right = new Border(28, 1, 3, 603, Color.BLACK);
        // WALLS
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
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if ( player.getScore() > 8 ) {
            
            this.setBackground(Color.BLACK);
            player.draw(g);
            
            g.setColor(Color.WHITE);
                Font a = new Font ( "VIVALDI ITALIC", Font.BOLD, 52);
                g.setFont(a);
                g.drawString ("CONGRAGULATIONS", 181, 90); 
                g.setColor(new Color( 255 , 0 , 0 , 130));
                g.drawString ("CONGRAGULATIONS", 181, 120);
                
        }
        
        if ( player.getScore() >= 0 && player.getScore() <= 8) {
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
            player.draw(g);
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
            }
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
    }
    
    public void checkCollisions(){
        if ( player.getScore() >= 0 && player.getScore() <= 8) {
            if (player.getBounds().intersects(top.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(bottom.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(left.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(right.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall2.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall3.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall4.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall5.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall6.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall7.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall8.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall9.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall10.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall11.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall12.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall13.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall14.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall15.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall16.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall17.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall18.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall19.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall20.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall21.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall22.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall23.getBounds())){
                player.setX(552);
                player.setY(312);
            }
            if (player.getBounds().intersects(wall24.getBounds())){
                player.setX(552);
                player.setY(312);
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
                player.setKey(false);
                player.setScore(player.getScore() + 1);
            }
        }
    }
}