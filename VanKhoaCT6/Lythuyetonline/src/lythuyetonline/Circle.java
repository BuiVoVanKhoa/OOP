/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lythuyetonline;

/**
 *
 * @author FPTSHOP
 */
public class Circle extends Shape {

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String Color, String filled, double radius) {
        this.Color = Color;
        this.filled = filled;
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (2 * 3.14 * radius);
    }

    public double getPerimeter() {
        return (3.14 * radius * radius);
    }
}
