package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConexionDB {

    public static ConexionDB instancia;//Sirve para aplicar el singleton
    JSONParser parser = new JSONParser();
    private Connection conn = null;

    private ConexionDB() {
        try {
            String credentials_path = System.getProperty("user.dir") + "/src/utils/dbCredenciales.json";
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(credentials_path));

            String host = (String) jsonObject.get("db_ip");
            String port = (String) jsonObject.get("dp_port");
            String username = (String) jsonObject.get("db_user");
            String password = (String) jsonObject.get("db_pssword");
            String baseDatos = (String) jsonObject.get("db_base");
            String dbURL = "jdbc:mysql://" + host + ":" + port + "/" + baseDatos;

            conn = DriverManager.getConnection(dbURL, username, password);

        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } 

    }

    public synchronized static ConexionDB saberConexion() {
        if (instancia == null) {
            instancia = new ConexionDB();
            System.out.println("Conexion exitosa");
        }
        return instancia;
    }

    public Connection getConn() {
        return conn;
    }
    
    public void cerrarConexion(){       
        instancia = null;
        System.out.println("Cerrada la conexion");
    }
    
    public static void main(String[] args) {
       // private static final ConexionDB conn = ConexionDB.saberConexion();
        saberConexion();
       // cerrarConexion();
    }

}
