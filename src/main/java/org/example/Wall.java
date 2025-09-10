package org.example;

public class Wall {
    private double width;
    private double height;

    // Constructor: 2 parametreyi set eder
    public Wall(double width, double height) {
        setWidth(width);   // < 0 gelirse 0 yapacağız
        setHeight(height); // < 0 gelirse 0 yapacağız
    }

    // İstenen 5 metod
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}
