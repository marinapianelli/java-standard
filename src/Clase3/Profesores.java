/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

/**
 *
 * @author educacionit
 */
   public class Profesores extends Empleado {
       
       private String lenguaje;
       private int valorHora;
       
       public String getLenguaje() {
          return lenguaje;
         }
       public int  getValorHora() {
          return valorHora;
         } 
       public void setLenguaje(String Lenguaje) {
        this.lenguaje= Lenguaje;
         }

        public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
         }

public Profesores (String legajo, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni,legajo);
        this.lenguaje = lenguaje;
        this.valorHora = valorHora;
         }

}