package com.ordenamiento.s;

import java.util.Random;

public class CocktailShakerSortBidBubbleSort {
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
          //sortByMeBubbleSortCocktailShakerSort(arr);
        //  for (int i : arr) {
        //    System.out.println(i);}
        
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
     sortByMeBubbleSortCocktailShakerSort(orderedArray); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
    }

  //implementar bubblesort con Cocktail Shaker Sort (Bidirectional Bubble Sort)
    //al volver
    static void sortByMeBubbleSortCocktailShakerSort(int[] arr){
        boolean swaped;
        int temp,nLongi=arr.length,nInicial=0;//podria usar nLongi=arr.length-1, pero prefiero dejarlo asi , para entendimiento mio
        do {   
            swaped=false;             
            for (int i = nInicial; i < nLongi-1; i++) {//el ultimo indice a iterar es el penultimo asi dehjo asegurado el ultimo como el mayor
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swaped=true;
                }   
              //  System.out.println("i desde el primer for "+i);//esto es por debugging mode
            }
            if (!swaped) break;//si no se intercambio es porque ya esta ordenado asi que sale del ciclo
            
            nLongi--;//reduzco la logitud del array(ahora la ultima posicion a evaluar es nLongi-1)
            for(int i=nLongi-1; i>nInicial; i--){//inicio en el laultima posicion y llego hasta la segunda para asegurar a la primera como la menor posicion
                if(arr[i]<arr[i-1]){
                   temp=arr[i];
                   arr[i]=arr[i-1];
                   arr[i-1]=temp;
                   swaped=true;
                }
                    //System.out.println("i desde el segundo for "+i);
            }
            nInicial++;//luego aumento el inicial asi ahora ahora inicio con el segundo indice ya que el primero ya quedo asegurado como el minimo
        } while (swaped);
    }
}
