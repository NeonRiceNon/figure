package com.company;

public class Main {
    public static void main (String[] args)  {

        //new Shape(); //вызывается
        new Circle();
        new Rectangle();
    }

    public void arr (Shape rectangle, Shape circle){
        Shape[] array = new Shape[] {circle, rectangle};

       /* for (int i=0; i<2; i++ ){
            array[i].draw(array[i].getX(), array[i].getY(), array[i].WIDTH, array[i].HEIGHT);

            Shape drow = new Shape();
        }*/
    }
}