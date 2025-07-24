/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author UTN
 */
public abstract class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public void correr(){
        segundo++;
        if (segundo==60) {
            segundo=0;
            minuto++;
        }
        if (minuto==60) {
            minuto=0;
            hora++;
        }
        if (hora==24) {
            hora=0;
            
        }
    }
    public String toString(){
        String h,m,s;
        h="0"+String.valueOf(hora);
        if (hora<10) {
            h="0".concat(h);
        }
        m="0"+String.valueOf(minuto);
        if (hora<10) {
            h="0".concat(h);
        }
        s="0"+String.valueOf(segundo);
        if (hora<10) {
            s="0".concat(s);
        }
        return h+":"+m+":"+s;
    }
}
