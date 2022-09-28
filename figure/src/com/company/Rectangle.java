package com.company;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    public void paint(Graphics g /*, Color c1*/){
        Graphics2D g2d = (Graphics2D) g;
        g.drawRect(100, 350, 100, 20);
    }
}
