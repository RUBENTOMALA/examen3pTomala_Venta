package ec.edu.espe.tercerparcial.ventas.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "ventas")
public class Venta {

    @Field("id_venta")
    private String idProducto;

    @Field("fecha_venta")
    private Date fechaVenta;

    @Field("codigo_unico")
    private String codigoUnico;

    @Field("nombre_producto")
    private String nombreProducto;

    @Field("precio_unitario")
    private String precioUnitario;
}
