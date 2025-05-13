//version usando la teoria y tambien el factore de equilbrriop correctamente
public class ArboAVL3 {
  private NodoArbolAVL2 raiz;

  public ArboAVL3() {
    raiz = null;
  }

  public NodoArbolAVL2 buscar(int elemento, NodoArbolAVL2 subR) {
    if (subR == null) {
      return null;
    } else if (elemento == subR.dato) {
      return subR;
    } else if (elemento > subR.dato) {
      return buscar(elemento, subR.hDerecho);
    } else {
      return buscar(elemento, subR.hIzquierdo);
    }
  }

  // Obtener la altura de un nodo (retorna -1 para nodos nulos)
  private int obtenerAltura(NodoArbolAVL2 n) {
    if (n == null) {
      return -1;
    }
    return n.altura;
  }

  // Obtener el factor de equilibrio de un nodo
  private int obtenerFE(NodoArbolAVL2 n) {
    if (n == null) {
      return 0;
    }
    return obtenerAltura(n.hDerecho) - obtenerAltura(n.hIzquierdo);
  }

  public NodoArbolAVL2 getRaiz() {
    return raiz;
  }

  private NodoArbolAVL2 rotacionSimpleALaDerecha(NodoArbolAVL2 y) {
    NodoArbolAVL2 x = y.hIzquierdo;
    NodoArbolAVL2 T2 = x.hDerecho;

    // Realizar rotación
    x.hDerecho = y;
    y.hIzquierdo = T2;

    // Actualizar alturas
    y.altura = Math.max(obtenerAltura(y.hIzquierdo), obtenerAltura(y.hDerecho)) + 1;
    x.altura = Math.max(obtenerAltura(x.hIzquierdo), obtenerAltura(x.hDerecho)) + 1;

    return x;
  }

  private NodoArbolAVL2 rotacionSimpleALaIzquierda(NodoArbolAVL2 x) {
    NodoArbolAVL2 y = x.hDerecho;
    NodoArbolAVL2 T2 = y.hIzquierdo;

    // Realizar rotación
    y.hIzquierdo = x;
    x.hDerecho = T2;

    // Actualizar alturas
    x.altura = Math.max(obtenerAltura(x.hIzquierdo), obtenerAltura(x.hDerecho)) + 1;
    y.altura = Math.max(obtenerAltura(y.hIzquierdo), obtenerAltura(y.hDerecho)) + 1;

    return y;
  }

  private NodoArbolAVL2 rotacionDobleIzquierda(NodoArbolAVL2 z) {
    z.hIzquierdo = rotacionSimpleALaIzquierda(z.hIzquierdo);
    return rotacionSimpleALaDerecha(z);
  }

  private NodoArbolAVL2 rotacionDobleDerecha(NodoArbolAVL2 z) {
    z.hDerecho = rotacionSimpleALaDerecha(z.hDerecho);
    return rotacionSimpleALaIzquierda(z);
  }

  public void insertar(int elemento) {
    NodoArbolAVL2 nuevo = new NodoArbolAVL2(elemento);
    if (raiz == null) {
      raiz = nuevo;
      raiz.altura = 0;
    } else {
      raiz = insertarAVL(nuevo, raiz);
    }
  }

  private NodoArbolAVL2 insertarAVL(NodoArbolAVL2 nuevo, NodoArbolAVL2 subArbol) {
    if (subArbol == null) {
      nuevo.altura = 0;
      return nuevo;
    }

    if (nuevo.dato < subArbol.dato) {
      subArbol.hIzquierdo = insertarAVL(nuevo, subArbol.hIzquierdo);
    } else if (nuevo.dato > subArbol.dato) {
      subArbol.hDerecho = insertarAVL(nuevo, subArbol.hDerecho);
    } else {
      System.out.println("Nodo duplicado");
      return subArbol;
    }

    subArbol.altura = Math.max(obtenerAltura(subArbol.hIzquierdo), obtenerAltura(subArbol.hDerecho)) + 1;

    int fe = obtenerFE(subArbol);

    // Rotación simple a la izquierda (RR - ahora con FE positivo)
    if (fe > 1 && nuevo.dato > subArbol.hDerecho.dato) {
      return rotacionSimpleALaIzquierda(subArbol);
    }

    // Rotación doble a la derecha (RL - ahora con FE positivo)
    if (fe > 1 && nuevo.dato < subArbol.hDerecho.dato) {
      subArbol.hDerecho = rotacionSimpleALaDerecha(subArbol.hDerecho);
      return rotacionSimpleALaIzquierda(subArbol);
    }

    // Rotación simple a la derecha (LL - ahora con FE negativo)
    if (fe < -1 && nuevo.dato < subArbol.hIzquierdo.dato) {
      return rotacionSimpleALaDerecha(subArbol);
    }

    // Rotación doble a la izquierda (LR - ahora con FE negativo)
    if (fe < -1 && nuevo.dato > subArbol.hIzquierdo.dato) {
      subArbol.hIzquierdo = rotacionSimpleALaIzquierda(subArbol.hIzquierdo);
      return rotacionSimpleALaDerecha(subArbol);
    }

    return subArbol;
  }

  public void inOrden(NodoArbolAVL2 r) {
    if (r != null) {
      inOrden(r.hIzquierdo);
      System.out.println("--" + r.toString() + " (FE: " + obtenerFE(r) + ", Altura: " + obtenerAltura(r) + ")--");
      inOrden(r.hDerecho);
    }
  }

  public void preOrden(NodoArbolAVL2 r) {
    if (r != null) {
      System.out.println("--" + r.toString() + " (FE: " + obtenerFE(r) + ", Altura: " + obtenerAltura(r) + ")--");
      preOrden(r.hIzquierdo);
      preOrden(r.hDerecho);
    }
  }

  public void postOrden(NodoArbolAVL2 r) {
    if (r != null) {
      postOrden(r.hIzquierdo);
      postOrden(r.hDerecho);
      System.out.println("--" + r.toString() + " (FE: " + obtenerFE(r) + ", Altura: " + obtenerAltura(r) + ")--");
    }
  }
}

class NodoArbolAVL2 {
  int dato;
  int altura;
  NodoArbolAVL2 hIzquierdo;
  NodoArbolAVL2 hDerecho;

  public NodoArbolAVL2(int dato) {
    this.dato = dato;
    this.altura = 0; // Inicialmente la altura de un nuevo nodo es 0
    this.hIzquierdo = null;
    this.hDerecho = null;
  }

  @Override
  public String toString() {
    return "NodoArbolAVL2 [dato=" + dato + "]";
  }
}