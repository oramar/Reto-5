package mision.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mision.model.Dto.DtoConsulta;
import mision.model.interfaces.IDaoConsulta;
import utils.ConexionDB;

public class DaoConsulta implements IDaoConsulta {

    private static final String SQL_INSER = "INSERT INTO consulta (con_numero,con_fecha,con_observacion,medico_id,paciente_id,tur_numero) VALUES(?,?,?,?,?,?);";
    private static final String SQL_DELETE = "DELETE FROM consulta WHERE con_numero = ?;";
    private static final String SQL_UPDATE = "UPDATE consulta SET con_fecha=?,con_observacion=?,medico_id=?,paciente_id=?,tur_numero=? WHERE = con_numero=?;";
    private static final String SQL_READ = "SELECT * FROM consulta WHERE con_numero =?;";
    private static final String SQL_READALL = "SELECT * FROM consulta;";
   
    private static final ConexionDB conn = ConexionDB.saberConexion();

    @Override
    public boolean create(DtoConsulta entity) {
        PreparedStatement ps;
        try {
            ps = conn.getConn().prepareStatement(SQL_INSER);
            ps.setInt(1, entity.getConNumero());
            ps.setString(2, entity.getConFecha());
            ps.setString(3, entity.getConObservacion());
            ps.setInt(4, entity.getMedicoId());
            ps.setInt(5, entity.getPacienteId());
            ps.setInt(6, entity.getTurNumero());

            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode()
                    + "\nError :" + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }

        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        PreparedStatement ps;
        try {
            ps = conn.getConn().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);

            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode()
                    + "\nError :" + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }

        return false;
    }

    @Override
    public boolean update(DtoConsulta entity) {
        PreparedStatement ps;
        try {
            ps = conn.getConn().prepareStatement(SQL_UPDATE);
            ps.setString(1, entity.getConFecha());
            ps.setString(2, entity.getConObservacion());
            ps.setInt(3, entity.getMedicoId());
            ps.setInt(4, entity.getPacienteId());
            ps.setInt(5, entity.getTurNumero());
            ps.setInt(6, entity.getConNumero());

            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode()
                    + "\nError :" + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }

        return false;
    }

    @Override
    public DtoConsulta read(Integer id) {
        PreparedStatement ps;
        ResultSet res;
        DtoConsulta consulta = null;
        try {
            ps = conn.getConn().prepareStatement(SQL_READ);
            ps.setInt(1, id);

            res = ps.executeQuery();

            while (res.next()) {
                consulta = new DtoConsulta(id, res.getString(2), res.getString(3), res.getInt(4), res.getInt(5), res.getInt(6));
            }
            return consulta;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode()
                    + "\nError :" + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }

        return consulta;
    }

    @Override
    public ArrayList<DtoConsulta> findAll() {
          PreparedStatement ps;
          ResultSet res=null;
          ArrayList<DtoConsulta> consultas = new ArrayList<>();
          try {
            ps = conn.getConn().prepareStatement(SQL_READALL);
            while(res.next()){
                consultas.add(new DtoConsulta(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getInt(5), res.getInt(6)));
                
            }
            return consultas;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Código : " + e.getErrorCode()
                    + "\nError :" + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }

        return consultas;
        
          }

}
