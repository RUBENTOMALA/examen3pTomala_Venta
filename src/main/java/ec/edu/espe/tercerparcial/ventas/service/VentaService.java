package ec.edu.espe.tercerparcial.ventas.service;

import ec.edu.espe.tercerparcial.ventas.dao.VentaRepository;

public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public Venta crearVenta(Venta venta){

        return this.productoRepository.save(producto);
    }
}
