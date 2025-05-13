package com.ordenamiento.s;

import java.util.Arrays;
import java.util.Random;

public class QuickSortLomuto {
    public static void main(String[] args) {                 
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
    /* long startTime = System.nanoTime();
     quickSort(arr); 
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");*/
    
    /*System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(arr));
     quickSort(arr);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(arr));*/
    
    
    //pruebas
     /* int[] orderedArray = new int[200];
        for (int i = 0; i < 200; i++) {
            orderedArray[i] = i;
        }
 System.out.println("Array antes de ordenar:");
    System.out.println(Arrays.toString(orderedArray));
     quickSort(orderedArray);
    System.out.println("Array despues de ordenar:");
    System.out.println(Arrays.toString(orderedArray));*/
        // Array desordenado
        /*int[] unorderedArray = new int[200];
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
    //Version acertada finalmente, luego probar con algoritmo de partciion Hoare ya que este esta hecho con particion Lomuto
    private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
     private static void quickSort(int[] arr,int firsposi, int lastposi) {
       if(firsposi>=lastposi)return;
       int piv = particionar(arr,firsposi,lastposi); 
       quickSort(arr, firsposi, piv-1);
       quickSort(arr, piv+1, lastposi);
        
    }

     //Particion Con lomuto y elijiiendo de pivote al ultiimo elemento
     /*private static int particionar(int []arr,int  inic,int piv){
       int i=inic-1,temp;
       for (int j = inic; j <= piv; j++) {
           if(arr[j]<=arr[piv]){
            i++;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }    
       }      
        piv=i;      
       return piv;
    }*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     

     //con lomuto pero eligiendo un piivote aleatorio
       /*private static int particionar(int []arr,int  inic,int pivo){
       Random rand= new Random();      
        int piv = rand.nextInt(pivo-inic+1)+inic; 
        
       int i=inic-1,temp;
       for (int j = inic; j <= pivo; j++) {
           if(arr[j]<=arr[piv]){    //estomaca esta malo, yta que al analiizar de esta forma la laetoriiedad el valore del pivote uede qyuedar asgundado en un valos q2ue no corresponde a su orden corecto en la mtriz final por ttano al devolver, esto ya nos genreara incossitencias en elareglo, ya que por la naturaleza de la particion de  lomutop se cree que el ultimo elemtno es el pivote portanto este hace el iin tercambio, pero en este caso ebns un aletorio el cyual pudede estar mucjho antees e intercambairse y por tanto el i del pivote pude volver a iincrementarse si  mas adelante encuentra aun mas menores, retoirnandosnos si , un viute donde tosos loes elemntos son menores o iguales al piicvote, mas no el pivote el bval,.or en su posiicon que deberia ir, por tanto esto conlleva a que debemos mnodifiicar la logiica del  algoritmo y mas operaciones para poder lograr esto
            i++;                       //asii qeu para miitigar, mejor se establece que la laetoriada se intercambie al iiniciopor el ultiimo valor asii se interge facilmente a la logicca de lomuto, por tanto i se quedara hasta dondelos valores sean menores al pivte aleatorio,y cuadno luego iuran los mayores, y cyuadno se llegue a la ultima oposioin se cumplira la lofi9ca de lomuto ya qeu el ultimo elelnto coindidra con j  ya que la validacion dice menor o igual menor iogual porque pueden haber valores en posiones ,menores iguales al el de l poscion del pivote y por esa raxzon tambiejn se valida que se pase a la ixzquiierda, pero en este caso ya serai el ultimo elemtno que xoidifde con el final de la lista lo cual nos estrai ahora si, luefo de ordenar menores o ugaules a la izqueiira y naopres a la derecha, nos mandara el piviote a su poscion correcta ,inctercambiando esa poscicion con el ultmimo elemto que es donde esta el pivote, y de esta menara nos devolvera ese i que ahroas erai la posiicon del picote ya ordenado,ahora, sobre todo en u alista oprdenada se notara mas yaque ahora e, pivote ya no  sera necesariaente el pentultimo elemento  y lasita podra ir dividida de dforma mas erquiklibrada, osbre todo ya qeu al intercamvio del pivote coindicdra en caso sea un alista ordenada con el valor que fue intercambniado oriigicnalmente dque estaba en ultamia poscion, pues al llegar al final volvera a su posicon original al final del areglo y no devolvera el areglo ordenado nuevamente pero ahora a evaluarlo con  un pivote que puede que estea al medio y por tanto seria ma equilibfrada la distribucion de operaciones, en caso de una lista desrodenada pues, lo miismo , al final ira siemrpe el valor del pivote y su valor ,y puede el intercambio final mandara calramente un ,ayhor al final, ya se a oporque con el qeu se intercmbio orifigincalmete fue mayor y se mantuvo y los demas todos mayores o porque era menoral valordel pivote y por tanto debera quedasr a la izqueirda y portanto se iuncremento a mas dealeanta y alhora el intercambio ya se sera el origian a como si es con una lista ordenada, si no que es el intercambvio quedeberia ser, ya qeu se intercambia un ,mayor al final por la posicon del pivote y su valor, que debra eir, en la posicon donde estaba el final que estaba msegudn el picvote aleatorio y por tanto ese i sera el valor del nuevo pivote, segudn  donde haya qeudadop el ukltimo menor  o igual, el cual esta con la logica para qwue el utlimo vaslor siempre quede en el ultimo valor de i, asi siempre aseguramos de dejar al pivote en su posicon final coprrecta
            temp=arr[j];   //por  tanto esta logiuca no funcionaria al 100% asi que lo harem os tal y como esta abajo
            arr[j]=arr[i];
            arr[i]=temp;
        }    
       }               
       return i;
    }*/
      /*//con lomuto pero eligiendo un pivote aleatorio
       private static int particionar(int []arr,int  inic,int fin){
        Random rand= new Random();      
        int piv = rand.nextInt(fin-inic+1)+inic;        
         int i=inic-1,temp;
         temp=arr[piv];
         arr[piv]=arr[fin];
         arr[fin]=temp;    //esta logica la podriamos dejar afuera en otra funcion aparte de tal forma como esta abajo
         for (int j = inic; j <= fin; j++) {
             if(arr[j]<=arr[fin]){
              i++;  
             temp=arr[j];
             arr[j]=arr[i];
             arr[i]=temp;
        }    
       }               
       return i;
    }*/
     
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //Particion Con lomuto pero eligiendo un pivote aleatorio //version fianl com metodos separados
     private static int particionar(int []arr,int  inic,int fin){
        int i=inic-1,temp;
          elegirPivoteAleatorio(arr, inic, fin);
         for (int j = inic; j <= fin; j++) {
             if(arr[j]<=arr[fin]){
              i++;  
             temp=arr[j];
             arr[j]=arr[i];
             arr[i]=temp;
        }    
       }               
       return i;
    }
      
     static void elegirPivoteAleatorio(int []arr,int ini,int fin){
       Random rand= new Random();      
        int piv = rand.nextInt(fin-ini+1)+ini;     
         int temp=arr[piv];
         arr[piv]=arr[fin];
         arr[fin]=temp;
     }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
     
     
     
     //reescribiir la logica seria que el j vaya decrementadno y pues todo elo que sto conlleva que ahora la validaciones yt todo ser invertiria,para acoplaralo a la logica del primer elemento como piivote
/*Si deseas utilizar el primer elemento como pivote sin modificar la lógica principal de tu función particionar() (que actualmente asume el último elemento como pivote), tu enfoque de intercambiar el primer y último elemento al inicio es una solución válida.
Al hacer este intercambio, efectivamente estás moviendo el primer elemento a la posición del último elemento, lo que permite que la lógica de Lomuto funcione correctamente.
Por qué esto es válido:

La lógica de Lomuto se basa en la idea de que el pivote está al final del subarreglo.
Al intercambiar el primer y último elemento, estás cumpliendo con esta condición sin tener que reescribir la lógica de partición.
Esto te permite reutilizar tu función particionar() sin modificaciones significativas.
Consideraciones:

Aunque esta técnica funciona, es importante tener en cuenta que agrega una operación adicional (el intercambio inicial).
En algunos casos, podría ser más eficiente reescribir la lógica de partición para que funcione directamente con el primer elemento como pivote.
Sin embargo, si prefieres mantener la simplicidad y reutilizar tu código existente, el enfoque es perfectamente aceptable.*/
     
     
     
     
     
     
     
     
     
     
     
     
     
     
       //with lomuto//de esta forma funciona, esto si queremos dejar la lidacion soolo menor osea los elemtnos iguales se iran a la derecha, pero queda de una mejor manera haciendo la validacion que los iguales ,mejor se vayan a la izquierda, asi podemos usar dentro del mismo for validar que el jsea igual al pivote y asiu ahi mismo se hace la asignacion del pivote en su posicon final coprreta y calramente la codicion de evaluacion sera  cuando ekl vaklor de j sea menor o igual lo cual coincidra oi cunao el valor es igual al pivote o cuando el valor es el mismo poivote por tanto ya quedara dentrop asignado de una vez, y el retrono sera de un solko piv el cual tendra el valor de i, y no hara falta una asignacion i+1
 /*private static int particionar(int []arr,int  inic,int piv){
       int i=inic-1,temp;
       for (int j = inic; j < piv; j++) {
           if(arr[j]<arr[piv]){
            i++;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }    
       } 
       
       temp=arr[i+1];
       arr[i+1]=arr[piv];
       arr[piv]=temp;
       piv=i+1;
       
       return piv;
    }*/
    
    
    
    
    //okey hoy si apliqeu al recursion aun asi creo qu enalizando este codfigo se ve evidente que no es optimo por la forma en que estan la rescursiones mas el algoritmo de particion que no es coorrecto osea no es un estandar como lomuto u hoare
/*
       private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
     private static void quickSort(int[] arr,int firsposi, int lastposi) {
       if(firsposi>=lastposi)return;
       int piv = particionar(arr,firsposi,lastposi); 
       quickSort(arr, piv+1, lastposi);
       quickSort(arr, firsposi, lastposi-1);
        
    }
    
 private static int particionar(int []arr,int  inic,int piv){
        int i=inic, j=piv-1;int temp;
        while(i<j){
            if(arr[piv]<arr[i]){
             if(arr[piv]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }
            }else{
                i++;                             
            }
              if(arr[piv]>arr[j]){
               if(arr[piv]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }  
            }else{
                j--;
            }
        }
        temp=arr[i];
        arr[i]=arr[piv];
        arr[piv]=temp;
       return i;
    }*/
    
    

    
    //primera version de quick by me qyue logfre hacer funcionar, ahora toca conllevarlo apra que se alinee a como es quick en su mane3ra mas optima
   /* private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
     private static void quickSort(int[] arr,int firsposi, int lastposi) {
       if(firsposi>=lastposi)return;
        particionar(arr,firsposi,lastposi); 
         quickSort(arr, firsposi, lastposi-1);
        
    }
    
 private static void particionar(int []arr,int  inic,int piv){
        int i=inic, j=piv-1;int temp;
        while(i<j){
            if(arr[piv]<arr[i]){
             if(arr[piv]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }
            }else{
                i++;                             
            }
              if(arr[piv]>arr[j]){
               if(arr[piv]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }  
            }else{
                j--;
            }
        }
      //  if(i!=j){
        temp=arr[i];
        arr[i]=arr[piv];
        arr[piv]=temp;
      //  }
       // quickSort(arr, inic, i);
        quickSort(arr,i+1, piv);

        //quickSort(arr, piv,arr.length-1);
    }*/
    
    //primer medio acercamiento en la logica de quick, pero aun estamos usando logicas algo complejas que podemos mejorar, y obviamente falta aplicar bien la recursividad porqwu esta imcompleto
   /*  
   private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
    private static void quickSort(int[] arr,int firsposi, int lastposi) {
       if(firsposi>=lastposi)return;
        particionar(arr,firsposi,lastposi);   
        
    }
    
 private static void particionar(int []arr,int  inic,int piv){
        int i=inic, j=piv-1;int temp;
        while(i<j){
            if(arr[piv]<arr[i]){
             if(arr[piv]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }
            }else{
                i++;                             
            }
              if(arr[piv]>arr[j]){
               if(arr[piv]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }  
            }else{
                j--;
            }
        }
      //  if(i!=j){
        temp=arr[i];
        arr[i]=arr[piv];
        arr[piv]=temp;
      //  }
       // quickSort(arr, inic, i);
        quickSort(arr,i+1, piv);

        //quickSort(arr, piv,arr.length-1);
    }*/
    
    /*private static void particionar(int []arr,int  inic,int piv){
        int i=inic, j=piv-1;int temp;
        while(i<j) {
            if(arr[piv]<arr[i]){
             if(arr[piv]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
             }
            }else{
                i++;
            }
              if(arr[piv]>arr[j]){
               if(arr[piv]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
             }  
            }else{
                j++;
            }
        }
        temp=arr[i];
        arr[i]=arr[piv];
        arr[piv]=temp;
        quickSort(arr, inic, i);
        //quickSort(arr, piv,arr.length-1);
    }*/
    
    /*private static void particionar(int []arr,int piv){
        int j=piv-1;int temp;
        for (int i = 0; i < piv; i++) {
            if(arr[piv]<arr[i]){
             if(arr[piv]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
             }
            }else{
                i++;
            }
            if(arr[piv]>arr[j]){
               if(arr[piv]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
             }  
            }else{
                j++;
            }
        }
    }*/
    
    
    
}
