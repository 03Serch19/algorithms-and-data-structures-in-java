package com.ordenamiento.s;


//en un solo areglo
public class DesafioMezclarOrdenar2PrevioMergeSort {
    public static void main(String[] args) {
        int A[]={3,9,27,10,38,43,82};
        
        fusionarYOrdenar(A,0,3,6+1);
        for (int aa : A) {
            System.out.println(aa);
        }
    }
    private static void fusionarYOrdenar(int[] A,int iniMT1,int medio,int fin) {
        int []aux=new int[fin-iniMT1];
         int indiIniMt1=iniMT1,indiIniMt2=medio, indiPosicion=0;
         while(indiIniMt1<medio && indiIniMt2<fin){
         if(A[indiIniMt1]<A[indiIniMt2]){
              aux[indiPosicion++]=A[indiIniMt1++];
          }else{
              aux[indiPosicion++]=A[indiIniMt2++];
          }
         }
         while(indiIniMt1<medio){
             aux[indiPosicion++]=A[indiIniMt1++];
         }
           while(indiIniMt2<fin){
             aux[indiPosicion++]=A[indiIniMt2++];
         }      
      System.arraycopy(aux, 0, A, iniMT1, indiPosicion);
    }  
   /* private static void fusionarYOrdenar(int[] A,int iniMT1,int medio,int fin) {
        int []aux=new int[fin-iniMT1];
         int indiIniMt1=iniMT1,indiIniMt2=medio, indiPosicion=0;
         while(indiIniMt1<medio && indiIniMt2<fin){
         if(A[indiIniMt1]<A[indiIniMt2]){
              aux[indiPosicion++]=A[indiIniMt1++];
          }else{
              aux[indiPosicion++]=A[indiIniMt2++];
          }
         }
         while(indiIniMt1<medio){
             aux[indiPosicion++]=A[indiIniMt1++];
         }
           while(indiIniMt2<fin){
             aux[indiPosicion++]=A[indiIniMt2++];
         }
        
      //  System.arraycopy(aux, iniMT1, A, iniMT1, fin);//noi debemos usar fiun, ya que fin no indica en si el tamaño del areglo, solo es el indice exclusivo el cual marca el limite superior de esta pprocion del arreglo, osea merjo dichoel limite superior de la mitad de la dercha del areglo
      System.arraycopy(aux, 0, A, iniMT1, indiPosicion); //osea en este caso si indica el tamño del areglo y no daria error porque es un solo envio del areglo la cantiudad de elemntos fusionadososea lo que se agrego a aux es equivalente al valor de fin
    } */                 //Y aca igual debe ser 0 , ya que aux empeiza desde cero, y iniMt1 solo indica desde que posicion inicia la fuson en el areglo original                               //peroi ya en contextos dinamicops estos valores no siempre coincidiran ya que fin en un contexto de merge recrusivo dsolo ira dinciado los ,imtes superiores, mas no sera el tamaño de los elemtnos l rango del array a fusionar
}                        //y al igual, que pasa con fin el en est caso coincide 0 coincide con el valor de inicio de la fusion en nel array, pero pues no es asi siemrpe para ya en merge , ya qiue son valores que cambniab y puede llevarnos a errores, asi que mejor cero ya que el aux siempre empezara desde cero
//en 2 areglos
/*public class PPMergeSortMezclaPeroConArrNumericos {
    public static void main(String[] args) {
        int A[]={3,9,27};
        int []B={10,38,43,82};
        
        int []C=combinarArreglosOrdenados(A,B);
        for (int cc : C) {
            System.out.println(cc);
        }
    }

    private static int[] combinarArreglosOrdenados(int[] A, int[] B) {
        int []aux=new int[A.length+B.length];
         int indiIniArr1=0,indiIniArr2=0, indiPosicion=0;
         while(indiIniArr1<A.length && indiIniArr2<B.length){
         if(A[indiIniArr1]<B[indiIniArr2]){
              aux[indiPosicion++]=A[indiIniArr1++];
          }else{
              aux[indiPosicion++]=B[indiIniArr2++];
          }
         }
         while(indiIniArr1<A.length){
             aux[indiPosicion++]=A[indiIniArr1++];
         }
           while(indiIniArr2<B.length){
             aux[indiPosicion++]=B[indiIniArr2++];
         }
          return aux;
        
    }
}*/
