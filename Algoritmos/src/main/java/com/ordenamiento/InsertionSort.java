package com.ordenamiento.s;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
             int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
            21, 22, 23, 24, 25, 26, 27,28,29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
            41, 42, 43, 44, 45, 46, 47, 48,49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
       int[] m2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 
            141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 
            161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 
            181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200};
        
       int[] m6={2,3};
         int[] m7={5};
      int[] m3 = {20,180 ,15,15, 8,2, 30, 26, 42,1, 1, 50};
     // int[] m3 = {3,3,5,7,9,11,23,36,65,67,68,68,69,78,79,85,86,91,96,96};
      
       /* for (int i : m3) {
            System.out.println(i);
        }
        System.out.println("*********************************************");
        insertionSort(m3);
           for (int i : m3) {
            System.out.println(i);
        }*/
           
           /* int[] arr = {92, 3, 45, 18, 29, 12, 77, 5, 66, 23, 
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
    long startTime = System.nanoTime();
    insertionSort(arr);
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");*/
      /* int[] orderedArray = new int[200];
        for (int i = 0; i < 200; i++) {
            orderedArray[i] = i;
        }
        
        int[] unorderedArray = new int[800];
        for (int i = 0; i < 800; i++) {
            unorderedArray[i] = new Random().nextInt(1000); // Números aleatorios entre 0 y 999
        }
        long startTime = System.nanoTime();
    insertionSort(unorderedArray);
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
     insertionSort(orderedArray); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
    
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
/* public static void insertionSort(int arr[]){
        int longi=arr.length;
        if(longi==0 || arr==null)return;
             
        while(longi!=1){                    
        int mayor=arr[0];int indReemp=0;
        for (int i=0; i < longi; i++) {
            if(mayor<arr[i]){
                mayor=arr[i];
                indReemp=i;            
            }
        }
        arr[indReemp]=arr[longi-1];
        arr[longi-1]=mayor;
        longi--;
     }
    }*///malo, ni siquiera tieende mas a ser ordenamiento por seleccion segun dice gpt
    
    /*public static void insertionSort(int arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                
            }else{
                if(i==0){
                    int tem=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tem;
                    continue;
                }
                int temp=arr[i+1];            
                for (int j = i+1; j >=0; j--) {
               //if(i==0)System.out.println("dgdsgdsgds");
                    if(temp > arr[j]){
                        arr[j]=temp;
                        break;
                    }else{
                    arr[j]=arr[j-1];
                    if(j-2==-1)arr[j-1]=temp-1;
                    else arr[j-1]=arr[j-2];
                    }
                }
            }
        }
    }*///funciono pero tampoco es un insertion sort, noo es la logica adecuada
    
  /*public static void insertionSort(int arr[]){
        if(arr.length==0 || arr.length==1 || arr==null)return;
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>arr[i-1]){
           }
           else{
              int indiAux=i;
                int temp=arr[i];
               while(indiAux<=i){
                   if(temp>arr[indiAux-1]){
                       arr[indiAux]=temp;
                      break;
                   
                   }
                   else{
                   arr[indiAux]=arr[indiAux-1];                     
                   indiAux--;
                   if(indiAux==0){
                       arr[indiAux]=temp;
                       break;
                   }
                   }
               }
           }
        }
    }*///ahora si ya se parece mas a un orndamiento por insercion pero aun falta
    
      /*public static void insertionSort(int arr[]){
       //no hace falta validar para cero o uno ya que pues ya estarian ordenados y no ahri falta entrar a l for, y null no ,porque pues en ordenamientos estandar mnop tendraimos porque validar un null
        for (int i = 1; i < arr.length; i++) {
         //  if(arr[i]>arr[i-1]){//esto tampoco hace falta, ya que todo dentro del while se valida que si es mayor a la primera pues
         //  }                //solo se reasiganra a si  mismo y pasara a la sigueitne irteracion for
         //  else{    
              int indiAux=i;
                int temp=arr[i];
               while(indiAux>0){
                   if(temp>=arr[indiAux-1]){//>= asi si el que esta en menor porsion es igual a este que quiero insertar, pues solo inserto en esta posicion y dejo su sopia en en lugar j-1 para no alterar el orden y pues ya estsarasin ordenasdos ya que son iguales 
                       arr[indiAux]=temp; //y pues claro si es mayor pues obvio qiuddara aca y el menor ya quedara en al posi de mas abajjo
                      indiAux=0;             
                   }
                   else{
                   arr[indiAux]=arr[indiAux-1];                     
                   indiAux--;
                   if(indiAux==0){
                       arr[indiAux]=temp;
                   }
                   }
               }
           //}
        }
    }*///version con comentarios


         /*   public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {    
              int indiAux=i;
                int temp=arr[i];
               while(indiAux>0){
              //  while(arr[indiAux-1]!=temp&&indiAux!=i){
                   if(temp>=arr[indiAux-1]){
                       arr[indiAux]=temp; 
                      indiAux=0;             
                   }
                   else{
                   arr[indiAux]=arr[indiAux-1];                     
                   indiAux--;
                   if(indiAux==0){
                       arr[indiAux]=temp;
                   }
                   }
               }
        }
    }*///ya acetrtamos casi, solo esa asginacion forzada a cero hay qu ever como quitarla
      

      /*  public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {    
              int indiAux=i;
                int temp=arr[i];
              do{
                   if(temp>=arr[indiAux-1]){
                       arr[indiAux]=temp;          
                   }
                   else{
                   arr[indiAux]=arr[indiAux-1];                     
                   indiAux--;
                   if(indiAux==0){
                       arr[indiAux]=temp;
                   }
                   }
              }while(temp!=arr[indiAux]); //ya sea con < o con != dffunciona, para mejor comprension dejaremos !=
        }
    }*///aun asi no es la mejor eleccion aun
    

    /* public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {    
              int indiAux=i;
                int temp=arr[i];
                if(temp>=arr[indiAux-1])continue;
                while(!(temp>=arr[indiAux] && indiAux!=i)||(indiAux!=i && temp<arr[indiAux])){
                   arr[indiAux]=arr[indiAux-1];                     
                   indiAux--;
                   if(indiAux!=0){
                      if(temp>arr[indiAux-1]){
                       arr[indiAux]=temp; 
                      }
                   }else{
                       arr[indiAux]=temp;
                   }
                  
               }
        }
    }*/ //tampoco
     /*
    public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {    
        int indiAux = i;
        int temp = arr[i];

        do {
            if (indiAux > 0 && temp < arr[indiAux - 1]) {
                arr[indiAux] = arr[indiAux - 1];
                indiAux--;
            } else {
                break;
            }
        } while (true);
        
        arr[indiAux] = temp; // Inserción en la posición correcta
    }
}//me traje este directo de caht gpt porque se me hace iutneredsante esta formade usar el true en  el dowhile, pero pues la de abajoes mi solcion final y al fin acerte
*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //ahora si,estandar correcta by me
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {    
              int indiAux=i;
                int temp=arr[i];
                 while(indiAux!=0 && temp<arr[indiAux-1]){
                   arr[indiAux]=arr[indiAux-1];  
                   indiAux--;
               }
                arr[indiAux]=temp;
        }
    }
     
     
     //ahora con recursion, no es estandar pero pues algo elegante se verá
       /*  public static void insertionSort(int arr[]){
               insertionSort(arr,1);//emepzasmos dsde 1//ennesta caso primero se hace la inserccon y luego la recursion
         }
         private static void insertionSort(int arr[],int indi){
             if(indi==arr.length)return;
             
             int key=arr[indi];
             int indikey=indi;
             while (indikey>0 && key <arr[indikey-1]) {                 
                 arr[indikey]=arr[indikey-1];
                 indikey--;
             }
             arr[indikey]=key;
             insertionSort(arr,indi+1);
         }*/
    
  
    //version correcta by me recrusiva
         //ahora sin ser estandar see isnertion pero si la estandar de insertion con recursion
    /*public static void insertionSort(int arr[]){
               insertionSort(arr,arr.length-1);//empezamos des dla longitud del array, el objetiuvo es primero hacer la recursion y luego la insercion
         }      
         private static void insertionSort(int arr[],int longi){
             if(longi<=0)return;
             insertionSort(arr,longi-1);  //ordenamos hasta longi -1, podria usar el nombre n en lugar de longi para hacer mas alusion a lo calsico qeu es refererise hasat qeu valor vamos a ordenar el areglo
             int key=arr[longi];
             int indikey=longi;
             while (indikey>0 && key <arr[indikey-1]) {                 
                 arr[indikey]=arr[indikey-1];
                 indikey--;
             }
             arr[indikey]=key;
            
            
         }*/
}
