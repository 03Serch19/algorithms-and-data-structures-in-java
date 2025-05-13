//arbol basado en la teoria, aunque el factor de equilibio o se almcena como tal, en la versio comentada abajo mas detalles
public class ArbolAVLBasadoEnTeoria {
  private NodoArbolAVL raiz;

  public ArbolAVLBasadoEnTeoria() {
    raiz = null;
  }

  public NodoArbolAVL buscar(int elemento, NodoArbolAVL subR) {
    NodoArbolAVL aux = subR;
    if (subR == null)
      return null;
    else if (elemento == aux.dato) {
      return subR;
    } else if (elemento > subR.dato) {
      return buscar(elemento, subR.hDerecho);
    } else {
      return buscar(elemento, subR.hIzquierdo);
    }
  }
  public int obtenerFE(NodoArbolAVL x) {
    if (x == null)
      return -1;
    else
      return x.fe;
  }

  public NodoArbolAVL getRaiz() {
    return raiz;
  }

  public NodoArbolAVL rotacionSimpleALaDerecha(NodoArbolAVL x) {
    NodoArbolAVL aux = x.hIzquierdo;
    x.hIzquierdo = aux.hDerecho;
    aux.hDerecho = x;
    x.fe = Math.max(obtenerFE(x.hIzquierdo), obtenerFE(x.hDerecho)) + 1;
    aux.fe = Math.max(obtenerFE(aux.hIzquierdo), obtenerFE(aux.hDerecho)) + 1;
    return aux;
  }

  public NodoArbolAVL rotacionSimpleALaIzquierda(NodoArbolAVL x) {
    NodoArbolAVL aux = x.hDerecho;
    x.hDerecho = aux.hIzquierdo;
    aux.hIzquierdo = x;
    x.fe = Math.max(obtenerFE(x.hIzquierdo), obtenerFE(x.hDerecho)) + 1;
    aux.fe = Math.max(obtenerFE(aux.hIzquierdo), obtenerFE(aux.hDerecho)) + 1;
    return aux;
  }

  // rotacion izquierda derecha
  public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL x) {
    NodoArbolAVL aux;
    x.hIzquierdo = rotacionSimpleALaIzquierda(x.hIzquierdo);
    aux = rotacionSimpleALaDerecha(x);
    return aux;
  }

  // rotacion derecha izquierda
  public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL x) {
    NodoArbolAVL aux;
    x.hDerecho = rotacionSimpleALaDerecha(x.hDerecho);
    aux = rotacionSimpleALaIzquierda(x);
    return aux;
  }

  public void insertar(int elemento) {
    NodoArbolAVL nuevo = new NodoArbolAVL(elemento);
    if (raiz == null)
      raiz = nuevo;
    else {
      raiz = insertarAVL(nuevo, raiz);
    }
  }

  public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArbol) {
    NodoArbolAVL nuevoPadre = subArbol;
    if (nuevo.dato < subArbol.dato) {
      if (subArbol.hIzquierdo == null) {
        subArbol.hIzquierdo = nuevo;  
      } else {
        subArbol.hIzquierdo = insertarAVL(nuevo, subArbol.hIzquierdo);
        if ((obtenerFE(subArbol.hIzquierdo) - obtenerFE(subArbol.hDerecho)) == 2) {
          if (nuevo.dato < subArbol.hIzquierdo.dato) {
            nuevoPadre = rotacionSimpleALaDerecha(subArbol);
          } else {
            nuevoPadre = rotacionDobleIzquierda(subArbol);
          }
        }
      }
    } else if (nuevo.dato > subArbol.dato) {
      if (subArbol.hDerecho == null) {
        subArbol.hDerecho = nuevo;
      } else {
        subArbol.hDerecho = insertarAVL(nuevo, subArbol.hDerecho);
        if ((obtenerFE(subArbol.hDerecho) - obtenerFE(subArbol.hIzquierdo)) == 2) {
          if (nuevo.dato > subArbol.hDerecho.dato) {
            nuevoPadre = rotacionSimpleALaIzquierda(subArbol);
          } else {
            nuevoPadre = rotacionDobleDerecha(subArbol);
          }
        }
      }
    } else {
      System.out.println("Nodo  duplicado");
    }

    if (subArbol.hDerecho == null && subArbol.hIzquierdo != null) {
      subArbol.fe = subArbol.hIzquierdo.fe + 1;
    } else if (subArbol.hIzquierdo == null && subArbol.hDerecho != null) {
      subArbol.fe = subArbol.hDerecho.fe + 1;
    } else {
      subArbol.fe = Math.max(obtenerFE(subArbol.hDerecho), obtenerFE(subArbol.hIzquierdo)) + 1;
    }
    return nuevoPadre;
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
  //falta imolementar eliminacion tanto aca como en arbolavl3
}



