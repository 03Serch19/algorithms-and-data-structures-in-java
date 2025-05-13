import java.util.Arrays;

public class TablaHash {
  String[] arreglo;
  int tamanio;
  int contador;

  public TablaHash(int tam) {
    tamanio = tam;
    arreglo = new String[tam];
    Arrays.fill(arreglo, "-1");
  }
 public void funcionHash(String []cadenaArreglo,String[] arregloHash){
  for (int i = 0; i < arregloHash.length; i++) {
    String elemento=cadenaArreglo[i];
    int indiceArreglo=Integer.parseInt(elemento)%(tamanio-1);
    System.out.println("El indice es "+indiceArreglo+" Para el elemento "+elemento);
   //en mi vetrsion las colisiones las tratamos con sondeo lineal, que es algo basico
   //tratando las colisiones
    while(/*contador!=tamanio&&*/arregloHash[indiceArreglo]!="-1"){
     indiceArreglo++;
    // contador=indiceArreglo; //no hace falta vbalidar esto para desbordes, ya que la asigancion de modulo de abajpo se encarga
    System.out.println("Ocurrio una colision en el indice "+(indiceArreglo-1)+" Cambiar a indice "+indiceArreglo);
    indiceArreglo%=tamanio;//esto en cada vuelta mientra aun nopsea igual al tamaño esto sera el mismo valr incrementado pero al indice areglo ser igual al valor de tamaño que es donde ocurriria el desbordamiento en la otra iteracion, es ahi donde al ser iguales el valor dla division es exactop portanto el indicearr sera cero y ya no sera el valor de tamaño,. por ende se ciclara hasta qeu encuentra el espacio dispobnible el cual por la logica implemntadad obviemente debe de esxistir y asi es como se asigna 
    }
    arregloHash[indiceArreglo]=elemento;
  }
 }
//metodo para buscar claves
 public String buscarClave(String elemento){
  contador=0;
  int indi=Integer.parseInt(elemento)%(tamanio-1);
  while(arreglo[indi]!="-1"){
   if(elemento==arreglo[indi]){
    System.out.println("\nEl elemento "+elemento+" fue encontrado en el indice "+indi);
    return arreglo[indi];
  }
   indi++;
   indi%=tamanio;
   contador++; 
   if(contador==tamanio)break;
   //en un video lo iuceorn como if(contador>7)break;
  }
    return null;
 }



//Metodo para mostrar la tabla
public void mostrar() {
  int incremento=0,i,j;
  for(i=0;i<1;i++) {
    incremento+=8;
    for(j=0;j<71;j++) {
      System.out.print("-");
    }
  System.out.println();
  for(j=incremento -8;j<incremento;j++) {
  System.out.format("|%3s"+"",j);	
  }
  System.out.println("|");
  for(int n=0;n<71;n++) {
  System.out.print("-");	
  }
  System.out.println();
  for(j=incremento -8;j<incremento;j++) {
    if(arreglo[j].equals("-1")) {
      System.out.print("|");
      }else {
        System.out.print(String.format("|%3s"+"", arreglo[j]));
      }
    }
  System.out.println("|");
  for(j=0;j<71;j++) {
    System.out.print("-");
  }
    }
  }
}
