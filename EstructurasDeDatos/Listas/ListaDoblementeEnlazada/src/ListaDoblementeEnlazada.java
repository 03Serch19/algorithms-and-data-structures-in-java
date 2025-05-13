public class ListaDoblementeEnlazada {
 private NodoDoble inicio, fin;

 public ListaDoblementeEnlazada() {
  inicio=fin=null;
 }
  // metodo para saber cuando la lista esta vacia;
  public boolean estaVacia(){
    return inicio==null;
  }
  //metodos  para agregar nodos al final
  public void agregarAlFinal(int dato){
    if (estaVacia()) {
      inicio=fin=new NodoDoble(dato);
    }else{
    fin.siguiente=new NodoDoble(dato,null,fin);
    fin=fin.siguiente;
    /*fin=new NodoDoble(dato,null,fin);
    fin.anterior.siguiente=fin;*///la forma prpuesta por el video
  }
  }
    //metodos  para agregar nodos al inicio
    public void agregarAlInicio(int dato){
      if (estaVacia()) {
        inicio=fin=new NodoDoble(dato);
      }else{
      inicio.anterior=new NodoDoble(dato,inicio,null);
       inicio=inicio.anterior;
      /*inicio=new NodoDoble(dato,inicio,null);
       inicio.siguiente.anterior=inicio;*///la forma prpuesta por el video
    }
    }
    //metodo para mostrar lista de inicio a fin
    public void mostrarListaInicioFin(){
      NodoDoble recorrer = inicio;
      System.out.println("Mostrando datos de inicio a fin");
      while(recorrer!=null){
      System.out.print(recorrer.dato+"----->");
      recorrer=recorrer.siguiente;
      }
        System.out.println();
    }

       //metodo para mostrar lista de fin a  inicio
       public void mostrarListaFinInicio(){
        NodoDoble recorrer = fin;
        System.out.println("Mostrando datos  de fin a inicio");
        while(recorrer!=null){
        System.out.print(recorrer.dato+"----->");
        recorrer=recorrer.anterior;
        }
          System.out.println();
      }

        //metodo para eliminar un nodo del inicio
  public NodoDoble eliminarNodoInicio(){
    NodoDoble nodoEliminar= inicio;
   if(inicio==fin)fin=inicio=null;
    else{ 
    inicio=inicio.siguiente;
    inicio.anterior=null;
    }
    return nodoEliminar;
  }

    //metodo para eliminar un nodo del final
    public NodoDoble eliminarNodoFinal(){
      NodoDoble nodoEliminar= fin;
     if(inicio==fin)inicio=fin=null;
     else{
        fin=fin.anterior;
        fin.siguiente=null;
      }
      return nodoEliminar;
    }

    public boolean buscarElementoEnLista(int elemento){
      NodoDoble recorrer = inicio;
      while(recorrer!=null && recorrer.dato!=elemento){
      recorrer=recorrer.siguiente;
      }
       return (recorrer!=null);
     }

     public NodoDoble eliminarNodo(int elemento){
      NodoDoble nodoEliminar=null;
      if(elemento==inicio.dato &&fin==inicio){
       nodoEliminar=inicio;
       inicio=fin=null;
      }else if(elemento==inicio.dato){
        nodoEliminar=inicio;
        inicio=inicio.siguiente;
        inicio.anterior=null;
      }else{
        NodoDoble temporal;
        temporal=inicio;
         while (temporal!=null && temporal.dato!=elemento) {  
           temporal=temporal.siguiente;
         }
         if(temporal!=null){
          nodoEliminar=temporal;
          temporal.anterior.siguiente=temporal.siguiente;
          if(temporal==fin)fin=fin.anterior;
          else temporal.siguiente.anterior=temporal.anterior;
         }
      }
      return nodoEliminar;
    }

}
