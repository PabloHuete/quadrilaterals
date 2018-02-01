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
public class Rhombus extends Quadrilateral{
    private double side;

    public Rhombus(double largeDiagonal, double smallDiagonal) {
        super.figure = "Rombo";
        this.side = calculateSide();
        
        super.setLargeDiagonal(largeDiagonal);
        super.setSmallDiagonal(smallDiagonal);
    }
    
    
    @Override
    public double calculateArea() {
        return (super.getLargeDiagonal()*super.getSmallDiagonal()/2);
    }

    @Override
    public double calculatePerimeter() {
        
        
        return (Math.pow(calculateSide(), 4));
    }
    
    private double calculateSide(){
        double c1 = super.getLargeDiagonal()/2;
        double c2 = super.getSmallDiagonal()/2;
        
        
        return  (Math.sqrt((Math.pow(c1, 2)+ Math.pow(c2, 2))));
    }

    @Override
    public String toTextLocal() {
         return ("Lado: " + this.side);
    }
    
}
