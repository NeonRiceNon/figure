package com.company;

import javax.swing.*;
import java.awt.*;

public class Shape extends JFrame {

    public Shape(){
        setTitle("Drawing a Circle");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
    }

    public void draw(Graphics g){
        super.paint(g);
        new Circle();
        new Rectangle();
        Color c1 = new Color(103, 219, 118);

    }

}
