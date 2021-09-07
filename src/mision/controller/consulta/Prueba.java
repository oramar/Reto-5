
package mision.controller.consulta;

import mision.model.Dto.DtoConsulta;
import mision.model.Dto.DtoEmpleado;
import mision.model.dao.DaoConsulta;
import mision.model.dao.DaoEmpleado;
import mision.view.formularios.FrmConsultas;
import mision.view.laminas.ControlsPanel;




public class Prueba {
    
    public static void main(String[] args) {
        DaoEmpleado a = new DaoEmpleado();
        DtoEmpleado b = new DtoEmpleado();        
        FrmConsultas c = new FrmConsultas();
        ControlsPanel d = new ControlsPanel();
      ConstrollerEventoEmpleado l = new ConstrollerEventoEmpleado(a,b,c,d);
    }
}
