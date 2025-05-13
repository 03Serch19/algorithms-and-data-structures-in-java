package com.ordenamiento.s;

import java.util.Random;

   public class SelectionSort {
       public static void main(String[] args) {
          // int nume={3,4,5,6,8,9,22,63,65,72};
        int []nume={52,63,95,42,56,6,3,8,9,66,23,56,41,88,23};   
         /*  for (int i : nume) {
               System.out.println(i);
           }
           System.out.println("***************************************");
           selectionSort(nume);
             for (int i : nume) {
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
    selectionSort(arr);
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
     selectionSort(orderedArray); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
       }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       /* public static void selectionSort(int arr[]){//fucniono, ahora a pulirlo mas abajo para que sea mas estandar
            for (int i = 0; i < arr.length; i++) {            
            int seleccionado=arr[i];
            int indiSeleccionado=i;
                for (int j = i; j < arr.length-1; j++) {
                    if(seleccionado>arr[j+1]){
                    seleccionado=arr[j+1];
                    indiSeleccionado=j+1;
                    }
               }
                arr[indiSeleccionado]=arr[i];
             arr[i]=seleccionado;       
            }
        }*/


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       public static void selectionSort(int arr[]){//forma estandar y legibnle y cumple lo  propuesto
            for (int i = 0; i < arr.length; i++) {            
            int indiSeleccionado=i;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j]<arr[indiSeleccionado]){
                    indiSeleccionado=j;
                    }
               }
                if(indiSeleccionado!=i){
                int temp=arr[indiSeleccionado];
                arr[indiSeleccionado]=arr[i];
                 arr[i]=temp;       
                }
            }
        }
       
////////////////////////con recursividad///////////////////////////////////////
        /* public static void selectionSort(int arr[]){
             selectionSort(arr,0,1,0);
        }*/
       
       
        /* public static void selectionSort(int arr[],int indSelecc,int ini,int iniNoMut){
            if(iniNoMut==arr.length-1)return;
            
            if(ini==arr.length){
                if(indSelecc!=iniNoMut){
                    int temp=arr[indSelecc];
                    arr[indSelecc]=arr[iniNoMut];
                    arr[iniNoMut]=temp;
                }
                indSelecc=iniNoMut+1;
             selectionSort(arr,indSelecc,indSelecc+1,indSelecc);
             return;//en lugar de el else podemos usar el return, asi al desapilarse no tiene que ejecutar lo qeu resta de esta llamda, es equicvaelnte a usar else
            }//else{      //pero es mas proferesional al menos en este caso usar un return  en la codicion  para que se evite la ejeciuciuon de esta parte del metodo en lallamda actual y asi nos evitamos estar anidadno elses, ya que para el efdecto de la ,l.ogica de la llamda no deberia considerase un else, sino solo la condidicion que se debe cumpl,ir, ya que esto es recursividad y estamnos dividiendo el probelema
             int indiSeleccio=indSelecc;
             if(arr[ini]<arr[indiSeleccio]){
                 indiSeleccio=ini;
             }
             selectionSort(arr,indiSeleccio, ini+1,iniNoMut);
          //  }
           }*/
         
         //version mas clara by me con comentarios
       /*  public static void selectionSort(int arr[],int indSelecc,int ini,int iniNoMut){
            if(iniNoMut==arr.length-1)return;           
            if(ini==arr.length){
                if(indSelecc!=iniNoMut){
                    int temp=arr[indSelecc];
                    arr[indSelecc]=arr[iniNoMut];
                    arr[iniNoMut]=temp;
                }
                //indSelecc=iniNoMut+1; innceseraia asigancion esto de abajo se ve mas limpip  y mas claro, en lugar de estar indiSelecc 2 veces e indiSelec+1, merjor mandamos directamenente el iniMutaumentadnolo debiudo
             selectionSort(arr,iniNoMut+1,iniNoMut+2,iniNoMut+1);
             return;
            }
            // int indiSeleccio=indSelecc;//no hace falta esta variable, d eun solo mandamos el indSelecc ya que esto nos viueen manejando de una vez el indice
             if(arr[ini]<arr[indSelecc]){
                 indSelecc=ini;
             }
             selectionSort(arr,indSelecc, ini+1,iniNoMut);
           }*/
         
///////////////////////////////version final by me junto al wrapeed metod arriba///////////////////////////////////////////////////////////
          /*   public static void selectionSort(int arr[],int indSelecc,int ini,int iniNoMut){
            if(iniNoMut==arr.length-1)return;           
            if(ini==arr.length){
                if(indSelecc!=iniNoMut){
                    int temp=arr[indSelecc];
                    arr[indSelecc]=arr[iniNoMut];
                    arr[iniNoMut]=temp;
                }
             selectionSort(arr,iniNoMut+1,iniNoMut+2,iniNoMut+1);
             return;
            }
             if(arr[ini]<arr[indSelecc]){
                 indSelecc=ini;
             }
             selectionSort(arr,indSelecc, ini+1,iniNoMut);
           }*/
             
             //la version propuesta de java siempre usadno recursividad , solo que la propuesta siempre es mezcalsda con iteracion
             /*
             import java.util.Arrays;

public class SelectionSortRecursivo {
    public static void selectionSortRecursivo(int[] arr, int inicio) {
        if (inicio >= arr.length - 1) { // Caso base: Si solo queda un elemento, ya está ordenado
            return;
        }

        // Encontrar el índice del mínimo en la parte desordenada
        int minIndex = inicio;
        for (int i = inicio + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Intercambiar el mínimo encontrado con el primer elemento de la parte desordenada
        if (minIndex != inicio) {
            int temp = arr[inicio];
            arr[inicio] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Llamada recursiva para ordenar el resto del array
        selectionSortRecursivo(arr, inicio + 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Arreglo original: " + Arrays.toString(arr));

        selectionSortRecursivo(arr, 0); // Llamada inicial con el índice 0

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }
}

             */
             
             
   }
