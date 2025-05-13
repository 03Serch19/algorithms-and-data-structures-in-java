public class ArbolBinarioBusqueda {
  NodoArbol raiz;

  public ArbolBinarioBusqueda() {
    raiz = null;
  }

  // metodo parra inserrtar un nodo en el arbol//fornma by me con
  // recursion///////////////////////////// v1
  /*public void insertarByMe(int dato, String nombre) {
    NodoArbol nuevo = new NodoArbol(dato, nombre);
    if (raiz == null) {
      raiz = nuevo;
    } else {
      NodoArbol subRaiz = raiz;
      insertarByMe(nuevo, subRaiz, null);
    }
  }

  private void insertarByMe(NodoArbol nNodo, NodoArbol subRaiz, NodoArbol padre) {
    if (subRaiz == null) {
      if (nNodo.dato >= padre.dato) {
        padre.hDerecho = nNodo;
      } else {
        padre.hIzquierdo = nNodo;
      }
      System.out.println("Nodo insertado: " + nNodo.toString());
    } else if (nNodo.dato >= subRaiz.dato) {
      padre = subRaiz;
      insertarByMe(nNodo, subRaiz.hDerecho, padre);
    } else {
      padre = subRaiz;
      insertarByMe(nNodo, subRaiz.hIzquierdo, padre);
    }
  }*/
//v2
public void insertarByMe(int dato, String nombre) {
  NodoArbol nuevo = new NodoArbol(dato, nombre);
  if (raiz == null) {
    raiz = nuevo;
  } else {
    NodoArbol subRaiz = raiz;
    insertarByMe(nuevo, subRaiz);
  }
}

private void insertarByMe(NodoArbol nNodo, NodoArbol subRaiz) {
  if (nNodo.dato >= subRaiz.dato) {
    if (subRaiz.hDerecho == null){
      subRaiz.hDerecho=nNodo;
      System.out.println("Nodo insertado: " + nNodo.toString());
    }else
    insertarByMe(nNodo, subRaiz.hDerecho);
  } else {
    if (subRaiz.hIzquierdo == null){
      subRaiz.hIzquierdo=nNodo;
      System.out.println("Nodo insertado: " + nNodo.toString());
    }else
    insertarByMe(nNodo, subRaiz.hIzquierdo);
  }
}



  // forma basandome en un video pero con iterratividad pero by me//////////////////////////////////
   //descartada ya que enlazar al padre pues me llevvrrar a la forma estanndarr iterrraitvca, asdemas que esto de cierta fomra es una especie de rrecursion coniteratividad y para que funcione debo hacer rlo miusmo que en crecursividad pero en este caso esto podria complicar m,as la claridad del coidgo y a lo que probalemebrte ñllegue porr la naturraleza de la itertaivdad seria a ñla forrma estandar que esta abajo, por tanto esto lo descarrtaremos, solo fue posible corregirlo y dejarlo de manerha natural recursivo con la fomrra de arriba
  /*public void insertarIByme(int dato, String nombre) {
    NodoArbol nuevo = new NodoArbol(dato, nombre);
    if (raiz == null) {
      raiz = nuevo;
    } else {
      NodoArbol subRaiz = raiz;
      while (subRaiz != null) {
        if (subRaiz.dato <= dato) {
          subRaiz = subRaiz.hDerecho;
        } else {
          subRaiz = subRaiz.hIzquierdo;
        }
      }
      subRaiz = nuevo;
      System.out.println("Nodo insertado: " + subRaiz.toString());
    }
  }*/

  // forma que usa un video y es la forma
  // estandar//////////////////////////////////////////////////
  public void insertarVI(int dato, String nombre) {
    NodoArbol nuevo = new NodoArbol(dato, nombre);
    if (raiz == null) {
      raiz = nuevo;
    } else {
      NodoArbol subRaiz = raiz;
      NodoArbol padre;
      while (true) {
        padre = subRaiz;
        if (subRaiz.dato <= dato) {
          subRaiz = subRaiz.hDerecho;
          if (subRaiz == null) {
            padre.hDerecho = nuevo;
            return;
          }
        } else {
          subRaiz = subRaiz.hIzquierdo;
          if (subRaiz == null) {
            padre.hIzquierdo = nuevo;
            return;
          }
        }
      }
    }
  }

  // metodo para saber cuando el arbol esta vacio
  public boolean estaVacio() {
    return raiz == null;
  }

  /*
   * public void inOrden(){
   * inOrden(raiz);
   * }
   */
  // metodo para recorrer el arbol InOrden
  public void inOrden(NodoArbol r) {
    if (r != null) {
      inOrden(r.hIzquierdo);
      System.out.println("--" + r.toString() + "--");
      inOrden(r.hDerecho);
    }
  }

  // metodo para recorrer el arbol PreOrden
  public void preOrden(NodoArbol r) {
    if (r != null) {
      System.out.println("--" + r.toString() + "--");
      preOrden(r.hIzquierdo);
      preOrden(r.hDerecho);
    }
  }

  // metodo para recorrer el arbol PostOrden
  public void postOrden(NodoArbol r) {
    if (r != null) {
      postOrden(r.hIzquierdo);
      postOrden(r.hDerecho);
      System.out.println("--" + r.toString() + "--");
    }
  }

  public NodoArbol buscar(int dato) {
    NodoArbol aux = raiz;
    while (aux.dato != dato) {
      if (dato >= aux.dato)
        aux = aux.hDerecho;
      else
        aux = aux.hIzquierdo;

      if (aux == null)
        return null;
    }
    return aux;
  }

  public boolean eliminar(int dato) {
    NodoArbol aux = raiz;
    NodoArbol padre = raiz;
    boolean esHIzquierdo = false;

    while (aux.dato != dato) {
      padre = aux;
      if (dato >= aux.dato) {
        esHIzquierdo = false;
        aux = aux.hDerecho;
      } else {
        esHIzquierdo = true;
        aux = aux.hIzquierdo;
      }
      if (aux == null)
        return false;
    } // fin while

    if (aux.hDerecho == null && aux.hIzquierdo == null) {
      if (padre == aux) {
        raiz = null;
      } else if (esHIzquierdo) {
        padre.hIzquierdo = null;
      } else {
        padre.hDerecho = null;
      }
    } else if (aux.hDerecho == null) {
      if (raiz == aux) {
        raiz = raiz.hIzquierdo;
      } else if (esHIzquierdo) {
        padre.hIzquierdo = aux.hIzquierdo;
      } else {
        padre.hDerecho = aux.hIzquierdo;
      }
    } else if (aux.hIzquierdo == null) {
      if (raiz == aux) {
        raiz = raiz.hDerecho;
      } else if (esHIzquierdo) {
        padre.hIzquierdo = aux.hDerecho;
      } else {
        padre.hDerecho = aux.hDerecho;
      }
    } else {
     NodoArbol reemplazo=obtenerNodoReemplazo(aux);
     if (raiz == aux) {
      raiz = reemplazo;
    } else if (esHIzquierdo) {
      padre.hIzquierdo = reemplazo;
    } else {
      padre.hDerecho = reemplazo;
    }
    reemplazo.hIzquierdo=aux.hIzquierdo;
    }
  return true;
  }
   //usamos estrategiia sucesor inorden, la otra forma es con predecesos inorden, solo cambaimos el reemplazo de eliiminar reemplazo.hIzquierdo=aux.hIzquierdo;, a por su respectvo sergun al logca a por derecho y de la misma forma en obtener reempazlo iinntercambiasnmo logiica del iif fiinal segun la logiica respectiiiva con iizquierdo
  private NodoArbol obtenerNodoReemplazo(NodoArbol nodoR) {
   NodoArbol reemplazarPadre=nodoR;
   NodoArbol reemplazo=nodoR;
   NodoArbol aux=nodoR.hDerecho;
   while (aux!=null) {
    reemplazarPadre=reemplazo;
    reemplazo=aux;
    aux=aux.hIzquierdo;
   }
   if(reemplazo!=nodoR.hDerecho){
     reemplazarPadre.hIzquierdo=reemplazo.hDerecho;
     reemplazo.hDerecho=nodoR.hDerecho;//dentro del if, cuando el reeeplazo es un hijo diiirecto por tatno el while solo se eejecuta una vez , ya no es necesaro hacer esta liinea ya que ya lo debvuelve inteerconectado en el lado derecho, y sii se hace esto podsriiamos genneerar problemas de asignar un hijo derecho iinncecsario y repetido en el mismo reemmplazo
   }
System.out.println("El nodo reemplazo es "+reemplazo.toString());
   return reemplazo;
  }

}
