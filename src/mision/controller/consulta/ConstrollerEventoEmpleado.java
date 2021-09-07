package mision.controller.consulta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeEvent;
import mision.model.Dto.DtoConsulta;
import mision.model.Dto.DtoEmpleado;
import mision.model.dao.DaoConsulta;
import mision.model.dao.DaoEmpleado;
import mision.view.formularios.FrmConsultas;
import mision.view.laminas.ControlsPanel;

public class ConstrollerEventoEmpleado implements ActionListener{
    private ControlsPanel controlPanel;

    private DaoEmpleado modeloDao;
    private FrmConsultas frmConsulta;
    private ControlsPanel lamina;
    private DtoEmpleado modeloDto;
    

    public ConstrollerEventoEmpleado(ControlsPanel controlPanel){

     this.controlPanel = controlPanel;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == this.controlPanel.getCbxEmpleado()) {
            DaoEmpleado presentationDAO = new DaoEmpleado();
           ArrayList<DtoEmpleado> empleado = null;
            int emp     = ((DtoEmpleado)this.controlPanel.getCbxEmpleado.getSelectedItem()).getId();
            if(museum == -1) {
                presentations = presentationDAO.getAllPresentations();
                presentations.add(0, new PresentationModel(-1, "Todas las presentaciones", -1, -1));
            }
            else {
                presentations = presentationDAO.getPresentationsByMuseum(museum);
                presentations.add(0, new PresentationModel(-1, "Todas las presentaciones", -1, -1));
            }
            this.controlsPanel.setCbxPresentationsList(presentations);
        }
    }

}
