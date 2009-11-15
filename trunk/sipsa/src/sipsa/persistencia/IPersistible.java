package sipsa.persistencia;

/**
 * Interface a implementar para controlar que los objetos sean persistibles
 * @author Claudio Rodrigo Pereyra Diaz
 * @author Maria Eugenia Sanchez
 */
public interface IPersistible {
    /**
     * obtiene el identificador de la clase que lo implemente
     * @return devuelve el identificador
     */
    public int getID();
}
