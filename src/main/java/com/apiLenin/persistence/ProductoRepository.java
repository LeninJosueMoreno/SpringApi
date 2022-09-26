package com.apiLenin.persistence;

import com.apiLenin.persistence.crud.ProductoCrudRepository;
import com.apiLenin.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {

        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findBycantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto product) {
        return productoCrudRepository.save(product);
    }
    
    public void delete (int inProduct){
        productoCrudRepository.deleteById(inProduct);
    }
}
