package com.busqueda;

public class BusquedaLineal {
    public static void main(String[] args) {
        int []arr=new int[20];
                int[] m5 = {1, 2, 3, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,  19, 20, 
      22, 23, 24, 25, 26, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, //indice 30 creo
    41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57, 58, 59, 60, 
    61, 62, 63, 64, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 
    101, 102, 103, 104, 105, 106,  108, 109, 110, 113, 114, 115, 116, 117, 118, 119, 120, 
    121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 
    141, 142, 143, 144, 145, 146, 147, 148, 149, 153, 154, 155, 156, 157, 158, 159, 160, 
    161, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 
    181, 182,184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 
    201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 
    221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232,  234, 235, 236, 237, 238, 239, 240, 
    241, 242, 243, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 
    261, 262, 288, 289, 290, 293, 295, 296, 297, 298, 299, 300,302};
      /*  for (int i = 0; i < 20; i++) {
            arr[i]=i+1;
        }
        int indiValorEncontrado=busquedaLineal(arr,-6);
        
        System.out.println(indiValorEncontrado);*/
        
       long startTime = System.nanoTime();
     int indiceDelValorEncontrado=busquedaLineal(m5, 300);  
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
        
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////version iterativa estadnar acertada, y se puede modiufcar que solo ternornemos un false o ture en caso solo nos intersa saber si el valor existe  o no, es una vafricion
   public static int busquedaLineal(int arr[],int valor){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==valor){
                return i;
            }
        }
        return -1;
    }
           //version recursiva   //funcional pero podria ser menos enfiiciente que la forma estandar de la biusqeda lineal qeu se basa en la iteratividad 
     /*   public static int busquedaLineal(int arr[],int valor){   
        return busquedaLineal(arr, valor,0);
    }

    private static int busquedaLineal(int[] arr, int valor, int i) {
        if(i==arr.length)return -1;
        if(arr[i]==valor)return i;
        else return busquedaLineal(arr, valor,i+1);
    }*/
        
}
