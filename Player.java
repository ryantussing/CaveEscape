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
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 802793
 */
public class Player {
    
    private int height, width, x, y, vx, vy, hp, score;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 10;
    private boolean alive;
    private boolean key;
    private Image img;
    private ImageIcon ii;
    
    public Player (int cx, int cy){
        this.alive = true;
        this.x = cx;
        this.y = cy;
        this.width = 56;
        this.height = 56;
        this.color = Color.CYAN;
        this.score = 0;
        this.key = false;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
        this.ii = new ImageIcon (getClass().getResource("Sans.png"));
            this.img = ii.getImage();
    }
    
    public void draw(Graphics g) {
//        g.setColor(this.color);
//        Graphics2D g2d = (Graphics2D) g;
//        g.drawOval(x, y, width, height);
//        g2d.fillOval(x+8, y+8, width/2, height/2);
        g.drawImage(img, this.x, this.y, this.width, this.height, null);
    }
    
    public void die() {
        this.alive = false;
    }
    
    public void move(String direction) {
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
    
    public void stopHor() {
        this.vx = 0;
    }
    public void stopVert() {
        this.vy = 0;
    } 
     
    // GETTERS AND SETTERS

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public ImageIcon getIi() {
        return ii;
    }

    public void setIi(ImageIcon ii) {
        this.ii = ii;
    }
     
    
    
}
