/*
 * Sistemas de Informacion II 2009
 * Proyecto Sipsa
 */
package sipsa.control;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import sipsa.SipsaExcepcion;
import sipsa.dominio.Modelo;
import sipsa.dominio.Producto;
import sipsa.dominio.Pv;
import sipsa.dominio.Venta;
import sipsa.persistencia.Persistencia;

/**
 * Controlador de Ventas
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class VentaControl {

    private Persistencia persistencia = Persistencia.getPersistencia();

    /**
     * Activa una garantía para una nueva venta
     * @param pv Punto de Venta que registra la venta
     * @param fechaFactura Fecha de Facturacion
     * @param nroFactura Numero de la Factura que se registra
     * @param idModelo Identificador del modelo del Producto
     * @param nroSerie Numero de Serie del Producto vendido
     * @throws SipsaExcepcion Si ocurre algun error al intentar activar la garantia
     */
    public void activarGarantia(Pv pv, String fechaFactura, String nroFactura, int idModelo, String nroSerie) throws SipsaExcepcion {
        Venta venta = new Venta();
        ProductosControl productosControl = new ProductosControl();
        Producto producto = new Producto();
        producto.setNroSerie(nroSerie);
        producto.setModelo(new Modelo(idModelo));
        producto = productosControl.existe(producto);
        if (producto == null) {
            throw new SipsaExcepcion("El el producto no se encuentra disponible para activacion de garantia, verifique el tipo, modelo y número de serie");
        }
        venta.setProducto(producto);
        if (this.isProductoRegistrado(venta)) {
            throw new SipsaExcepcion("El el producto ya fue registrado anteriormente, la garantia ya se encuentra activada");
        }
        Date fechaFacturaRegistro;
        try {
            fechaFacturaRegistro = DateFormat.getDateInstance().parse(fechaFactura);
        } catch (ParseException ex) {
            ex.printStackTrace();
            throw new SipsaExcepcion("La fecha ingresada no es una fecha valida");
        }
        if (fechaFacturaRegistro.after(new Date(System.currentTimeMillis()))) {
            throw new SipsaExcepcion("La fecha de factura NO puede ser mayor a la fecha actual");
        }
        venta.setFechaFactura(fechaFacturaRegistro);
        if (nroFactura.equals("")) {
            throw new SipsaExcepcion("Debe ingresar el numero de factura de la venta");
        }
        venta.setNroFactura(nroFactura);
        venta.setEmpresaVendedora(pv);
        this.guardarVenta(venta);
    }

    /**
     * Guarda la Venta en el sistema Sipsa
     * @param venta Venta a guardar
     * @throws SipsaExcepcion Si ocurre algun error al intentar guardar la venta
     */
    public void guardarVenta(Venta venta) throws SipsaExcepcion {
        persistencia.guardar(venta);
    }

    private boolean isProductoRegistrado(Venta venta) throws SipsaExcepcion {
        return (persistencia.existe(venta) != null);
    }
}
