 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caveescape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author 802793
 */
public class LockDoor {
    private int x, y, width, height;
    private Rectangle bounds;
    private Color color;
    private Image img;
    private ImageIcon ii;
    
    public LockDoor (int cx, int cy){
        this.x = cx;
        this.y = cy;
        this.width = 60;
        this.height = 60;
        this.bounds = new Rectangle (this.x, this.y, this.width, this.height);
        this.ii = new ImageIcon (getClass().getResource("PixelDoor.png"));
            this.img = ii.getImage();
    }
    
    public void draw(Graphics g) {
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
