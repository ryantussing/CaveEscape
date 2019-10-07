/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caveescape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author 802793
 */
public class Player {
    
    private int height, width, x, y, vx, vy, hp;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 5;
    private boolean alive;
    
    public Player (int cx, int cy){
        this.alive = true;
        this.x = cx;
        this.y = cy;
        this.width = 32;
        this.height = 32;
        this.color = Color.WHITE;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        // g2d.draw(bounds);
        g.drawOval(x, y, width, height);
        g2d.fillOval(x+8, y+8, width/2, height/2);
    }
    
    public void die() {                         // DIE METHOD
        this.alive = false;
    }
    
    public void move(String direction) {        // MOVEMENT
        if (direction.equals ("right")) {
            vx = SPEED;
        }
        if (direction.equals ("left")) {
            vx = -SPEED;
        }
        if (direction.equals ("up")) {
            vy = -SPEED;
        }
        if (direction.equals ("down")) {
            vy = SPEED;
        }
        
    }
    
    public void update() {
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
     public void stop() {
        this.vx = 0;
        this.vy = 0;
    }
    
}
