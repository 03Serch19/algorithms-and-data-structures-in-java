public class App {//ya hay una implentacion ej java para esto la calse HashTable, pero pues tieneun enfoque mas a la concurrencia y ademas hereda de Dictionary eque es una clase obsoleta , por ello mejor usar hashmap y para manejar la concurrecnia concurrenthashmap o alfgo asi se llama la clase
    public static void main(String[] args) throws Exception {
        TablaHash tablaHash=new TablaHash(8);
        //String[] elementos={"20","33","21","10","12","14","56","100"};
       String[] elementos={"20","33","21","10","12","14","56","13"};
        tablaHash.funcionHash(elementos, tablaHash.arreglo);
        tablaHash.mostrar();

      //  tablaHash.buscarClave("10");
      String buscado=tablaHash.buscarClave("13");//aca pues asginadmos el resultado a buscado, en el de arriba anda mas ejecutamos la funcion si asignar el retorno a nada
      if(buscado==null)  System.out.println("\nEl elemento no se encuentra en el arreglo");
    }
}
