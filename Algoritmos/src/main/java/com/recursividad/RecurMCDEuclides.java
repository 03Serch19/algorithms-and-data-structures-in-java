package com.recursividad;

public class RecurMCDEuclides {
    public static void main(String[] args) {
        int mcd= calcularMCD(48,60);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
          mcd= calcularMCD(42,56);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
         mcd= calcularMCD(202,105);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
          mcd= calcularMCD(252,105);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
            mcd= calcularMCD(35,64);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
    }
   private static int calcularMCD(int n1, int n2) {
       return calcularMCD(n1, n2, 2);
    }
    private static int calcularMCD(int n1, int n2,int primo) {
        if((n1/primo)<1 || (n2/primo)<1)return 1;
        if((n1%primo)==0 && (n2%primo)==0){  
        int nr1=n1/primo;
        int nr2=n2/primo;
           return primo*calcularMCD(nr1, nr2,primo);
       }
       else{
           boolean noHayPrimo=true;
           while(noHayPrimo){
           primo++;
           int aux=2;
           while(aux<primo){
               if(primo%aux==0){
                   break;  
               }
               aux++;
               if(aux==primo)noHayPrimo=false;
            }
           }
           return calcularMCD(n1, n2, primo);
       }
    }
}
