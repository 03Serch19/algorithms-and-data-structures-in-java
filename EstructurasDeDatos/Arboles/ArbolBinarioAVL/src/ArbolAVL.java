//esta version puede llevar aconfusiones, funcioana, solo que las rotaciones , sus metodos esttan invertods y esto puede llevar a confusines sios basamos en la teoria
public class ArbolAVL {
  private  NodoArbolAVL raiz;

  public ArbolAVL() {
    raiz = null;
  }
  
  // buscar // se podria usar un wrappeed
  // method asi al ususario le doy una intnerfaz amigable y nno tenga que estar
  // mandando ell aprametro de la raiiz
  public NodoArbolAVL buscar(int dato, NodoArbolAVL r) {
    if (r == null)
      return null;
    else if (r.dato == dato)
      return r;
    else if (r.dato < dato)
      return buscar(dato, r.hDerecho);
    else
      return buscar(dato, r.hIzquierdo);
  }

  // obtener factor de equiliibrio  //en realidad aqui se obtiene altura de este subarbol ,   ni en el codigo ya que  no hay un punto donde  evaluaemos un valor negativo, pro tanto  nuestros ddesbalances se basan segun las  alturas  dde los arboles
  public int obtenerFE(NodoArbolAVL x) {
    if (x == null)
      return -1;
    else
      return x.fe;
  }

  // Rotación simple a la izquierda
  public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c) {
    NodoArbolAVL aux = c.hIzquierdo;
    c.hIzquierdo = aux.hDerecho;
    aux.hDerecho = c;
    c.fe = Math.max(obtenerFE(c.hIzquierdo), obtenerFE(c.hDerecho)) + 1;
    aux.fe = Math.max(obtenerFE(aux.hIzquierdo), obtenerFE(aux.hDerecho)) + 1;
    return aux;
  }

  // Rotación simple a la derechar
  public NodoArbolAVL rotacionDerecha(NodoArbolAVL c) {
    NodoArbolAVL aux = c.hDerecho;
    c.hDerecho = aux.hIzquierdo;
    aux.hIzquierdo = c;
    c.fe = Math.max(obtenerFE(c.hIzquierdo), obtenerFE(c.hDerecho)) + 1;
    aux.fe = Math.max(obtenerFE(aux.hIzquierdo), obtenerFE(aux.hDerecho)) + 1;
    return aux;
  }

  // Rotaciónn doble a la derecha
  public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c) {
    NodoArbolAVL aux;
    c.hDerecho = rotacionIzquierda(c.hDerecho);
    aux = rotacionDerecha(c);
    return aux;
  }

  // Rotaciónn doibe a la izquierda
  public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c) {
    NodoArbolAVL aux;
    c.hIzquierdo = rotacionDerecha(c.hIzquierdo);
    aux = rotacionIzquierda(c);
    return aux;
  }

  // metodo para innsertar AVL
  private NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr) {
    NodoArbolAVL nuevoPadre = subAr;
    if (nuevo.dato < subAr.dato) {
      if (subAr.hIzquierdo == null) {
        subAr.hIzquierdo = nuevo;
      } else {
        subAr.hIzquierdo = insertarAVL(nuevo, subAr.hIzquierdo);
        if ((obtenerFE(subAr.hIzquierdo) - obtenerFE(subAr.hDerecho)) == 2) {
          if (nuevo.dato < subAr.hIzquierdo.dato) {
            nuevoPadre = rotacionIzquierda(subAr);
          } else {
            nuevoPadre = rotacionDobleIzquierda(subAr);
          }
        }
      }
    }else if(nuevo.dato > subAr.dato){
      if (subAr.hDerecho == null) {
        subAr.hDerecho = nuevo;
      } else {
        subAr.hDerecho = insertarAVL(nuevo, subAr.hDerecho);
        if ((obtenerFE(subAr.hDerecho) - obtenerFE(subAr.hIzquierdo)) == 2) {
          if (nuevo.dato > subAr.hDerecho.dato) {
            nuevoPadre = rotacionDerecha(subAr);
          } else {
            nuevoPadre = rotacionDobleDerecha(subAr);
          }
        }
      }
    }else{
      System.out.println("Nodo duplicado");
    }
    //Actualizar la altura
    if((subAr.hIzquierdo==null)&&(subAr.hDerecho!=null)){
      subAr.fe=subAr.hDerecho.fe+1;
    }else if((subAr.hDerecho==null)&&(subAr.hIzquierdo !=null)){
      subAr.fe=subAr.hIzquierdo.fe+1;
    }else{
      subAr.fe=Math.max(obtenerFE(subAr.hIzquierdo), obtenerFE(subAr.hDerecho))+1;
    }

    return nuevoPadre;
  }
 //metodo para insertar
 public void insertar(int dato) {
  NodoArbolAVL nuevo = new NodoArbolAVL(dato);
  if (raiz == null) {
    raiz = nuevo;
  } else {
   raiz=insertarAVL(nuevo,raiz);
  }
}
// metodo para recorrer el arbol InOrden
public void inOrden(NodoArbolAVL r) {
  if (r != null) {
    inOrden(r.hIzquierdo);
    System.out.println("--" + r.toString() + "--");
    inOrden(r.hDerecho);
  }
}

// metodo para recorrer el arbol PreOrden
public void preOrden(NodoArbolAVL r) {
  if (r != null) {
    System.out.println("--" + r.toString() + "--");
    preOrden(r.hIzquierdo);
    preOrden(r.hDerecho);
  }
}

// metodo para recorrer el arbol PostOrden
public void postOrden(NodoArbolAVL r) {
  if (r != null) {
    postOrden(r.hIzquierdo);
    postOrden(r.hDerecho);
    System.out.println("--" + r.toString() + "--");
  }
}

public NodoArbolAVL getRaiz() {
  return raiz;
}

}
