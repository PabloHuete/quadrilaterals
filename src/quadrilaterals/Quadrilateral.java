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
public abstract class Quadrilateral {
    
    private double smallDiagonal;
    private double largeDiagonal;
    protected String figure;
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract String toTextLocal();

    public double getSmallDiagonal() {
        return smallDiagonal;
    }

    public void setSmallDiagonal(double smallDiagonal) {
        this.smallDiagonal = smallDiagonal;
    }

    public double getLargeDiagonal() {
        return largeDiagonal;
    }

    public void setLargeDiagonal(double largeDiagonal) {
        this.largeDiagonal = largeDiagonal;
    }
 
    public String toText()
    {
        return (Utility.printLine(80) +
                "Figura: " + figure + "\n" + Utility.printLine(80) +
                toTextLocal() + "\n" +
                "Diagonal menor: " + getSmallDiagonal() + "\n" +
                "Diagonal mayor: " + getLargeDiagonal()+ "\n" +
                "Area: " + calculateArea() + "\n" +
                "Perimetro: " + calculatePerimeter() + "\n");
    }
}
