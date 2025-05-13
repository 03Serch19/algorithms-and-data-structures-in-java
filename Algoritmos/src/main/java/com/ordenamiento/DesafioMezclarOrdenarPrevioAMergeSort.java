package com.ordenamiento.s;

import java.util.Arrays;

public class DesafioMezclarOrdenarPrevioAMergeSort {
    public static void main(String[] args) {
        
       // ejercicio 1 de prueba ,version pasasndole 2 areglos
        
    // String  []A = {"Ana", "Carlos", "Luis"/*,"Zurita","Zuti","Zuxi"*/};
    // String  []B = {"Beatriz", "Daniel", "Zoe"/*,"Zurita","Zuti","Zuxi"*/};
      
    /* String []C = combinarListaYOrdenarAlbeticamente(A,B);
        for (String valorC : C) {
            System.out.println(valorC);
        }*/
    /*if(A[0].compareTo(B[0])<0)System.out.println(A[0]);
     else System.out.println(B[0]);*/
    
    
    //ejerciccio 1 pero pasando un solo arreglo
     String  []A = {"Ana", "Carlos", "Luis","Beatriz", "Daniel", "Zoe"};
        fusionarMitadesOrdenadas(A,0,A.length/2,A.length/2,A.length);
         
        for (String valorA : A) {
            System.out.println(valorA);
        }
     
    }
    //🔹 Ejercicio 1: Mezcla de Listas de Nombres
//Tienes dos listas de nombres ordenadas alfabéticamente. Debes escribir un programa que las combine en una sola lista ordenada.
     static String[] combinarListaYOrdenarAlbeticamente(String Aa[],String Bb[]){
         String []arrOrdenadoMezclado=new String[Aa.length+Bb.length];
       //las priumeras 2 son indices o puden llmarse posiciones de iteracion,  llamralos apuntadores tecnicamente no es correcto ya que un a´puntadopr en realidad accede a una direccion de memoria y aunque en jabvusamsos estos terminos a y pueden ser utiul tecnicamente en los apuntadores no estan en java ya que noa ccedemos adirecciones de memoria directamente como los apuntadores i lo jhacen en c o c++
         int apunA=0,apunB=0,posiInsertar=0;
           // Comparar y fusionar ordenadamente
        while(apunA<Aa.length && apunB<Bb.length){       
         if(Aa[apunA].compareTo(Bb[apunB])<0){
            arrOrdenadoMezclado[posiInsertar++]=Aa[apunA++]; 
         }else{
             arrOrdenadoMezclado[posiInsertar++]=Bb[apunB++];
         } 
        }
            // Copiar los elementos restantes de Bb (si hay
         while(apunB<Bb.length){
             arrOrdenadoMezclado[posiInsertar++]=Bb[apunB++];
         }
          // Copiar los elementos restantes de Aa (si hay)
         while(apunA<Aa.length){
              arrOrdenadoMezclado[posiInsertar++]=Aa[apunA++];
         }
        
        //}
        return arrOrdenadoMezclado;
     }
    /* static String[] combinarListaYOrdenarAlbeticamente(String Aa[],String Bb[]){//hoy si soluconado, solo ahre una ultima vcesion para dejar las condiciones co n una forma mas calra de entender
         String []arrOrdenadoMezclado=new String[Aa.length+Bb.length];
         int apunA=0,apunB=0,posiInsertar=0;
        //while(posiInsertar<Aa.length+Bb.length){ 
        while(!(apunA==Aa.length || apunB==Bb.length)){       
         if(Aa[apunA].compareTo(Bb[apunB])<0){
            arrOrdenadoMezclado[posiInsertar++]=Aa[apunA++]; 
         }else{
             arrOrdenadoMezclado[posiInsertar++]=Bb[apunB++];
         } 
        }
         while(apunA==Aa.length && apunB<Bb.length){
             arrOrdenadoMezclado[posiInsertar++]=Bb[apunB++];
         }
         while(apunB==Bb.length && apunA<Aa.length){
              arrOrdenadoMezclado[posiInsertar++]=Aa[apunA++];
         }
        
        //}
        return arrOrdenadoMezclado;
     }*/
    
