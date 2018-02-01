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
public class QuadrilateralsPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrilateral square    = new Square(2);
        Quadrilateral Rhombus   = new Rhombus(6, 8);
        Quadrilateral rectangle = new Rectangle(4, 8);
        
        Utility.printToScreenLn(square.toText());
        Utility.printToScreenLn(Rhombus.toText());
        Utility.printToScreenLn(rectangle.toText());
        
    }
    
}
