package mision.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mision.model.Dto.DtoConsulta;
import mision.model.Dto.DtoEmpleado;
import mision.model.interfaces.IDaoEmpleado;
import utils.ConexionDB;

public class DaoEmpleado implements IDaoEmpleado {

    private static final String SQL_READEMPLEADO = "select concat(emp_nombres,' ',emp_apellidos) as nombre from empleado; ";
    private static final ConexionDB conn = ConexionDB.saberConexion();

    @Override
    public ArrayList<DtoEmpleado> findEmpleado() {
         PreparedStatement ps;
          ResultSet res=null;
          ArrayList<DtoEmpleado> empleados = new ArrayList<>();
          try {
            ps = conn.getConn().prepareStatement(SQL_READEMPLEADO);
            while(res.next()){
                empleados.add(new DtoEmpleado(res.getInt(1), res.getString(2), res.getString(3)));
                
            }
            return empleados;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode()
                    + "\nError :" + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }

        return empleados;
        
    }

    @Override
    public boolean create(DtoEmpleado entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DtoEmpleado entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DtoEmpleado read(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DtoEmpleado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
