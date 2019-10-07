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


/**
 *
 * @author 802793
 */
public class World extends JPanel{
    
    private Timer timer;
    private Border top;
    private Border bottom;
    private Border left;
    private Border right;
    private Player player;

    public World() {
        super();
        top = new Border(30, 30, 1120, 3, Color.GRAY);
        bottom = new Border(30, 630, 1150, 3, Color.GRAY);
        left = new Border(30, 0, 3, 630, Color.GRAY);
        right = new Border(1150, 30, 3, 600, Color.GRAY);
        player = new Player (45, 585);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 50, 500/12);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        top.draw(g);
        bottom.draw(g);
        left.draw(g);
        right.draw(g);
        player.draw(g);
    }

    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {  
            player.update();
            repaint();
        }
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
            player.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.stop();
        }        
    }
    
}
