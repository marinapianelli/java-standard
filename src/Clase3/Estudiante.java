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

    public class Estudiante extends Persona {
         
        private String matricula;
           
        public String getMatricula() {
          return matricula;
        }   
     
        public void setMatricula(String matricula) {
        this.matricula= matricula;
    }

    public Estudiante(String legajo, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.matricula = matricula;
    }
    }

