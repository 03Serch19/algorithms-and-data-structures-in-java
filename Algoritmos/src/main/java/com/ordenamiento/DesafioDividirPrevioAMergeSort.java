package com.ordenamiento.s;

public class DesafioDividirPrevioAMergeSort {
    public static void main(String[] args) {
        int []arreglo={96,2,56,9,6,3,8,9,5,9};
        dividirArreglo(arreglo);
    }
    static void dividirArreglo(int []arr){
                                       //parametros necesarios para la logica
        //dividirArreglo(arr, 0, arr.length/2, arr.length/2, arr.length);
         dividirArreglo(arr, 0, arr.length-1);
    }
    static void dividirArreglo(int []arr, int inicio,int fin){
        if(inicio==fin){
            System.out.println("Areglo dividido");
            System.out.println(arr[inicio]);
            return;
        }
        int medio=(inicio+fin)/2;
        dividirArreglo(arr, inicio, medio);
        dividirArreglo(arr, medio+1, fin);        
    }
       /*static void dividirArreglo(int []arr,int iniM1, int longM1,int iniM2,int longM2){//asi funciona, ahora tratrd e hacerlosin nececidad de los parametros loong
        if(iniM1==longM1){
            System.out.println("Areglodividido");
            System.out.println(arr[iniM1]);
            return;}
        dividirArreglo(arr, iniM1, iniM1+(longM1-iniM1)/2, iniM1+(longM1-iniM1)/2, longM1);
        dividirArreglo(arr, iniM2, (longM2+iniM2)/2, (longM2+iniM2)/2, longM2);
        
        
    }*/
    
   /* static void dividirArreglo(int []arr,int iniM1, int longM1,int iniM2,int longM2){//valores no ajustados correctamente
        if(iniM1==longM1){
            System.out.println("Areglodividido");
            System.out.println(arr[iniM1]);
            return;}
        dividirArreglo(arr, iniM1, longM1/2, longM1/2, longM1);
        dividirArreglo(arr, iniM2, longM2+iniM2/2, longM2+iniM2/2, longM2);
        
        
    }*/
}
