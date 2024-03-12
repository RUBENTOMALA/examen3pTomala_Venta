package ec.edu.espe.tercerparcial.ventas.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "ventas")
public class Venta {

    @Field("id_venta")
    private String idVenta;

    @Field("fecha_venta")
    private Date fechaVenta;

    @Field("codigo_unico")
    private String codigoUnico;

    @Field("nombre_producto")
    private String nombreProducto;

    @Field("precio_unitario")
    private BigDecimal precioUnitario;

    @Field("cantidad")
    private long cantidad;

    @Field("valor_total")
    private BigDecimal valorTotal;

    @Version
    private long version;

    public Venta() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venta venta = (Venta) o;
        return Objects.equals(idVenta, venta.idVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVenta);
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta='" + idVenta + '\'' +
                ", fechaVenta=" + fechaVenta +
                ", codigoUnico='" + codigoUnico + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                ", valorTotal=" + valorTotal +
                ", version=" + version +
                '}';
    }
}
