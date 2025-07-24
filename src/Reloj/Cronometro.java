/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;


public class Cronometro {
    private boolean iniciar;
    private boolean reinicio;

    public boolean isIniciar() {
        return iniciar;
    }

    public boolean isReinicio() {
        return reinicio;
    }

    public void iniciar(){
        this.iniciar=true;
    }
    
    public void detener(){
        this.iniciar=false;
    }
    
}
