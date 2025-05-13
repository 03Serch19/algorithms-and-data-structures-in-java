package com.recursividad;

public class RecursividadTorresHanoi {

public static void main(String[] args) {
   torresHanoi(3,'A','B','C');
}
  public static void torresHanoi(int n,char origen, char auxiliar,char destino){
      if(n==1){
        System.out.println("Moviendo disco " +n+" de torre "+origen+" a torre "+destino);
        return;
      }else{
        torresHanoi(n-1, origen, destino, auxiliar);
        System.out.println("Moviendo disco " +n+" de torre "+origen+" a torre "+destino);
        torresHanoi(n-1, auxiliar, origen, destino);
        
      }
   }
}
