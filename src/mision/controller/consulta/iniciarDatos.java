
package mision.controller.consulta;

import java.util.ArrayList;
import mision.model.Dto.DtoEmpleado;
import mision.model.dao.DaoEmpleado;


public class iniciarDatos {
    private ArrayList<DtoEmpleado> empleado = null;
    
    public iniciarDatos(){
        DaoEmpleado empleadoDao = new DaoEmpleado();
        this.empleado = empleadoDao.findEmpleado();
        this.empleado.add(0, new DtoEmpleado(-1, "Empleados", ""));
        
    }

    public ArrayList<DtoEmpleado> getEmpleado() {
        return empleado;
    }
    
    
}
