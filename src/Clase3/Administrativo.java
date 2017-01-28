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

     
    public class Administrativo extends Empleado {
             
         private String Sueldo;
         
         public String getSueldo() {
          return Sueldo;
        }   
     public void setSueldo(String Sueldo) {
        this.Sueldo= Sueldo;
    }
     public Administrativo (String legajo, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni,legajo);
        this.Sueldo = Sueldo;
    }
    }


     
