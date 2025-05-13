package com.ordenamiento.s;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
      int[] m3 = {20,180 ,15,15, 8,2, 30, 26, 42,1, 1, 50};
     // int[] m3 = {3,3,5,7,9,11,23,36,65,67,68,68,69,78,79,85,86,91,96,96};
      
       /* for (int i : m3) {
            System.out.println(i);
        }
        System.out.println("*********************************************");
        sortByMeBubbleSort(m3);
           for (int i : m3) {
            System.out.println(i);
        }*/
       
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
          
          /*long startTime = System.nanoTime();
    sortByMeBubbleSort(arr);
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");*/
          
               //de tiempo
     int[] orderedArray = new int[5000];
        for (int i = 0; i < 5000; i++) {
            orderedArray[i] = i;
        }
        int[] unorderedArray = new int[9000];
        for (int i = 0; i < 9000; i++) {
            unorderedArray[i] = new Random().nextInt(5000); // Números aleatorios entre 0 y 999
        }
     long startTime = System.nanoTime();
     sortByMeBubbleSort(orderedArray); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //ahora con recursion a ver que tal
  /*  static void sortByMeBubbleSort(int arr[]){ 
    //    boolean swaped;
    //    do {            
     //     swaped=false;           
          sortByMeBubbleSort(arr,arr.length-1,arr.length-1);
            
        //} while (swaped);
    }*/
    
    //no
     /*  static void sortByMeBubbleSort(int arr[]){           
          sortByMeBubbleSort(arr,arr.length-1,arr.length-1);
    }
    
      static void sortByMeBubbleSort(int arr[],int eleFinal,int cent){  
       int band=1;
          if(eleFinal<=0)return;
        sortByMeBubbleSort(arr, eleFinal-1,cent);
        if(arr[eleFinal-1]>arr[eleFinal]){
            int temp=arr[eleFinal];
            arr[eleFinal]=arr[eleFinal-1];
            arr[eleFinal-1]=temp;
            band=1;
        }
       if(cent==eleFinal&&band!=0){
               sortByMeBubbleSort(arr,eleFinal-1,eleFinal-1);
        }
    }*/
    
    
    /*static void sortByMeBubbleSort(int arr[]){   //version recursurva by me correcta
         sortByMeBubbleSort(arr,arr.length-1,0,false);
          // sortByMeBubbleSort(arr,arr.length-1,0);//ejecutamos la version que aunqeu este ordenado ejecuta kla recursion inncesariamnte hasta terminar;
    }
         
    static void sortByMeBubbleSort(int arr[],int n,int element,boolean swaped){     //version recursurva by me correcta
        if(n==0)return;
        if(element==n){
            if (!swaped) {
                return;
            }
          //  System.out.println(" si esta ordenado esto se ejecuto innecesariemente");//esta liena se ejeciutaba solo cuando un areglo no estaba ya ordenado
             sortByMeBubbleSort(arr,n-1,0,false);
         return;//retronamos para que esta llamada al cum´plirse el caso base opriginal no ejecute lo qeue resta de liena de codigo en esta lalamda
        }
        if(arr[element]>arr[element+1]){
            int temp=arr[element];
            arr[element]=arr[element+1];
            arr[element+1]=temp;
            swaped=true;
        }
         sortByMeBubbleSort(arr,n,element+1,swaped);
    }*/
    /* static void sortByMeBubbleSort(int arr[],int n,int element){    //al fin acerte, solo que es una version optima pero podria ser mejoir si fuera una version la cual comprobara si el array ya esta oprdenado asi no tener que estar recuririendo innvecesariamente  
        if(n==0)return;
        if(element==n){
            System.out.println(" si esta ordenado esto se ejecuto innecesariemente");
             sortByMeBubbleSort(arr,n-1,0);
         return;
        }
        if(arr[element]>arr[element+1]){
            int temp=arr[element];
            arr[element]=arr[element+1];
            arr[element+1]=temp;
        }
         sortByMeBubbleSort(arr,n,element+1);
    }*/
      
      /*static void sortByMeBubbleSort(int arr[],int n,int element){    //funciono perop tampoco es lo adecuado  
         if(element==n)return;
        if(arr[element]>arr[element+1]){
            int temp=arr[element];
            arr[element]=arr[element+1];
            arr[element+1]=temp;
        }
         sortByMeBubbleSort(arr,n,element+1);
        sortByMeBubbleSort(arr,n-1,0);

    }*/
       /*  static void sortByMeBubbleSort(int arr[],int element){    //funciono pero pues no deberia ser asi  
         if(element<=0)return;
         sortByMeBubbleSort(arr, element-1);
        if(arr[element-1]>arr[element]){
            int temp=arr[element];
            arr[element]=arr[element-1];
            arr[element-1]=temp;
        }
        sortByMeBubbleSort(arr, element-1);

    }*/
      
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //estandarbubble by me logrado
    static void sortByMeBubbleSort(int arr[]){ 
        int temp;
        int finVal=arr.length-1;
        boolean swaped;
        do{
            swaped=false;
        for (int i = 0; i <finVal; i++) {
            if(arr[i]>arr[i+1]){
               temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;               
               swaped=true;
            }
        }
         finVal--;
        }while(swaped);                      
    }
    
       /* static void sortByMeBubbleSort(int arr[]){ 
      int temp=0,nLongit=arr.length;
        boolean swaped;
            do {      
             swaped=false;               
              for (int i = 0; i < nLongit-1; i++) {              
              if(arr[i]>arr[i+1]){
                temp=arr[i];   
                arr[i]=arr[i+1];
                arr[i+1]=temp;  
                swaped=true;
               }
             }nLongit--;    
            } while (swaped);
                               
    }*/
    
    //una version propuesta del recusivo con bubvle sort era este
    /*
    public class BubbleSortRecursivo {
    public static void bubbleSortRecursivo(int[] arr, int n) {
        // Caso base
        if (n == 1) {
            return;
        }

        // Una pasada burbujeando el mayor
        for (int i = 0; i < n - 1; i++) { //se supooene que esta es la recusriva estandar mezxcalda con iteracion, asun asi lofgre hacer la forma optima a pura recursividad
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Llamada recursiva para el resto
        bubbleSortRecursivo(arr, n - 1);
    }
}*/
}
