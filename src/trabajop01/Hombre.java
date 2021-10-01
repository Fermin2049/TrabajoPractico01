/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop01;

import java.util.Scanner;

/**
 *
 * @author Orlando
 */
public class Hombre {

    public Hombre() {
    }
    Scanner entrada = new Scanner(System.in);
    private boolean condicion;
    
    public void JugarConRobot(Robot robot){
        System.out.println("Despierta al robot con true o apagalo con false: ");
        condicion=entrada.nextBoolean();
        robot.setDespertar(condicion);
        robot.avanzar();
        robot.retroceder();
        robot.getEnergia();
        robot.dormir();
        System.out.println("Energia Actuales: "+robot.getEnergia());
    }
}
