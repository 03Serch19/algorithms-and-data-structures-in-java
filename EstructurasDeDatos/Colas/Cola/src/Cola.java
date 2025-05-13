public class Cola {
  private NodoCola frente, ultimo;
  int tamanio;

  public Cola() {
    frente = ultimo = null;
    tamanio = 0;
  }

  public boolean isEmpty() {
    return frente == null;
  }

  public void add(int dato) {
    if (isEmpty()) {
      ultimo = frente = new NodoCola(dato);
    } else {
      ultimo.siguiente = new NodoCola(dato);
      ultimo = ultimo.siguiente;
    }
    tamanio++;
  }

  public NodoCola remove() {// recordarr validarr en la rpesentacion que no este vacia la cola
    NodoCola eliminado = frente;
    frente = frente.siguiente;
    tamanio--;
    return eliminado;
  }

  public NodoCola inicioCola() {
    return frente;
  }

  public int length() {
    return tamanio;
  }

}
