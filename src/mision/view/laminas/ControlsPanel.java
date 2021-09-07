package mision.view.laminas;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mision.model.Dto.DtoConsulta;
import mision.model.Dto.DtoEmpleado;
import mision.controller.consulta.iniciarDatos;

public class ControlsPanel extends JPanel {

    private JComboBox<DtoEmpleado> cbxEmpleado;
    private JTable tblResultados;

    public ControlsPanel(ResultsPanel resulttsPane) {
        this.tblResultados = resulttsPane.getTblResults();
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(2, 1));
        iniciarDatos iniciaDatos = new iniciarDatos();
        this.setTblResults(iniciaDatos.getEmpleado());

        this.cbxEmpleado = new JComboBox();
        this.cbxEmpleado.setModel(new DefaultComboBoxModel<>(iniciaDatos.getEmpleado().toArray(new DtoEmpleado[iniciaDatos.getEmpleado().size()])));
        this.cbxEmpleado.setSelectedIndex(0);
        add(this.cbxEmpleado);
        ChangeEvent eventoCambio = new ChangeEvent(this);
        this.cbxEmpleado.addActionListener(eventoCambio);

    }

    public JComboBox<DtoEmpleado> getCbxEmpleado() {
        return cbxEmpleado;
    }

    public void setCbxEmpleado(JComboBox<DtoEmpleado> cbxEmpleado) {
        this.cbxEmpleado = cbxEmpleado;
    }

    public void setTblResults(ArrayList<DtoEmpleado> empleado) {
        String[] headers = {"CEDULA", "NOMBRE", "APELLIDO", "CARGO", "SEDE"};
        this.tblResultados.removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers);
        this.tblResultados.setModel(tableModel);
        for (int i = 0; i < empleado.size(); i++) {
            tableModel.addRow(empleado.get(i).toArray());
        }
    }

}
