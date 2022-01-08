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
public class Medico extends Persona {
    private float sueldo;
    private int fecha_ingreso;
    private int matricula;
    private String especialidad;
    private String horario;
    
    public Medico(){
        sueldo=0;
        fecha_ingreso=0;
        matricula=0;
        especialidad="";
        horario="";
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(int fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public int calcularAntiguedad(){
        Calendar calendario;
        calendario = Calendar.getInstance();
        int antiguedad;
        antiguedad= calendario.get(Calendar.YEAR)-fecha_ingreso;
        return antiguedad;
    
    }
    
    public float calcularSueldoNeto(int cant_paciente){
        float descuento;
        descuento=sueldo*0.18f;
        float plus;
        plus=150*cant_paciente;
        float sueldoneto;
        sueldoneto=sueldo-descuento+plus;
        return sueldoneto;        
    }
    

}//fin de clase
