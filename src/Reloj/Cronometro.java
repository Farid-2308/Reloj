/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;


public class Cronometro extends Tiempo implements Controlable{

    @Override
    public void iniciar() {
        this.activo=true;
    }

    @Override
    public void detener() {
        this.activo=false;
    }
}
