package com.company;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {

@Override
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double rectangle  = new Rectangle2D.Double(100, 100, 100, 150);
        g2d.setColor(Color.cyan );
        g2d.fill(rectangle);

    }
}