    /*static String[] combinarListaYOrdenarAlbeticamente(String Aa[],String Bb[]){//logrado, solo que ese peude dejar de una forma mas cxlara seprando los paso de logicos ce mezlcar y copiar los restante en caso un array se agotre antes, este lo hace pero usa cierta qcantidfad de if que poodria hacer comparaciobnes inncecesaraias y si bien separa los apsos logicos no es tan claro como la cetsiobn que hare arriba
      String C[]=new String[Aa.length+Bb.length];
         String menor;  
         int banA=0,banB=0;
      for (int i = 0; i < Aa.length+Bb.length ; i++) {     
           if(banA==Aa.length){
            menor=Bb[banB];
            banB++;
           }else if(banB==Bb.length){
            menor=Aa[banA];
            banA++;
           } 
           else{
             if(Aa[banA].compareTo(Bb[banB])<0){
                       menor=Aa[banA];
                       banA++;
               }else{
                       menor=Bb[banB];
                       banB++;
                }
           }               
         C[i]=menor;
     }
      return C;
 }*/
    
    
  /*static String[] combinarListaYOrdenarAlbeticamente(String Aa[],String Bb[]){
      //String C[]=null;//esto asi  mal, debermos iniciar el array
      String C[]=new String[Aa.length+Bb.length];
         String menor;  
         int banA=0,banB=0;
      for (int i = 0; i < Aa.length+Bb.length ; i++) {
         
           if(banA==Aa.length){
            menor=Bb[banB];
            banB++;
           }else if(banB==Bb.length){//si solo van lkos dos if por individual en  algun punto  ambois se cumplirarn asi que entrara en ambos y podra generar errores,  entronces se debe usar else if. asi nosaseguramos  que  solo entre en uno de los 2
            menor=Aa[banA];
            banA++;
           } 
           else{//la aprte del caso normal debe anidarse dentro de un else ya que si se deja fuera del elsey se deja indemependiatne siempre se evaluara y pude hfgenerar errores ya que esto solo se debe hacer en caso no se cunpola ninfguna de las condiciuones de arriba y asi que debemos asegurarnos eque las 3 partes noi se mezclen entre si, cada uno debe cumpklirse solo una
             if(Aa[banA].compareTo(Bb[banB])<0){
                       menor=Aa[banA];
                       banA++;
               }else{
                       menor=Bb[banB];
                       banB++;
                }
           }     
             
       
          /*for (int j = 0; j < Aa.length; j++) {///esto es inncecesario
                   if(Aa[j].compareTo(Bb[j])<0){
                       menor=Aa[j];
                   }else{
                       menor=Bb[j];
                   }
             }
          for (int j = 0; j < Bb.length; j++) {
              
          }*/
    //     C[i]=menor;
   //  }
   //   return C;
 //}*/
     
