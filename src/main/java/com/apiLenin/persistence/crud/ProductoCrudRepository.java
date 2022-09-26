
package com.apiLenin.persistence.crud;

import com.apiLenin.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>{
    List<Producto>findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findBycantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