//codigo con comentarios
/*public class ArbolAVLBasadoEnTeoria {
  private NodoArbolAVL raiz;

  public ArbolAVLBasadoEnTeoria() {
    raiz = null;
  }

  public NodoArbolAVL buscar(int elemento, NodoArbolAVL subR) {
    NodoArbolAVL aux = subR;
    if (subR == null)
      return null;
    else if (elemento == aux.dato) {
      return subR;
    } else if (elemento > subR.dato) {
      return buscar(elemento, subR.hDerecho);
    } else {
      return buscar(elemento, subR.hIzquierdo);
    }
  }
//en realidad acxa no alamcenamos el factor de equilibrio en si, ya qyue bno manejafmoa valrores directo dse -1 0 1 2 ó -2, pero es una espcie de alura de nodos los cuales se van alamencenado y se evaluan dentro de la insercion en lla codnciion donde se coimprra que ds alturas su durecnia sea menor a 2
  public int obtenerFE(NodoArbolAVL x) {
    if (x == null)
      return -1;
    else
      return x.fe;
  }

  public NodoArbolAVL getRaiz() {
    return raiz;
  }

  public NodoArbolAVL rotacionSimpleALaDerecha(NodoArbolAVL x) {
    NodoArbolAVL aux = x.hIzquierdo;
    x.hIzquierdo = aux.hDerecho;
    aux.hDerecho = x;
    x.fe = Math.max(obtenerFE(x.hIzquierdo), obtenerFE(x.hDerecho)) + 1;
    aux.fe = Math.max(obtenerFE(aux.hIzquierdo), obtenerFE(aux.hDerecho)) + 1;
    return aux;
  }

  public NodoArbolAVL rotacionSimpleALaIzquierda(NodoArbolAVL x) {
    NodoArbolAVL aux = x.hDerecho;
    x.hDerecho = aux.hIzquierdo;
    aux.hIzquierdo = x;
    x.fe = Math.max(obtenerFE(x.hIzquierdo), obtenerFE(x.hDerecho)) + 1;
    aux.fe = Math.max(obtenerFE(aux.hIzquierdo), obtenerFE(aux.hDerecho)) + 1;
    return aux;
  }

  // rotacion izquierda derecha
  public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL x) {
    NodoArbolAVL aux;
    x.hIzquierdo = rotacionSimpleALaIzquierda(x.hIzquierdo);
    aux = rotacionSimpleALaDerecha(x);
    return aux;
  }

  // rotacion derecha izquierda
  public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL x) {
    NodoArbolAVL aux;
    x.hDerecho = rotacionSimpleALaDerecha(x.hDerecho);
    aux = rotacionSimpleALaIzquierda(x);
    return aux;
  }

  public void insertar(int elemento) {
    NodoArbolAVL nuevo = new NodoArbolAVL(elemento);
    if (raiz == null)
      raiz = nuevo;
    else {
      raiz = insertarAVL(nuevo, raiz);
    }
  }

  public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArbol) {
    NodoArbolAVL nuevoPadre = subArbol;
    if (nuevo.dato < subArbol.dato) {
      if (subArbol.hIzquierdo == null) {
        subArbol.hIzquierdo = nuevo;  //casos base donde se insertan
      } else {
        subArbol.hIzquierdo = insertarAVL(nuevo, subArbol.hIzquierdo);//luego de la recusrion se viene las comprobaciones para luego  de iunsetado ir balancenado en casod e desiquilibro ,  tomando en cuanta que  en  incluso enm  ñl insercion y en todo momento las alturas se actualizan siempre para estar  a dispocision de prostetriromente aca caacula el factor equilibrio de forma que siemrpe de  posisitivo elmvalor pero aplicando la teoria a travez de la validacion respecto al condicionall que haya entrao por tanto no ocupamos que sea 2 o -2.  con que sea 2 basta para saber que hacerr segun enm la condicion que cumnpla
        if ((obtenerFE(subArbol.hIzquierdo) - obtenerFE(subArbol.hDerecho)) == 2) {
          if (nuevo.dato < subArbol.hIzquierdo.dato) {//compara si el valor que  entro es tambien menor que a su padre, en otras palabrras que si el ddato se fue completamennte a la izquirda, de ser asi y cumplirse el igual 2 es porque ocupamos una rotacion a la izquierda
            nuevoPadre = rotacionSimpleALaDerecha(subArbol);
          } else {//ahorra si no se fue diretemetne al izquierda osea es mayor y por tano se fue a la drecha de su padre, y cunpliendo se el iguall 2 significa que nececitamos rotar a lamizquierrda prrimero para sobrecargaar a la izquierda completamente y aluego se hace la rotacion a la derecha, por tanot se hace usao de la rotcaion izquierrda derecha ta bien llamada rotacion doble izquierda,  all misma logica se apllixa abajo, sollo que en ese caso adapotamos al caso donde se vaya valores derechos
            nuevoPadre = rotacionDobleIzquierda(subArbol);
          }
        }
      }
    } else if (nuevo.dato > subArbol.dato) {
      if (subArbol.hDerecho == null) {
        subArbol.hDerecho = nuevo;
      } else {
        subArbol.hDerecho = insertarAVL(nuevo, subArbol.hDerecho);
        if ((obtenerFE(subArbol.hDerecho) - obtenerFE(subArbol.hIzquierdo)) == 2) {
          if (nuevo.dato > subArbol.hDerecho.dato) {
            nuevoPadre = rotacionSimpleALaIzquierda(subArbol);
          } else {
            nuevoPadre = rotacionDobleDerecha(subArbol);
          }
        }
      }
    } else {
      System.out.println("Nodo  duplicado");//esn esta ocasion  nop pemitimos nodos duplicados
    }

    // actualizando alturas, //aca pues solo entendemos esta logica entendamosla en ell caso inicial donde rrecien se lllenan los peimeos 2 nodos, ya de ahi esa logica es recursiva sucecivamente lo ccual al llegar a la ecudsiopn en donde se inserta pues sus balorpers en ese punto ondan el cero y uno, y asi aumentan sucecivametne en el rrretorno ,de forma que vaya balanceado y en el caso de que en una de las devueltas la condicion arrriba cumple un igual 2, pues ahi es donde se balaancea de nuevo
    if (subArbol.hDerecho == null && subArbol.hIzquierdo != null) {
      subArbol.fe = subArbol.hIzquierdo.fe + 1;
    } else if (subArbol.hIzquierdo == null && subArbol.hDerecho != null) {
      subArbol.fe = subArbol.hDerecho.fe + 1;
    } else {
      subArbol.fe = Math.max(obtenerFE(subArbol.hDerecho), obtenerFE(subArbol.hIzquierdo)) + 1;
    }
    return nuevoPadre;
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

}
*/