/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitaladris;

import java.util.Calendar;

/**
 *
 * @author adria
 */
public class Paciente extends Persona {
    
    private int añodenacimiento;
    private String grupo_sang;
    private String obrasocial;
    
    public Paciente(){
        añodenacimiento=0;
        grupo_sang="";
        obrasocial="";
    }

    public int getAñodenacimiento() {
        return añodenacimiento;
    }

    public void setAñodenacimiento(int añodenacimiento) {
        this.añodenacimiento = añodenacimiento;
    }

    public String getGrupo_sang() {
        return grupo_sang;
    }

    public void setGrupo_sang(String grupo_sang) {
        this.grupo_sang = grupo_sang;
    }

    public String getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(String obrasocial) {
        this.obrasocial = obrasocial;
    }
    public int calcularEdad(){
        Calendar calendario;
        calendario = Calendar.getInstance();
        int edad = calendario.get(Calendar.YEAR) - añodenacimiento;        
        return edad; 
    
    }
    public float calcularConsulta(){
        float costoconsulta;
       switch (obrasocial) {//segun
           case "pami":
               costoconsulta = 500;
               break;
           case "osde":
               costoconsulta = 200;
               break;
           default:
               costoconsulta = 800;
       }
       if (calcularEdad()>60)
       {
           costoconsulta=costoconsulta-costoconsulta*0.3f;         
       }
       return costoconsulta;
    
    }
    
}//fin clase
