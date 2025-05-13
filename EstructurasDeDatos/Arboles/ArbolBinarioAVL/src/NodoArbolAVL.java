public class NodoArbolAVL {
  int dato, fe;
  NodoArbolAVL hIzquierdo, hDerecho;

  public NodoArbolAVL(int dato) {
    this.dato = dato;
    this.fe = 0;
    this.hIzquierdo = null;
    this.hDerecho = null;

  }
  @Override
  public String toString() {
    return "NodoArbolAVL [dato=" + dato + "]";
  }

}
