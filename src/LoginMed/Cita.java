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

public class Cita {
    private String idCita;
    private Date fecha;
    private Medico medico; // Atributo para asociar un médico con la cita

    public Cita(String idCita, Date fecha) {
        this.idCita = idCita;
        this.fecha = fecha;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico; // Asigna el médico a la cita
    }
}
