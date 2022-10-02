package com.company;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(150, 150, 60, 60);
        g2d.setColor(Color.GREEN);
        g2d.fill(rectangle);
    }
}
