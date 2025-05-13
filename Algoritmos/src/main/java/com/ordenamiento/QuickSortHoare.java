package com.ordenamiento.s;

import java.util.Arrays;
import java.util.Random;

public class QuickSortHoare {
    public static void main(String[] args) {
       /* Random rand= new Random(); 
        int piv = rand.nextInt(8-5+1)+5; 
        System.out.println(piv);*/
        
         int[] m3 = {20,180 ,15,15, 8,2, 30, 26, 42,1, 1, 50};
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
    System.out.println(Arrays.toString(m3));
     quickSort(m3);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(m3));*/
     /*long startTime = System.nanoTime();
     quickSort(arr); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");*/
    /*
    System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(arr));
     quickSort(arr);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(arr));*/
    
    
    //pruebas
     /*int[] orderedArray = new int[200];
        for (int i = 0; i < 200; i++) {
            orderedArray[i] = i;
        }
 System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(orderedArray));
     quickSort(orderedArray);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(orderedArray));*/
        // Array desordenado
       /* int[] unorderedArray = new int[200];
        for (int i = 0; i < 200; i++) {
            unorderedArray[i] = new Random().nextInt(1000); // Números aleatorios entre 0 y 999
        }
         System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(unorderedArray));
     quickSort(unorderedArray);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(unorderedArray));*/
    
     
     
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
     quickSort(unorderedArray); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
     private static void quickSort(int[] arr,int firsposi, int lastposi) {
       if(firsposi>=lastposi)return;
       int piv = particionar(arr,firsposi,lastposi); 
       quickSort(arr, firsposi, piv);//para que funciuone calramente aca debemo mandar el pivote retornado, ya que hoare no necesariamnnte deja el valor del pivote en su posicon corrcta por tanto este pivopte que retorna no esta esta en su posion coprrecta por tando debe seguirse mnenviando para qeu se siga en recursion
       quickSort(arr, piv+1, lastposi);
        
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //Particion con Hoare //elijiendo como pivote el primer elemento,  es su  forma natural
     /*private static int particionar(int []arr,int  piv,int fin){
      int i=piv-1,j=fin+1,valorPivo=arr[piv];
      while(true){
          do {              
              i++;
          } while (arr[i]<valorPivo);
          do {              
              j--;
          } while (arr[j]>valorPivo);

       if(i>=j){break;}
       
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
     } 
      return j;
     }*/
////////////////////////////////////////////////////////////////////////////////////////
   //Particion con Hoare usando un pivote aleatorio 
    private static int particionar(int []arr,int  ini,int fin){
      elegirPivoteAleatorio(arr, ini,fin);
      int i=ini-1,j=fin+1,valorPivo=arr[ini];
      while(true){
          do {              
              i++;
          } while (arr[i]<valorPivo);
          do {              
              j--;
          } while (arr[j]>valorPivo);

       if(i>=j){break;}
       
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
     } 
      return j;
     }
      static void elegirPivoteAleatorio(int []arr,int ini,int fin){
       Random rand= new Random();      
        int piv = rand.nextInt(fin-ini+1)+ini;     
         int temp=arr[piv];
         arr[piv]=arr[ini];
         arr[ini]=temp;
     }
     
  
     

  //en parte funciona  en si, pero mas qeu  todo de forma si  fuera un  void ya que   de esa form,a si, siemrpe me dejaria dividida la  lista, pero enetes caso quere,eos un retrrono asi quedebriahcaerlo de tortranmanera como arriba
    /* private static int particionar(int []arr,int  piv,int fin){
         int i=piv-1,j=fin+1;
         int valorPivo=arr[piv];//int temp;
           
         while(true){
             
          //if((i+1)==(j-1)){
          //    if(arr[j-1]>=valorPivo){i++;break;}
         //     else{i=j; break;}
        //  }  
         
         do { 
             j--; 
         } while (j!=(piv-1)&&arr[j]>=valorPivo);
       
          do {             
            i++; 
         } while (arr[i]<valorPivo);
          
        
          if(i>j)break;
          
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          
          
      }
      return i;
     }
     */


     
     //esto solo para afianzar siempre  com lomuto pero usando el pirmero elemtno  y modifcando  la forma para ecvitarnos elintercamvio pero la loica de partcion de lomjuto sitgue  intacta , nda mas que a la inccversa, pero las comparaciones y forma de operar e s lo mismo
     /*private static int particionar(int []arr,int  piv,int fin){
       int i=fin+1,temp;
       for (int j = fin; j >= piv; j--) {
           if(arr[j]>=arr[piv]){
            i--;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }    
       }      
        piv=i;      
       return piv;
    }*/

    
}
