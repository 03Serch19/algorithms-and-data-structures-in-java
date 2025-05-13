package com.recursividad;

public class RecursInversorFrase {
      public static void main(String[] args) {
        String frase;
        String palabraInvertida;
       frase="euclides";
       palabraInvertida=inversorFrase(frase);
          System.out.println(palabraInvertida);
            frase="e";
       palabraInvertida=inversorFrase(frase);
          System.out.println(palabraInvertida);
            frase="eu";
       palabraInvertida=inversorFrase(frase);
          System.out.println(palabraInvertida);
          //System.out.println(frase.substring(1));
      }
     /*public static String inversorFrase(String frase){
     //   if(frase.length()==0){//se puede pero naaa
       //  return "";
           if(frase.length()==1){
          return String.valueOf(frase.charAt(0));
         }
        // return frase.charAt(0)+inversorFrase(frase.substring(1));//asi no, ya que el retorno pues no estaria siendo util ya que eess rstonrando la letra antes que la anteriro por lo tanto no es mass que rearmmando la frase original
          return inversorFrase(frase.substring(1))+frase.charAt(0);//ahoiransum, recirdadnbi qyue todo retorno debe completarse, pues al retronar el caso bvase ahora opuede completar el otro mas retronadno el primer elemento del valor qeu tenia la frase en esa llamada y asi de forma recursdiva hgastaretornar por completo
         }*/
          public static String inversorFrase(String frase){
              char[] fra=frase.toCharArray();
              return inversorFrase(fra,0,frase.length()-1);
              
         }
         public static String inversorFrase(char[] frase,int ini,int fin){
               if(ini>=fin)return new String(frase);
               char tempIni= frase[ini];
               frase[ini]=frase[fin];
               frase[fin]=tempIni;
             
               return inversorFrase(frase,ini+1,fin-1);
         }
 }
