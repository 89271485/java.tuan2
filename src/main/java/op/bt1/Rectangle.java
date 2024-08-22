/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op.bt1;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
        private double length;
    private double width;
    
    public Rectangle(){
        this(1,1);
    } 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
            
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double findArea() {
        double area = length*width;
        return area;
    }
    public double findPerimeter() {
        double area  = (length+width)*2;
        return area;
    } 
}
