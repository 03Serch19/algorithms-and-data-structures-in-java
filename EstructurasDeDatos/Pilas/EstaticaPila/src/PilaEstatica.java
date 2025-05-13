//es una forma de representar una pila, pero la naturaleza dinamica de una pila, es naturalmente mejor representada mediante nodos
public class PilaEstatica {
  int[] vectorPila;
  int cima;

  public PilaEstatica(int tamaño) {
    vectorPila = new int[tamaño];
    cima = -1;
  }

  // metodo push
  public void empujar(int dato) {
    cima++;
    vectorPila[cima] = dato;
  }

  // metodo pop
  public int sacar() {
    int fuera = vectorPila[cima];
    cima--;
    return fuera;
  }

  // metodo parra saebr si la pilla esta vacia
  public boolean estaVacia() {
    return cima == -1;
  }

  // metodo parra saebr si la pilla esta llena
  public boolean estaLlena() {
    return vectorPila.length - 1 == cima;
  }

  // metopdop para saberr que elemento se encuentrra en la cima
  public int cima() {
    return vectorPila[cima];
  }

  // metodo parra saber el tamño de la pila
  public int tamaño() {
    return vectorPila.length;
  }

  // metodo pora vaciar pila
  public void vaciar() {
    cima = -1;
  }

}
