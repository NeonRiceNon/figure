package com.company;

import java.awt.*;

public class Circle extends Shape {

@Override
    public void paint(Graphics g /*, Color c1*/){
        Graphics2D g2d = (Graphics2D) g;
        g.drawOval(150, 150, 60, 60);
    }
}
