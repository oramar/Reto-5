
package controller;

import mision.model.Dto.DtoConsulta;
import mision.model.dao.DaoConsulta;


public class Prueba {
    public static void main(String[] args) {
        DaoConsulta consulta = new DaoConsulta();
        DtoConsulta buscar = consulta.read(101);
        System.out.println(buscar.getConObservacion());
    }
}
