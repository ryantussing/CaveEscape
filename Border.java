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
public class Border {
    
    private Rectangle bounds;
    private Color color;
    private int x, y, width, height;
    
    public Border (int cx, int cy, int cwidth, int cheight, Color color){
        this.x = cx;
        this.y = cy;
        this.width = cwidth;
        this.height = cheight;
        this.color = color;
        this.bounds = new Rectangle (this.x, this.y, this.width, this.height);
    }
    
     public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fill(bounds);
        }
    
}
