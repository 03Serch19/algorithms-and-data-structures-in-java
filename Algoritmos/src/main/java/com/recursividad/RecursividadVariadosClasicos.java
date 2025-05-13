package com.recursividad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursividadVariadosClasicos {
    public static void main(String[] args) {
       
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //1  Factorial
     // int factorial=  calcularFactorial(5);
      //  System.out.println("Factorial: "+factorial);
      
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //2  Suma de lista de numeros
    int[] numeros = {12, 45, 23, 67, 89, 34, 56, 78, 90, 21, 
                 43, 65, 87, 32, 54, 76, 98, 11, 33, 55, 
                 77, 99, 22, 44, 66, 88, 10, 30, 50, 70, 
                 80, 20, 40, 60, 100};
    // List<Integer> listaNumeros=new ArrayList<>();
   //  for (int numero : numeros) {
   //         listaNumeros.add(numero);
  //      }
    // int suma = calcularSumaLista(listaNumeros, listaNumeros.size());//versiion mia
   //  int suma = calcularSumaLista(listaNumeros);
    // int suma = calcularSumaLista(numeros,0);
     //ahjora usando con Wrapper Method, asi solo tener que mandar lo necesario 
 //     int suma = calcularSumaLista(numeros);
//       System.out.println("La suma de la lista es: "+suma);
    //resultado esperado int suma = 1925;
       
///////////////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //3   Buscar un elemento en un arreglo//atravez de recursividad
   /*int[] numeros = {12, 45, 23, 67, 89, 34, 56, 78, 90, 21, 
                 43, 65, 87, 32, 54, 76, 98, 11, 33, 55, 
                 77, 99, 22, 44, 66, 88, 10, 30, 50, 70, 
                 80, 20, 40, 60, 100};
      //con 2 aprametros
      // int indice = buscarELementoEnArreglo(23,numeros);
     //con 3 parametros 
     int indice = buscarELementoEnArreglo(23,numeros,0);
       if(indice==-1)System.out.println("Valor no esta en el arreglo "+indice);
        else System.out.println("El valor esta en la posicion: "+indice);*/
   
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //4  Cálculo del máximo común divisor (MCD):  
      /*  int mcd= calcularMCD(48,60);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
         mcd= calcularMCD(202,105);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
        mcd= calcularMCD(252,105);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
          mcd= calcularMCD(16,24);     
        System.out.println("El M.C.D de ambos numeros es "+mcd);
        mcd=calcularMCD(2366,273);
        System.out.println("El M.C.D de ambos numeros es "+mcd);
               mcd=calcularMCD(273,2366);
        System.out.println("El M.C.D de ambos numeros es "+mcd);
               mcd=calcularMCD(0,273);
        System.out.println("El M.C.D de ambos numeros es "+mcd);
          mcd=calcularMCD(273,0);
        System.out.println("El M.C.D de ambos numeros es "+mcd);*/
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //5 Secuencia de Fibonacci:
    /*  long valorEnSecuenciaFinonacci=calcularValorEnFibonacciEnPosicion(9);
        System.out.println(valorEnSecuenciaFinonacci);
        valorEnSecuenciaFinonacci=calcularValorEnFibonacciEnPosicion(0);
        System.out.println(valorEnSecuenciaFinonacci);
        valorEnSecuenciaFinonacci=calcularValorEnFibonacciEnPosicion(6);
        System.out.println(valorEnSecuenciaFinonacci);
        */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //6  Inversión de una cadena:
      
     String cadenaAInvertir="euclides";
     String cadenaInvertida=invertirCadena(cadenaAInvertir);
        System.out.println(cadenaInvertida);
        
        cadenaAInvertir="euclide";
        cadenaInvertida=invertirCadena(cadenaAInvertir);
        System.out.println(cadenaInvertida);
      
          cadenaAInvertir="eu";
        cadenaInvertida=invertirCadena(cadenaAInvertir);
        System.out.println(cadenaInvertida);
         cadenaAInvertir="e";
        cadenaInvertida=invertirCadena(cadenaAInvertir);
        System.out.println(cadenaInvertida);
        System.out.println("**************************************************");
         cadenaAInvertir="euclides";
         cadenaInvertida=invertirCadena(cadenaAInvertir,2);
        System.out.println(cadenaInvertida);
        
        cadenaAInvertir="euclide";
        cadenaInvertida=invertirCadena(cadenaAInvertir,2);
        System.out.println(cadenaInvertida);
      
          cadenaAInvertir="eu";
        cadenaInvertida=invertirCadena(cadenaAInvertir,2);
        System.out.println(cadenaInvertida);
         cadenaAInvertir="e";
        cadenaInvertida=invertirCadena(cadenaAInvertir,2);
        System.out.println(cadenaInvertida);
    }  
    



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
  //1 Factorial
    /*private static int calcularFactorial(int numero) {
      if(numero==0)return 1;
      else{
          return numero*calcularFactorial(numero-1);
      }
    }*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////// 


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //2 Suma de lista de numeros   Solucion mia primera
   /* private static int calcularSumaLista(List<Integer> lista,int tamBand){
        if(tamBand==1)return lista.get(tamBand-1);
        else{
            return lista.get(tamBand-1)+calcularSumaLista(lista, tamBand-1);
        }
    }*/
    //version luego de feedback , mia de cieiirta forma que va desde ele ultimo al primero
     /*private static int calcularSumaLista(List<Integer> lista){
        if(lista.isEmpty())return 0;
        else{
            return lista.get(lista.size()-1)+calcularSumaLista(lista.subList(0, lista.size()-1));
        }
    }*/
  //version con mas feedback dfonde usamos la logicas desde adelante hacia atras, osea del primero al utlimo
     /* private static int calcularSumaLista(List<Integer> lista) {
        if (lista.isEmpty()) return 0; // Caso base: lista vacía
        return lista.get(0) + calcularSumaLista(lista.subList(1, lista.size()));//recordar que el segundo parametro es excluyente osea en un caso final tomara de la lista desde el tamaño-1 hasta  el tamaño. a nivel de indicess seria desde el indicetamaño -1 hasta el indice tamaño -1  osea estamos viendo q la lista es solo un elemto, ahora si ambos son iguales  eso queire decir  que la lista  retornadfa esta vacia 
    }                                             //en cada llamda recursiva vamos mandando la lsita sin el primer elemento por mtanto asi vamos quitando los primeros elemtnos hasta al fianl  dejar la lista vacia
                                                  //al mandar 1 recordar estamos quitando en cada llamda al elemento  cero quiere decir qen cada llamada la lsita se va reduciondo, osea  avanzando jhacia  adelante
 //ojo que en realidad lo qeu sucede es que la lista se va haciendo mas pequeña pero con un avance hacia adelante, y en el metodo  version anteriro ahacie los mismo pero con un avance a la inversa
*/
 //version no usando un list, y haciendolo sirectamente desde un areglo normal
   /*  private static int calcularSumaLista(int[] num, int indi){
           if(num.length<=indi || indi <0)return 0;        
           else{
             return num[indi] + calcularSumaLista(num, indi +  1);
           }
    } */
///version como Wrapper Method
    //El wrapper method (o método envoltorio) es un patrón de diseño que se usa para hacer que una función recursiva sea más fácil de usar y más intuitiva para quien la llama.
    // Método público (Wrapper)
    //esto deberia ser public(estaaba privada y aun asi funcioanba) como estoy enla misma clase me permite usarlo pero en si esta debe ser publica e intuitiva pra el uso
     /* public static int calcularSumaLista(int[] num){  //y la private seria la que haria la recursividad real
             return calcularSumaLista(num, 0); // Llama a la versión recursiva con índice inicial 0
      } 
    // Método privado (Recursión real)
      private static int calcularSumaLista(int[] num, int indi){
           if(num.length<=indi || indi <0)return 0;        
           else{
             return num[indi] + calcularSumaLista(num, indi +  1);
           }
       }*/ 
      
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
//3   //Buscar un elemento en un arreglo//atravez de recursividad
      //version uno fallada ni se probo
     /* private static int buscarELementoEnArreglo(int valorB, int[] numeros){
       
          int valor=valorB;
         
          int valorBand;
          if(valor!=0){
              int valorBusc=valorB;
              valor=0;
          }
          if(numeros[valor] != valorBand){
               return buscarELementoEnArreglo(valor++,numeros);
           }else{
               return valor;
           }
          
          return 1;
      }*/
      
      //para mayor rendimiento no es la mejor opcion, mejor usar  la version 3 donde donde no  voy creando copias en cada recrudsion ya que esto gasta memoria
     //Esto hace que el algoritmo tenga un costo O(n²) en el peor caso, en lugar de O(n).
      //version 2 by me, primera oficial funcionando
        /*  private static int buscarELementoEnArreglo(int valorB, int[] numeros){
           // if(numeros.length==0)return -1;
          if(numeros[numeros.length-1]!=valorB){
             if(numeros.length==1)return -1; //usando este caso base,u ekl otro que deveulve -1 ambos funcioanrian, en este al ya evaluar que en 0 no habia nada merjo retorna de un solo -1 asi no tiene que estar volvendo a crear otra copia para una nueva llamda recuriva, la cual era controlada en el toro caso base de ariba que especificamos que si esa longiutud es cero pues  retrrone -1, usando este base no evitamos esto
                                               //int [] nArreglo=;//no hace falta creear el array ya sabemosaplciando array.algo que devuelva un int[] pues  ahi esta diceindo no, que devuelve un array, no ahce falta asignar
          return buscarELementoEnArreglo(valorB, Arrays.copyOf(numeros, numeros.length-1));//esto permite copiar areglos osea crear copias con longitud cero, osea un arreglo vacio, con longitud cero, ojo no es lo mismo que un arreglo= null(esto dindica que ni isqueira hay areglo, solo es una refrencia apuntando a un null;
          }else{                                     //en cada vuela recortamos el array una posicion menos en su copia
              return numeros.length-1;
          }
       }*/
      
          //version 3 por mi con mini feedback solo porq  vi que lo soluciuonaron con 3 parametros lo hare yo tambien       
        /* private static int buscarELementoEnArreglo(int valorB, int[] numeros,int indice){
          if(indice==numeros.length)return -1;
          if(numeros[indice]!=valorB){
            return buscarELementoEnArreglo(valorB,numeros,indice +1);//pero mejor asi, asi de esta forma nomodificamos el  indice  y solo  mdecimos que lo que mandaremos sera el indice sumado +1 y pues ya el nuevo indice que llegue sera el valore del indice  anterior +1
          // return buscarELementoEnArreglo(valorB,numeros,++indice);
          }else{                                        //++indice indicamos que sume 1 al indice i  leugo eso envie
           return indice;                                 //indice++ lo qwue hacemos es enviar el i y liuego incrementar pero bueno, obviaemnte este incremento no serviria de nada porque el valor enviado se fue sin incrementar y por ende  se quedara en na recursion infinita
          }
       }*/
   
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //4 Cálculo del máximo común divisor (MCD):    
      //Utiliza el algoritmo de Euclides para encontrar el MCD de dos números usando recursión.
    
      //euclides primera version
         /* private static int calcularMCD(int n1, int n2) {
              int mayor;
              int menor;
              if(n1>n2){
                  mayor=n1;
                  menor=n2;
              }else{
                  mayor=n2;
                  menor=n1;
              }
              n1=mayor-menor;
              n2=menor;
             if(n1==n2){
              return n1;
             }
             return calcularMCD(n1, n2);
       }*/
       //euclides version tradicional (menos restas)
     /*  private static int calcularMCD(int n1, int n2) {
            if(n1>n2){
              if(n1%n2==0)return n2;  
           
              return calcularMCD(n1%n2, n2);//mandamos el menor (n2)  y el residuo, y en la sigueinte llamda recursiva de nuevo se repite el proceso de ubicar  al nuevo mayo y asi sucecivamente
          
            }else{ 
                if(n2%n1==0)return n1;  
                
              return calcularMCD(n2%n1, n1);//mandamos el menor(n1) y el residuo, y en la sigueinte llamda recursiva de nuevo se repite el proceso de ubicar  al nuevo mayo y asi sucecivamente
              
            }
       }*/
       
       /*
       Recordar, el resisduo siempre sera menor al divisor, estara entre 0 inclusive y el divisor exclusivo
       no hay forma que el residuo sea menor o igual al divisior, de ser asi, si en caso fuera un residuo igual al divisior
       esto significaria que hemos dejado sin agregar ese  otro valor qeu aun cabe en el dividendo,es como si doijeremos 15 dividendo
       entre 3 divisor y dijeramos 4 cociente residuo 3, oseaa nos faltarian 3 para completar el el dividendo
       pero, ese 3  es igual al divisor osea que ese espacio puede ser llenado por el divisor una quinta vez
       asi que el cociente seria 5 y residuo 0, ahora si el residuo fuera mayor al divisor, la logiva es obvia
       osea en autoimatico sabemos que al menos 1 espacio ha quedado sin llenar e inclusive mucjhos mas
       digamos 15 entre 3 , digamos conciente 2, residuo 9, osea obviemente el divisorcabe una vez mas ,y no solo 1, si no todavia
       otras 2 veces mas
       */
       
       //forma mmas compacta algoritmo euclides tradicional
    //   private static int calcularMCD(int n1, int n2) {//forma impelmentada coorrectamente
   //      if(n2==0)return n1; //a ever, el maximo comun divisor de x numero y 0 cera x numero porque 0 entre x 0, exacto, y x/x 1 exacto
   //      return calcularMCD(n2, n1%n2);//segun euclides, mandamos el divisor ahora como nuevo dividendo, que o es el divisor con el resto mque es menor, o si es
                                    //o si es primera vez y el dividendo era menor al divisor pues estamos mandanddo ahora si al divisor en su posicion que deberia estar como dividendo y pues en esta caso el reesto sera el antiguo dividendo que era menor al divisor, asi que ahora este dividendo menor  aya va como divisor y ya va todo en posiciopn correcta
         
         //recordar que la divison de un menor entre un mayor desde lo exacto dara cero, y el resto sera el dividendo,
         //osea que eso es lo que falta al diviidendo para que el divisor pueda caber al menos 1 vez
        // osea 16 / 24 = 0 residuo 16
        //ya que 16=24*0+ r   ---> 16-0=r r=16
        // 16=24*0 +16 ----> 16=0+16 --->16=16
        
        //en base a esop el algoitmo permitimos qiue entre en cualquier orden ya que tenemos a n2 que resguardara al divisor ya sea porque
        //en caso dividendo sea mayor a divisor este divisor sera el nuevo dividendo ya que sera el nuevo mayor y el residuo 
        //enviado sera obviamente menor, asi que ya los mandamos ordenados o porque el divisor era mayor asi que en n2 se enviara resguardado
        //como el nuevo divideondo y pues el divisor se recupera del resto de la division que al ser en en este caso el dividendo menor que el
        //divisor pues ya sabemos que el resto sera el dividendo y lo enviamos como el segundo parametro que ahora  ya garantiza que ira en orden
        //adecuado ,osea dividendo mayor a divisor y ya no se altera de nuevo ya que siiempre, el residuo sera menor al divisor
        //osea ya ordenado que se envie una vez ya no se volvera a desordenar haciendo que el dividendoi seea menor al divisor
     
       /*     cociente   residuo
        16÷24	0	16	No se armó ni un grupo; todo quedó sobrante.
        24÷7	3	3	Se armaron 3 grupos; quedaron 3 elementos que no completaron otro grupo.
        */                       //oseq uedaron  elementos sobrantes
 
    //     }
       //iterativo eucclides mia version1
       /*private static int calcularMCD(int n1, int n2){
           int mayor=n1;
           int menor=n2;
           if(n2>n1){
              mayor=n2;
              menor=n1;
           } 
           if(menor==0)return mayor;
           int r=0;
           while(mayor%menor!=0){
               r=mayor%menor;
               mayor=menor;
               menor=r;
            }
           return menor;
       }*/
       
       //version 2, ya optimizada en version iterativa
    /* private static int calcularMCD(int n1, int n2){
           if(n2>n1){
            int temp=n2;
            n2=n1;
            n1=temp;
           } 
           if(n2==0)return n1;
           int r=0;
           while(n2!=0){
               r=n1%n2;
               n1=n2;
               n2=r;
            }
           return n1;
       }*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //5. Secuencia de Fibonacci:
   //Escribe una función recursiva para calcular el enésimo número de la secuencia de Fibonacci.
    //complejidad mayor para valores muy altos o altos , por la cantidad de veces que dentra que estar recurriendo
    /*Es decir, que este algoritmo es muy lento. Por ejemplo, para calcular  f50{\displaystyle f_{50}} este algoritmo requiere efectuar 20.365.011.073 sumas.*/
    /*1 Versión recursiva descendente (Complejidad O(φn){\displaystyle O(\varphi ^{n})\,})*/
    //usabndo la deficion f0=0. f1=1 y fn=fn-1+fn-2 //ej el elemento 0 de fibonacci es cero, u, el elemento 1 de fibonacci es 1, el elemento 2 es 1, el elemetno 3 es 2, el elemento 4 es 3, el elemento 5 es 5, el elemento 6 es 8,el elemento 7 es 13,.......
   /* public static long calcularValorEnFibonacciEnPosicion(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return calcularValorEnFibonacciEnPosicion(n-1)+calcularValorEnFibonacciEnPosicion(n-2);
    }*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 6 inversión de una cadena:
    //Crea una función recursiva que invierta una cadena de texto.
   /* public static String invertirCadena(String cadena){
        return invertirCadena(cadena, cadena.length(), 0);
    }
      public static String invertirCadena(String cadena,int longi,int band){
        char[] cadenaAux=cadena.toCharArray();
        char primerV=cadenaAux[0];
        String cadenaN=cadena.substring(1,longi-1).concat(String.valueOf(primerV));
        if(band==longi)
        return cadenaN;
    }*///malo, esto practicamente es un intento de ir dezplanado los valores a la derecah en cad aveutla hasta volver al origianl de nuevo y no es lo que el ejerciio pide
    
   /* public static String invertirCadena(String cadena){
       char cadenaArr[]=cadena.toCharArray();
       return invertirCadena(cadenaArr,cadenaArr.length,0);
    }
    
       public static String invertirCadena(char []cadena, int longi, int band){    
       if(band==longi/2)return String.valueOf(cadena);  //y solo cadena.toString() al parcer no funcionaba porque solo me mostraba caracteres extraños en el sout
       else{                 //Arrays.toString(cadena);//esto valido pero en pantalla mostraba los corchewtes y las comas en cada separacion de cada caractaer
           char temp=cadena[band];  //logica, si la caitdad lengt es impar, sigfica que hay un elemto ekn el emdio qeu dara fijo, y por ende ese no se tocara osea seria el resultado de divir la longitud entre 2 daria un numero el cual no incluiria al valor impar del medio por ejemplo 5/2 dara 2 y no incluira al 3, significa que el 3 es el medio my no cambiara y los valores antes que se cumpliera esta condicion pues el algortimno ya los intercambia con los de arriba de 3, por ende ya  estaran intercambiados
           cadena[band]=cadena[(longi-1)-band];//pero digamos que lengt es par, pues emntopcnes todos los valores se intercambiara ya que no hay un centro fijo, osea todos los valkoresse intercambiaran, 4/2 es 2 sin ningun resto,osea no hay valor sobrante, por ende al ser para el proximo valor de 2 osea 3 , se temndra que intercambiar con este 2, ya que el 3 tampoco es el centro
           cadena[(longi-1)-band]=temp;//ahora en el caso del algoritmo recordar que slas asignaciones van desde 0 por ende se envia u  ultimo band aumentado en 1 el cual ya va con el valor equivalente al intercambio en la longitud del areglo, osea ejem´plo. enm la posicion 1 equivale al valor 2 de la longitud, osea ya se hizxo el intercambio en 2, y si este es el resultado de longi entre 2 ya sea porq es impar o par pues posi que es uno debe ser incrementadfa un valor para que coincida con 2 u el valor del lamdivsion ,longi entre 2 y asi poder validar la condicion  y detenerla recursion
           band++;
           return invertirCadena(cadena, longi, band); //y pues para valores cde longitud con un valor pues ya se valida en automaico ya que cualquier division con dividendo menor al divisor dara un real exacto 0 y pues coincidar con la nadera automatica asiganda al inciio de la recursion y y eso signifa que deolvera la cadena tal y como esta
       }
    }*/
   /*  ✅ Pros
✔️ Más eficiente en espacio y tiempo:

No crea nuevas cadenas en cada llamada recursiva.
Modifica un char[] en su lugar y solo convierte a String al final.
O(n) en tiempo y O(n) en espacio (por la pila de llamadas recursivas).
✔️ Evita la concatenación ineficiente de cadenas.
⚠️ Contras
❌ Un poco más de código:

Se necesita un char[], lo que hace que la implementación parezca más larga.
La manipulación de índices (inicio y fin) puede ser menos intuitiva al principio.*/  
       //verion mas clara
    /* public static String invertirCadena(String cadena){
       char cadenaArr[]=cadena.toCharArray();
       return invertirCadena(cadenaArr,cadenaArr.length,0);
    } */  //en realidad estamnos usando puntores inicio y final solo que no los deje calros en codigo
     //por ejemplo int longi puede ser llamado final(fin merjhor dcho ya que final es una palabra reservada de java), y bnad sera inicio, ya que en la primera llamnda es es su funcion
     //ya ya luego solo voy moviendo el inicio mas el final mno ya que yo lo dejo estatico y pues la validacion interna se encarga de ir
     //restabndoi el inicio al final asi voy asignadno en u diuferente final cada vez, pero lo podria mols deja explitiio de una vez tal yt como lo hare enla cversion de abajo de este
   /*  public static String invertirCadena(char []cadena, int longi, int band){    
       if(band==longi/2)return new String(cadena); //uan forma aun mas clara es
       else{                
           char temp=cadena[band]; 
           cadena[band]=cadena[(longi-1)-band];  
           cadena[(longi-1)-band]=temp;           //no hace falata estar mnutando band+, solo nbasta con manda band usmando uno y poues asi en cada recursion se va sumando uno
           return invertirCadena(cadena, longi, band+1);  
       }
    }*/
    public static String invertirCadena(String cadena){
       char cadenaArr[]=cadena.toCharArray(); //ahora escalreciendo bie la logica con punteros, amdnamos las posciones como fin e inciio
                                  //poer dene mandaremos la longitud menos uno
       return invertirCadena(cadenaArr,cadenaArr.length-1,0);
    }                   
    public static String invertirCadena(char []cadena, int fin, int inicio){  
        // > para casos pares e == para caso impares
       ///ya que en casos limites en los  pares el inicio al sumarse sera el antiguo fin y el fin al restarse sera el anitugo inicio  e inicio debe ser menor a fin, y al llegar al caso limites en pares pues ahora el fin sera menor e inicio mayor
       //y opara impares pues al quedar un avalor en el medio al inikcio sumarse 1 y fin restarse 1 pues en casoslimites coincidaran siendo ambos igual al valor del medio, por lo tanto habra tambie lklegado a su fin la inversion de cadena 
       if(inicio>=fin)return new String(cadena);
     char temp=cadena[fin];
     cadena[fin]=cadena[inicio];
     cadena[inicio]=temp;
     return invertirCadena(cadena, fin-1 , inicio+1);
     }
       
       
    //otra logica, cona ayufagpt                      //este int f innceseraio solo es para no confundiurme con el otro algotimo qwue permito tambnien solo una cadena
     public static String invertirCadena(String cadena, int f){    
      if(cadena.isEmpty())return cadena;
         return invertirCadena(cadena.substring(1))+cadena.charAt(0);
    }          //en esta logica en cada recursion estamos mandando un string cada vez mas corto y dejamos concatenado el valor del primer caracter que cuando llegue al caso base y coimienzze a retornar ira concatenando esto valores dejando a la ultima contcateniacion en las recursiones como primer valor y asi syucevimanete hasta volver al primer valor concatenado en la primera entrada ekl cual serria el ultimo antes de salir a devolcver ya el retrubnr final, por lo cual nos devolvera el nuevo string invertido
  //es mas corot cada vez ya qeu siempre van recortando un valor despues de la primera posicion y llegara uy opunrto donde el recxorte mas adelante habra ningun valor por lo tanto se enviara un string vacio y nes ahi donde ael caso base ¿se cumplira y comnzara los retornos de las concatenaciones                             
/*Si la prioridad es claridad y simplicidad, usa substring() + charAt(), pero ten en cuenta su ineficiencia.*/
/*❌ Ineficiencia en memoria y rendimiento:

Cada llamada a cadena.substring(1) crea una nueva cadena, lo que hace que se generen O(n) copias en memoria.
La concatenación de cadenas en Java (+) es ineficiente porque cada operación crea un nuevo objeto String.
En total, esto hace que la complejidad de tiempo sea O(n²) debido a la creación de copias y concatenaciones.*/









}