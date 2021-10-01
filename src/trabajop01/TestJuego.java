/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop01;

/**
 *
 * @author Orlando
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot walee = new Robot();
        Hombre fermin = new Hombre();
        Hombre tomas = new Hombre();
        
        fermin.JugarConRobot(walee);
        tomas.JugarConRobot(walee);
        
        
    }
    
}
