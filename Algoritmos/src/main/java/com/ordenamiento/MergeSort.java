package com.ordenamiento.s;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    
    public static void main(String[] args) {
              int[] m6={2,3};
         int[] m7={5};
      int[] m3 = {20,180 ,15,15, 8,2, 30, 26, 42,1, 1, 50};
     // int[] m3 = {3,3,5,7,9,11,23,36,65,67,68,68,69,78,79,85,86,91,96,96};
      
       /* for (int i : m3) {
            System.out.println(i);
        }
        System.out.println("*********************************************");
        mergeSort(m3);
          for (int i : m3) {
            System.out.println(i);
        }*/
    /*System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(m3));
     mergeSort(m3);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(m3));*/
       
//en lugar de usar for, mejor uso Arrays.toString(...);
    int[] arr = {92, 3, 45, 18, 29, 12, 77, 5, 66, 23, 
                 88, 1, 95, 34, 50, 41, 13, 99, 7, 56,
                 72, 14, 81, 37, 60, 19, 27, 9, 48, 31,
                 85, 4, 68, 20, 90, 11, 53, 25, 64, 39,
                 96, 8, 42, 30, 74, 17, 97, 6, 52, 21,92, 3, 45, 18, 29, 12, 77, 5, 66, 23, 
                 88, 1, 95, 34, 50, 41, 13, 99, 7, 56,
                 72, 14, 81, 37, 60, 19, 27, 9, 48, 31,
                 85, 4, 68, 20, 90, 11, 53, 25, 64, 39,
                 96, 8, 42, 30, 74, 17, 97, 6, 52, 21,92, 3, 45, 18, 29, 12, 77, 5, 66, 23, 
                 88, 1, 95, 34, 50, 41, 13, 99, 7, 56,
                 72, 14, 81, 37, 60, 19, 27, 9, 48, 31,
                 85, 4, 68, 20, 90, 11, 53, 25, 64, 39,
                 96, 8, 42, 30, 74, 17, 97, 6, 52, 21};

    /*System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(arr));

    mergeSort(arr);

    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(arr));*/
    
    
   /* long startTime = System.nanoTime();
    mergeSort(arr);
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");*/


   int[] orderedArray = new int[5000];
        for (int i = 0; i < 5000; i++) {
            orderedArray[i] = i;
        }
        int[] unorderedArray = new int[9000];
        for (int i = 0; i < 9000; i++) {
            unorderedArray[i] = new Random().nextInt(5000); // Números aleatorios entre 0 y 999
        }
     long startTime = System.nanoTime();
     mergeSort(orderedArray); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
  
          
          
          
      //si es tsolo esto es para nada mas probar la division del array
       // mergeSort(m3);
      //esto es solo para probar la parte de merge
        /*  int A[]={3,9,27,10,38,43,82};
        
        merge(A,0,3,6+1);
        for (int aa : A) {
            System.out.println(aa);
        }*/
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
  
   //Version lograda, estandar natural recursiva

    public static void mergeSort(int[] arr) {  
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int inicio,int fin) {
        if(inicio==fin)return;
        
        int medio=(inicio+fin)/2;        
        mergeSort(arr, inicio, medio);  
        mergeSort(arr,medio+1, fin);
                
        merge(arr, inicio, medio, fin);
    }
      public static void merge(int arr[], int inicio,int medio, int fin){
        int []aux=new int[(fin+1)-inicio];
        int iniM1=inicio, iniM2=medio+1, posicionAsignar=0;   
        while (iniM1<=medio && iniM2<=fin) {            
            aux[posicionAsignar++]=(arr[iniM1]<arr[iniM2])?arr[iniM1++]:arr[iniM2++];
        }
        while (iniM1<=medio)aux[posicionAsignar++]=arr[iniM1++];
        
        while (iniM2<=fin) aux[posicionAsignar++]=arr[iniM2++];
       
        System.arraycopy(aux, 0, arr, inicio, posicionAsignar);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
/*public static void mergeSort(int[] arr) {  //ya aregladop, aqu solo mqeu de cierta foram manejoamos limtes expñloicitops, lo mejorameos una ultima a vez dejando los indices sin modificar  y solo modificaremos las condicones para que sean incluyentes asi no tener que westar modificadndomlos valores de indice que le enviamos a merge y de opaso camniaremos nombre a las vraibles a dejaralas con nombbre inicio medio y fin asi dejamos mas claro que los valores sefguiran siendo los ismo indices que enviamoscomoa argumentos
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int inic,int fin) {
        if(inic==fin){
            return;
        }
        int medio=(inic+fin)/2;        
        mergeSort(arr, inic, medio);  
        mergeSort(arr,medio+1, fin);
                
        merge(arr, inic, medio, fin);
    }
    
    public static void merge(int arr[], int limiInfe,int limiFm1YLIniM2, int limSupe){
       limSupe+=1;
       limiFm1YLIniM2+=1;
        int []aux=new int[limSupe-limiInfe];
        int iniM1=limiInfe, iniM2=limiFm1YLIniM2, posicionAsignar=0;   
        while (iniM1<limiFm1YLIniM2 && iniM2<limSupe) {            
            aux[posicionAsignar++]=(arr[iniM1]<arr[iniM2])?arr[iniM1++]:arr[iniM2++];
        }
        while (iniM1<limiFm1YLIniM2)aux[posicionAsignar++]=arr[iniM1++];
        
        while (iniM2<limSupe) aux[posicionAsignar++]=arr[iniM2++];
       
        System.arraycopy(aux, 0, arr, limiInfe, posicionAsignar);
    }
    */
    
    
    
    //mi primera version de mergersort que funciona y acerte, ahora solo falta un pequeño par de ajustes solo para mayor calirad cmomo lo de manejo de ,limites lo cual mejor hacerlo en merge yasi mandar los datos sin modoicfacrlos desde meerge sort, osea nb9o mandar medio +1 cuadno se manda a llamr merge, sino que ese medio +1 manejarlo internamente emn merge
    /*public static void mergeSort(int[] arr) {  
        mergeSort(arr,0,arr.length-1);
    }

  
    public static void mergeSort(int[] arr,int inic,int fin) {
        if(inic==fin){
           // System.out.println(arr[inic]);
            return;
        }
        int medio=(inic+fin)/2;        
        mergeSort(arr, inic, medio);  
        mergeSort(arr,medio+1, fin);
                
        merge(arr, inic, medio+1, fin+1);
    }
    
    public static void merge(int arr[], int limiInfe,int limiFm1YLIniM2, int limSupe){
        int []aux=new int[limSupe-limiInfe];
        int iniM1=limiInfe, iniM2=limiFm1YLIniM2, posicionAsignar=0;   
        while (iniM1<limiFm1YLIniM2 && iniM2<limSupe) {            
            aux[posicionAsignar++]=(arr[iniM1]<arr[iniM2])?arr[iniM1++]:arr[iniM2++];
        }
        while (iniM1<limiFm1YLIniM2)aux[posicionAsignar++]=arr[iniM1++];
        
        while (iniM2<limSupe) aux[posicionAsignar++]=arr[iniM2++];
       
        System.arraycopy(aux, 0, arr, limiInfe, posicionAsignar);
    }*/
    
    
    
    
    
    
    
    
    
    




    
   /* public static void mergeSort(int[] arr,int inic, int fina) {
          int medio=fina/2;
          for (int i = inic; i < fina; i++) {
            if(arr[inic]>arr[medio]){
                int temp=arr[inic];
                arr[inic]=arr[medio];
                arr[medio]=temp;
                if(arr[inic+1]>arr[medio]){
                    arr[medio
                            
                }
            }else{
                // int temp=arr[inic];
              //   arr[inic]=arr[medio];
                 //arr[medio]=temp;
                 medio++;
            }
            
            
        }
    }*/
        /*public static void mergeSort(int[] arr,int inic, int fina) {
          int medio=fina/2;
          
             if(arr[inic]>arr[medio]){
                
                 int temp=arr[inic];
                arr[inic]=arr[medio];
                arr[medio]=temp;
                inic++;
                 for (int i = medio+1; i < fina; i++) {
                   if(arr[medio]>arr[i]){
                     temp=arr[i];
                     arr[i]=arr[inic];
                     arr[inic]=temp;
                   }
                 }
                 
                if(arr[inic+1]>arr[medio]){
                                           
                }
            }else{
   
                 medio++;
            }
    }*/
    /*public static void mergeSort(int[] arr,int inic, int fina) {
          int medio=fina/2;
          
          int valorDetenido=medio;
          int valorAAsignarse=inic;
          if(arr[valorDetenido]<arr[valorAAsignarse]){
              
              valorAAsignarse=valorDetenido;
          }
          
    }*/
}
