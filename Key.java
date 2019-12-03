/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caveescape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author 802793
 */
public class Key {
    
    private int x, y, width, height;
    private Rectangle bounds;
    private Color color;
    private boolean alive;
    private Image img;
    private ImageIcon ii;
    
    public Key (int cx, int cy){
        this.alive = false;
        this.x = cx;
        this.y = cy;
        this.width = 60;
        this.height = 30;
        this.bounds = new Rectangle (this.x, this.y, this.width, this.height);
        this.ii = new ImageIcon (getClass().getResource("PixelKey.png"));
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
    
    }

