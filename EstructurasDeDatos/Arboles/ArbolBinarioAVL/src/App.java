public class App {
  public static void main(String[] args) throws Exception {
    ArbolAVLBasadoEnTeoria arbol = new ArbolAVLBasadoEnTeoria();
    // ArbolAVL arbol=new ArbolAVL();
    // ArboAVL3 arbol=new ArboAVL3();
    arbol.insertar(10);
    arbol.insertar(5);
    arbol.insertar(13);
    arbol.insertar(1);
    arbol.insertar(6);
    arbol.insertar(17);
    arbol.insertar(16);
    /*
     * arbol.insertar(15);
     * arbol.insertar(94);
     * arbol.insertar(9);
     * arbol.insertar(174);
     */
    arbol.preOrden(arbol.getRaiz());
    System.out.println("ffffffffffffffffff");
    arbol.inOrden(arbol.getRaiz());
  }
}
