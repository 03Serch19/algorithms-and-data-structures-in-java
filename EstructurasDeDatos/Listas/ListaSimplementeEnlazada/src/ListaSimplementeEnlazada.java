public class ListaSimplementeEnlazada {
  protected Nodo inicio, fin;

  public ListaSimplementeEnlazada() {
    inicio = null;
    fin = null;
  }


//metodo para saber si la lista esta vacia
public boolean estaVacia(){
  return inicio==null;
}
//metodo para agregar al final
public void agregarAlFinal(int dato){
  //Creando al nodo
  if(estaVacia()){
    //agregarAlInicio(dato);
   Nodo nuevoNodo = new Nodo(dato);
   inicio=fin=nuevoNodo;
  }else{
  Nodo nuevoNodo = new Nodo(dato);
   fin.siguiente=nuevoNodo;
   fin=fin.siguiente;
  } 
}

  //metodo para agregar un nodo al inicio de la lista
  public void agregarAlInicio(int dato){
   //Creando al nodo
   Nodo nuevoNodo = new Nodo(dato,inicio);
   inicio=nuevoNodo;
    if (fin==null) {
      fin=inicio;
    }
  }

  //metodo para eliminar un nodo del inicio
  public Nodo eliminarNodoInicio(){
    //if(estaVacia())return null;
    Nodo nodoEliminar= inicio;
   if(inicio==fin)fin=null;
    inicio=inicio.siguiente;

    return nodoEliminar;
  }

    //metodo para eliminar un nodo del final
    public Nodo eliminarNodoFinal(){
      Nodo nodoEliminar= fin;
     if(inicio==fin)inicio=fin=null;//esto es una sola linea de codigo, por tanto pued eir sin llaves
     else{
      Nodo recorrer = inicio;
      while(recorrer.siguiente!=fin){
        recorrer=recorrer.siguiente;
        }
        fin=recorrer;
        fin.siguiente=null;
      }
      return nodoEliminar;
    }
  //metodo para eliminar un nodo en especifico//una forma by me
  /*public Nodo eliminarNodo(int elemento){
    Nodo nodoEliminar=null;
    Nodo recorrido = inicio;
    while(recorrido!=null){
      if(recorrido.dato==elemento){
        nodoEliminar=recorrido;
        recorrido=inicio;
        if (recorrido.siguiente==null) {
          inicio=fin=null;
          return nodoEliminar;
        }else{
          if (recorrido==nodoEliminar) {
            inicio=inicio.siguiente;
            return nodoEliminar;
          }
        while (recorrido.siguiente!=nodoEliminar) {
          recorrido=recorrido.siguiente;
        }
        recorrido.siguiente=recorrido.siguiente.siguiente;
        return nodoEliminar;
        }
     }else recorrido=recorrido.siguiente;
    }
    return nodoEliminar;
  }*/

  public Nodo eliminarNodo(int elemento){
    Nodo nodoEliminar=null;
    if(elemento==inicio.dato &&fin==inicio){
     nodoEliminar=inicio;
     inicio=fin=null;
    }else if(elemento==inicio.dato){
      nodoEliminar=inicio;
      inicio=inicio.siguiente;
    }else{
      Nodo anterior,temporal;
      anterior=inicio;
      temporal=inicio.siguiente;
       while (temporal!=null && temporal.dato!=elemento) {
         anterior=temporal;
         //anterior=anterior.siguiente;
         temporal=temporal.siguiente;
       }
       if(temporal!=null){
        nodoEliminar=temporal;
        anterior.siguiente=temporal.siguiente;
        if(temporal==fin)fin=anterior;
       }
    }
    return nodoEliminar;
  }
 //metodo para buscar un  elemento
 public boolean buscarElementoEnLista(int elemento){
  Nodo recorrer = inicio;
  while(recorrer!=null && recorrer.dato!=elemento){
  recorrer=recorrer.siguiente;
  }
   return (recorrer!=null);
 }

  //metodo para mostrar los datos
  public void mostrarLista(){
    Nodo recorrer = inicio;
    System.out.println("Mostrando datos");
    while(recorrer!=null){
    System.out.print(recorrer.dato+"----->");
    recorrer=recorrer.siguiente;
    }
      System.out.println();
  }
}