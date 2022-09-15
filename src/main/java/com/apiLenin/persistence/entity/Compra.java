package com.apiLenin.persistence.entity;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Compra")
    private Integer idCompra;

    @Column(name = "id_Cliente")
    private String idCliente;
    
    private LocalDateTime fecha;
    
    @Column(name = "medio_Pago")
    private String medioPago;
    private String comentario;
    private String estado;
}
