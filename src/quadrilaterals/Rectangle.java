/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaterals;

/**
 *
 * @author Pablo
 */
public class Rectangle extends Quadrilateral {

    private final double base;
    private final double height;
    
    public Rectangle(double base, double height)
    {
        super.figure = "RECTANGULO";
        this.base = base;
        this.height = height;
        
        double diagonal = calcularDiagonal(base, height);
        super.setLargeDiagonal(diagonal);
        super.setSmallDiagonal(diagonal);
    }
    
    private double calcularDiagonal(double base, double height)
    {
        // diagonal = raíz(base^2 + altura^2)
        return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
    }

    @Override
    public double calculateArea() {
        return (base * height);
    }

    @Override
    public double calculatePerimeter() {
        return (2*base + 2*height);
    }
    
    @Override
    public String toTextLocal()
    {
        return("Base: " + this.base + "\n" +
               "Altura: " + this.height);
    }  
}
