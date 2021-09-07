package mision.model.Dto;

public class DtoEmpleado {

    private int empCedula;
    private String empApellidos;
    private String empNombre;
    private int idCargo;
    private int idSede;

   public DtoEmpleado(){
       
   }

    public DtoEmpleado(int empCedula, String empApellidos, String empNombre) {
        this.empCedula = empCedula;
        this.empApellidos = empApellidos;
        this.empNombre = empNombre;

    }

    public DtoEmpleado(int empCedula, String empApellidos, String empNombre, int idCargo, int idSede) {
        this.empCedula = empCedula;
        this.empApellidos = empApellidos;
        this.empNombre = empNombre;
        this.idCargo = idCargo;
        this.idSede = idSede;
    }

    /**
     * @return the empCedula
     */
    public int getEmpCedula() {
        return empCedula;
    }

    /**
     * @return the empApellidos
     */
    public String getEmpApellidos() {
        return empApellidos;
    }

    /**
     * @param empApellidos the empApellidos to set
     */
    public void setEmpApellidos(String empApellidos) {
        this.empApellidos = empApellidos;
    }

    /**
     * @return the empNombre
     */
    public String getEmpNombre() {
        return empNombre;
    }

    /**
     * @param empNombre the empNombre to set
     */
    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    /**
     * @return the idCargo
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    /**
     * @return the idSede
     */
    public int getIdSede() {
        return idSede;
    }

    /**
     * @param idSede the idSede to set
     */
    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }
    
     public Object[] toArray(){
        Object[] data = {empCedula, empNombre, empApellidos, idCargo, idSede};
        return data;
    }
    
    

}
