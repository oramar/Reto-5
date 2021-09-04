
package mision.model.interfaces;

import java.util.List;


public interface ICrudDao <T, ID>{//T: Entidad, ID: tipo clave Primaria
    public boolean create(T entity);
    public boolean deleteById(ID id);
    public boolean update(T entity);
    public T read(ID id);
    public List<T> findAll();
    
}
