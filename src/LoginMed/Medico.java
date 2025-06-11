/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginMed;

/**
 *
 * @author Jossue
 */
import java.util.Date;
import java.util.LinkedList;

public class Medico extends Persona {
    private String especialidad;
    private double salario;
    private LinkedList<Cita> citas;

    public Medico(String identificacion, String nombre, String direccion, Date fechaNacimiento, String telefono, String especialidad, double salario) {
        super(identificacion, nombre, direccion, fechaNacimiento, telefono);
        this.especialidad = especialidad;
        this.salario = salario;
        this.citas = new LinkedList<>();
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public LinkedList<Cita> getCitas() {
        return citas;
    }
}
