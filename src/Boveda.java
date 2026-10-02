
public interface Boveda<T> {

    /** Agrega un elemento a la bóveda. */
    void guardar(T elemento);

    /** Quita y devuelve el último elemento guardado. */
    T sacar();

    /** Indica si la bóveda no contiene ningún elemento. */
    boolean estaVacia();

    /** Devuelve cuántos elementos hay guardados actualmente. */
    int tamanio();
}
