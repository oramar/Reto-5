
package mision.model.Dto;

public class DtoConsulta {
    private int conNumero;
    private String conFecha;
    private String conObservacion;
    private int medicoId ;
    private int pacienteId;
    private int turNumero;
    
    
    public DtoConsulta(int conNumero, String conFecha) {
        this.conNumero = conNumero;
        this.conFecha = conFecha;
    }
      public DtoConsulta(int conNumero, String conFecha, String conObservacion) {
        this.conNumero = conNumero;
        this.conFecha = conFecha;
        this.conObservacion = conObservacion;
        this.medicoId = medicoId;
        this.pacienteId = pacienteId;
        this.turNumero = turNumero;
    }

    public DtoConsulta(int conNumero, String conFecha, String conObservacion, int medicoId, int pacienteId, int turNumero) {
        this.conNumero = conNumero;
        this.conFecha = conFecha;
        this.conObservacion = conObservacion;
        this.medicoId = medicoId;
        this.pacienteId = pacienteId;
        this.turNumero = turNumero;
    }

    public int getConNumero() {
        return conNumero;
    }

    public void setConNumero(int conNumero) {
        this.conNumero = conNumero;
    }

    public String getConFecha() {
        return conFecha;
    }

    public void setConFecha(String conFecha) {
        this.conFecha = conFecha;
    }

    public String getConObservacion() {
        return conObservacion;
    }

    public void setConObservacion(String conObservacion) {
        this.conObservacion = conObservacion;
    }

    public int getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public int getTurNumero() {
        return turNumero;
    }

    public void setTurNumero(int turNumero) {
        this.turNumero = turNumero;
    }

    @Override
    public String toString() {
        return "DtoConsulta{" + "conNumero=" + conNumero + ", conFecha=" + conFecha + ", conObservacion=" + conObservacion + ", medicoId=" + medicoId + ", pacienteId=" + pacienteId + ", turNumero=" + turNumero + '}';
    }
    
    
    
    
}
