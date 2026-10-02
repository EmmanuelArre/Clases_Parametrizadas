public class BovedaArreglo<T> implements Boveda<T> {

    private final T[] elementos;
    private int cantidad;

    /** Crea una bóveda con la capacidad indicada. */
    @SuppressWarnings("unchecked")
    public BovedaArreglo(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
        this.elementos = (T[]) new Object[capacidad];
        this.cantidad = 0;
    }

    @Override
    public void guardar(T elemento) {
        if (cantidad == elementos.length) {
            throw new IllegalStateException(
                "La bóveda está llena (capacidad: " + elementos.length + ").");
        }
        elementos[cantidad] = elemento;
        cantidad++;
    }

    @Override
    public T sacar() {
        if (estaVacia()) {
            throw new IllegalStateException("La bóveda está vacía, no hay nada que sacar.");
        }
        cantidad--;
        T elemento = elementos[cantidad];
        elementos[cantidad] = null; // libera la referencia
        return elemento;
    }

    @Override
    public boolean estaVacia() {
        return cantidad == 0;
    }

    @Override
    public int tamanio() {
        return cantidad;
    }
}