/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadrilaterals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mismatso
 */
public class Utility {
    
    //Creacion de objeto para lectura desde teclado
    //---------------------------------------------
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader (System.in));
   
    public static double readDouble() throws IOException
    {
        try {
            return(Double.parseDouble(BR.readLine()));
        } catch (IOException e) {
            return 0;
        }
    }
    
    public static String printLine(int longitud)
    {
        String linea = "";
        for(int i=0; i <=longitud; i++)
        {
            linea += "-";
        }
        return linea+"\n";
    }
    
    public static void printToScreenLn(String text)
    {
        printToScreen(text+"\n");
    }
        
    public static void printToScreen(String text)
    {
        System.out.print(text);
    }
}




