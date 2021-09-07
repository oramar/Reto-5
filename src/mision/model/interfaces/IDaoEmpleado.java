
package mision.model.interfaces;

import java.util.List;
import mision.model.Dto.DtoEmpleado;




public interface IDaoEmpleado extends ICrudDao<DtoEmpleado,Integer> {
   public List<DtoEmpleado> findEmpleado();
}
