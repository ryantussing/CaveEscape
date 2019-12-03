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
public class Door {
    
    private int x, y, width, height;
    private Rectangle bounds;
    private Color color;
    private Image img;
    private ImageIcon ii;
    
    public Door (int cx, int cy){
        this.x = cx;
        this.y = cy;
        this.width = 60;
        this.height = 60;
        this.color = Color.WHITE;
        this.bounds = new Rectangle (this.x, this.y, this.width, this.height);
        this.ii = new ImageIcon (getClass().getResource("UnLockPixelDoor.png"));
            this.img = ii.getImage();
    }
    
    public void draw(Graphics g) {
        /*
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g2d.draw(bounds);
        g.setColor(this.color);
        g2d.fill(bounds);
        */
        g.drawImage(img, this.x, this.y, this.width, this.height, null);
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
    
    
    
}
