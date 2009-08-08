/*
 * Sistemas de Informacion II 2009
 * Proyecto Sipsa
 */

package sipsa.controles;

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import sipsa.gui.escritorio.MenuPrincipal;
import sipsa.gui.interfaces.IMenuPrincipal;

/**
 * Controlador del Menu Principal
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public class MenuPrincipalControl implements IMenuPrincipal {

    /**
     * Muestra el Menu Principal
     */
    public void MostrarMenu(){
        MenuPrincipal menuPrincipal = new MenuPrincipal(this);
        menuPrincipal.setVisible(true);
    }

    /**
     * Invoca el fomulario para Administracion de Puntos de Venta
     */
    public void AdministrarPv() {
        PvControl pvControl = new PvControl();
        pvControl.MostrarAdministrar();
    }

    /**
     * Invoca el formulario para Administracion de Puntos de Atencion al Cliente
     */
    public void AdministrarPac() {
        PacControl pacControl = new PacControl();
        pacControl.MostrarAdministrar();
    }

    /**
     * Invoca el fomulario para Administracion de Tipos de Productos
     */
    public void AdministrarTipoProducto() {
        TipoProductoControl tipoProductoControl = new TipoProductoControl();
        tipoProductoControl.MostrarAdministrar();
    }

    /**
     * Invoca el servicio de importacion de Productos desde un archivo
     */
    public void ImportarArchivoProductos() {
        //@TODO revisar los try y catchs
        ProductosControl control = new ProductosControl();
        try {
            try {
                control.ImportarProductosDesdeArchivo();
            } catch (ParseException ex) {
                Logger.getLogger(MenuPrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
