public class NodoArbol {
  int dato;
  String nombre;
  NodoArbol hIzquierdo;
  NodoArbol hDerecho;
  public NodoArbol(int dato,String nombre) {
    this.dato = dato;
    this.nombre=nombre;
    this.hIzquierdo = null; 
    this.hDerecho = null;
  }
  @Override
  public String toString() {
    return "NodoArbol [dato=" + dato + ", nombre=" + nombre + "]";
  }
}
