/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaterals;

/**s
 *
 * @author mismatso
 */
public class Square extends Quadrilateral {
    
    private final double side;
    
    public Square(double side)
    {
        super.figure = "CUADRADO";
        this.side = side;
        double diagonal = calculateDiagonal(side);
        super.setLargeDiagonal(diagonal);
        super.setSmallDiagonal(diagonal);
    }
    
    private double calculateDiagonal(double side)
    {
        // La longitud de la diagonal se puede calcular
        // mediante el Teorema de Pitágoras
        return (side * Math.sqrt(2));
    }

    @Override
    public double calculateArea() {
        // El área de un cuadrado es el cuadrado de la longitud del lado
        return (Math.pow(this.side, 2));
    }

    @Override
    public double calculatePerimeter() {
        // Si un cuadrado C tiene lados que miden L, entonces, el perímetro 
        // es igual a 4L, pues los cuatro lados son iguales.
        return (4*this.side);
    }

    @Override
    public String toTextLocal()
    {
        return("Lado: " + this.side);
    }
}

