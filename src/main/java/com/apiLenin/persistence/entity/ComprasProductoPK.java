package com.apiLenin.persistence.entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_Compra")
    private Integer idCompra;
    @Column(name = "id_Producto")
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }


}