   //ejercicio 1 pero pasnado los 2 areglos ordenados en un solo arreglo en sus respectivas mitades
       static void fusionarMitadesOrdenadas(String []Aa,int indMtUno,int indMtDos,int longMUno,int longMDos){ //ya esta solo falta  la flexibilidad ya que msantengo los valores fijos dfe mitad y final dentro del metodo y a la rjora de aplicar recusioprn nececitamos que tods estos valroes sean dianmicos segun las pmitadesd el areglo que s evan mandadnado
        int indiAsignar=0;                       
     String[] aux=new String[Aa.length];//esto deberia pasrse como paremetro en cada llamda asi no estarlo craeanedo en cad llmada ya q es inefciente
     
        while(indMtUno<longMUno&&indMtDos<longMDos){
            if(Aa[indMtUno].compareTo(Aa[indMtDos])<0){
                aux[indiAsignar++]=Aa[indMtUno++];
            }else{
                aux[indiAsignar++]=Aa[indMtDos++];
            }
        }
        while(indMtUno<longMUno){
            aux[indiAsignar++]=Aa[indMtUno++];
        }
        while(indMtDos<longMDos){
             aux[indiAsignar++]=Aa[indMtDos++];
        } 
      System.arraycopy(aux, 0, Aa, 0, Aa.length);
       
     }
     
     
      /*   static void fusionarMitadesOrdenadas(String []Aa,int indMtUno,int indMtDos){//ya reglado solo falta lo de la flexibidad, osea para irlom preprarando para el un lagopritmo como mergfe sort que es recursivo y se debe enviar los valores dianmicamente y no rigidos
        int indiAsignar=0;                       
      //String[] Aa=new String[A.length];
      //Aa=A.clone();
     // String[] aux=A;
     String[] aux=new String[Aa.length];
     
        while(indMtUno<Aa.length/2&&indMtDos<Aa.length){
            if(Aa[indMtUno].compareTo(Aa[indMtDos])<0){
                aux[indiAsignar++]=Aa[indMtUno++];
            }else{
                aux[indiAsignar++]=Aa[indMtDos++];
            }
        }
        while(indMtUno<Aa.length/2){
            aux[indiAsignar++]=Aa[indMtUno++];
        }
        while(indMtDos<Aa.length){
             aux[indiAsignar++]=Aa[indMtDos++];
        } 
       //Aa=Arrays.copyOf(aux, 0);  //cra un nuevo areglo ennmemoria no funciona, si lo ahcemos atravez de clone() iugal es un nuevo areglo que dse crea
      //  Aa=aux.clone();//
     //  Aa=aux;//aca iugal aca directamente estamos cambiando a apuntar ala refrecnia de aux y dejaria de apuntar a la refrefcnia que venia en Aa
       System.arraycopy(aux, 0, Aa, 0, Aa.length);//ahora si, comopiamos los valores de aux a al obnjeto al que apunta la referencia de Aa, sin estar creando un nuevo areglo
        //ojo que en cualquioer caso, lo esto por son obnjetos imnutables, y no es el fin en este ejercico, pero para otros fines este tipo de copia copia solo refrecnias de los valores en el areglo, osea que si los valores de areglo son mutables, entocnes cmabiando el de la copia afecvtara al original o viucefbverdsa qya que cada valor del areglo apuntaria a mirsma refrecnia de los que apunta los valores delotro areglo , por tanto para estos casso se debe hacer copia profunda
     }*/
     
     
        /*  static void fusionarMitadesOrdenadas(String []A,int indMtUno,int indMtDos){//funciono, pero debemos hacer flexible los limites de las condiciones para cuando esto no sea un tamaño fijo osea sobretordo a ñla jhora de aplicarlo ejn llamdas recursivas donde el array va casmbiando sus limites
        int indiAsignar=0;                       //y segundo manejar de mejor forma la manipulacion de los arrays y no modificar directamente a A, eso se mejorara en la version de arriba
      String[] Aa=new String[A.length];
      Aa=A.clone();
      String[] aux=A;
        while(indMtUno<Aa.length/2&&indMtDos<Aa.length){
            if(Aa[indMtUno].compareTo(Aa[indMtDos])<0){
                aux[indiAsignar++]=Aa[indMtUno++];
            }else{
                aux[indiAsignar++]=Aa[indMtDos++];
            }
        }
        while(indMtUno<Aa.length/2){
            aux[indiAsignar++]=Aa[indMtUno++];
        }
        while(indMtDos<Aa.length){
             aux[indiAsignar++]=Aa[indMtDos++];
        }     
     }*/
    /* static void fusionarMitadesOrdenadas(String []Aa,int indMtUno,int indMtDos){
        String temp;
        int indiAsignar=0;
        String[] aux=new String[Aa.length]; //en la forma estandar de  merge sort si se debe usar un array aux para infgresar los nuevos elementos
        while(indMtUno<Aa.length/2&&indMtDos<Aa.length){
            if(Aa[indMtUno].compareTo(Aa[indMtDos])<0){
                aux[indiAsignar++]=Aa[indMtUno++];
                //  System.out.println("esto se ejecuta");
            }else{
               //   System.out.println("esto se ejecuta");
                aux[indiAsignar++]=Aa[indMtDos++];
            }
            //System.out.println("esto se ejecuta");
        }
        while(indMtUno<Aa.length/2){
            aux[indiAsignar++]=Aa[indMtUno++];
             // System.out.println("esto se ejecuta");
        }
        while(indMtDos<Aa.length){
             aux[indiAsignar++]=Aa[indMtDos++];
            //   System.out.println("esto se ejecuta");
        }
        // System.out.println("esto se ejecuta");
       //  for (String au : aux) {//a fin de depurar al igual que los demas sout en este metodo
       //      System.out.println(au);
       //  }
       
        Aa=aux; //forma mal de manejar la refrecnia, ya que este aux es un nuevopkobjeto y pracicamente estoy haciendo al objeto Aa q apunte a aux, pero este ya es un nuevo apunte direferente al que apunta A opriginal que esta donde se estallamando este metodo, por tanto aquel seguira apuntado a la direccion del primer objeto
       //  for (String a : Aa) {
      //       System.out.println(a);
      //   }
     }*/
     /*static void fusionarMitadesOrdenadas(String []Aa,int indMtUno,int indMtDos){
        String temp;
        int indiAsignar=0;
        while(indMtUno<Aa.length/2&&indMtDos<Aa.length){
            if(Aa[indMtUno].compareTo(Aa[indMtDos])<0){
                temp=Aa[indiAsignar];
                Aa[indiAsignar++]=Aa[indMtUno];
                Aa[indMtUno++]=temp;
            }else{
                temp=Aa[indiAsignar];
                Aa[indiAsignar++]=Aa[indMtDos];
                Aa[indMtDos++]=temp;
            }
        }
        
     }*/
}
