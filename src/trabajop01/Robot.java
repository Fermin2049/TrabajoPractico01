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
public class Robot {
    
    private double energia=1000;
    private boolean despertar;
    private int pasos;
    
    Scanner entrada = new Scanner(System.in);
    
    public Robot() {
        
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public boolean isDespertar() {
        return despertar;
    }

    public void setDespertar(boolean despertar) {
        this.despertar = despertar;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    
    
    public void avanzar(){
        if (despertar==true) {
            System.out.println("¿Cuantos pasos quieres avanzar:");
            pasos=entrada.nextInt();
            energia -= pasos * 0.1;
        }else{
            System.out.println("El robot esta apagado");
        }
        
    }
    public void retroceder(){
        if (despertar==true) {
            System.out.println("¿Cuantos pasos quieres retroceder:");
            pasos=entrada.nextInt();
            energia -= pasos * 0.1;
        }else{
            System.out.println("El robot esta apagado");
        }
        
    }
    public boolean  dormir(){
        despertar=false;
        return despertar;
    }
    public boolean despertar(){
        despertar=true;
        return despertar;
    }
    public void recargar(){
        energia=1000;
    }
    public boolean bateriaLlena(){
        return energia==1000;
   
    }
    public boolean bateriaVacia(){
        return energia==0;
    }
    public double energiaActaul(){
        return getEnergia();
        
    }
}
