package com.iteratividad;

public class FibonacciConIteratividad {
    public static void main(String[] args) {
        
        //
       // long secueRetorna[]=crearSecuenciaFibonacci(9);
       // long secueRetorna[]=crearSecuenciaFibonacci(18);
       //   long secueRetorna[]=crearSecuenciaFibonacci(20);
           /* long secueRetorna[]=crearSecuenciaFibonacci(40);
        for (long l : secueRetorna) {
            System.out.print(l+" ");
        }
        System.out.println();*/
       long valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(9);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(18);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(20);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(40);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
       //valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(100);//devolvio un negativo cereo noi es sufiente long
       // System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
          valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(70);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(9);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(0);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        valorEnLaPosicionNEnFibonacciSecuencia=calcularValorEnSecuenciaFibonacciPosicion(6);
        System.out.println(valorEnLaPosicionNEnFibonacciSecuencia);
        
    }
    //esto no es encontrar el elemento n de la sucesion de fibonacci, es una iniciaciion a anda mas un algoritmo que me cree una secuencia
    //fiboncacci hasta n elemento
    //no es lo ismo que encontra elemento tal de la sucesion(osea referido a una sucedion no guarada en un matriz donde directamente vas abucasr
    //el vaslor en tal posiciion, si no a buscar el valor x en cuelquier posicion de la sucesion, la cual se sabe esta dad mendaitne l las umas de los 2 anterirores
    // tomaremos en cuenta que iniciara en la posicion 1 de la secuencia sera 0 y la posicion 2  sera 1, 
    private static long[] crearSecuenciaFibonacci(int i) {
     long secueFibo[]=new long[i];
        for (int j = 0; j < secueFibo.length; j++) {
            if(j==0 || j==1 ){ secueFibo[j]=j; continue;}
            secueFibo[j]=secueFibo[j-1]+secueFibo[j-2];
        }   
     return secueFibo;
    }
//puedo basar este mismo algoritmo para encontarr el n esiomo elemnto tambien, solo qiue ya no tendria porque alamcenar el array
//en nbase al enteirror de cierta forma aplique la forma itertiva del algoritmo dswe busqueda
    
    //version busqueda elemento n en secuencia, version iterativa, mas optima que de forma recurrente
    /*private static long calcularValorEnSecuenciaFibonacciPosicion(int i) {
        long temp=0L;
        long temp2=0L;
        long valor=0L;
        for (int j = 0; j < i; j++) {
            if(j==0 || j==1){
                temp+=(long)j;//este casting es inncecesario, ya que un int se asigna a un long
                valor=temp;
            }
            else{
                valor=temp+temp2;
                temp2=temp;
                temp=valor;           
          }
        }
        return valor;
    }*/
    //version mas compactada
    //recordadndo que fsub0=0, fsub1=1 fsubn=fsubn-1+fsubn-2
    private static long calcularValorEnSecuenciaFibonacciPosicion(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        long anterior=0,actual=1,siguiente;
        for (int j = 2; j <n+1; j++) {
            
                siguiente=anterior+actual;//calculamos el nuevo fibonacci
                anterior=actual;//ahora el que era actual sera mi anterior fibonacci
                actual=siguiente;          //y el actual seera el nuevo fibonacci
        }
        return actual;
    }
    
   
}
