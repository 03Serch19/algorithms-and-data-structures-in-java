package com.busqueda;

public class BusquedaBinaria {
    public static void main(String[] args) {
            int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
            21, 22, 23, 24, 25, 26, 27,28,29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
            41, 42, 43, 44, 45, 46, 47, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
            61, 62, 63, 64, 65, 66, 67, 68,69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 95, 96, 97, 98, 99, 100};
         
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
              
          /*  int indiceDelValorEncontrado=binarySearch(m5,305);  
            System.out.println(indiceDelValorEncontrado);   */
            
            
      long startTime = System.nanoTime();
     int indiceDelValorEncontrado=binarySearch(m5, 300);  
    long endTime = System.nanoTime();

    System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " nanosegundos");
                
    }
        //version recursiva, ya mnas clara/y conceptualemnte mas calra con las dos recurividades en la funciion aunque en pila podra ser menoseficiente a cmo lo hice abajo con una sola recursion al final de la funcion, aun asi la forma estandar es coniteratividad pura,sin usar recursion
    /*static int binarySearch(int arr[],int valorABuscar){       
       return binarySearch(arr, valorABuscar,0,arr.length-1);
    }
    
       static int binarySearch(int arr[],int valorABuscar,int izquierdo, int derecho){       
         if(izquierdo>derecho)return -(izquierdo+1);
         int medio=izquierdo+(derecho-izquierdo)/2;
         if(arr[medio]==valorABuscar)return medio;
         else if(arr[medio]>valorABuscar){
               return binarySearch(arr, valorABuscar, izquierdo,medio-1);
         }else{
             return binarySearch(arr, valorABuscar, medio+1, derecho);
         }          
    }*/
   /*  static int binarySearch(int arr[],int valorABuscar,int izquierdo, int derecho){       
         if(izquierdo>derecho)return -(izquierdo+1);
         int medio=izquierdo+(derecho-izquierdo)/2;
         if(arr[medio]==valorABuscar)return medio;
         else if(arr[medio]>valorABuscar){
             derecho=medio-1;
         }else{
             izquierdo=medio+1;
         }       
         return binarySearch(arr, valorABuscar, izquierdo,derecho);//con una sola llamda optimizamos mas ya qeu es una recursion de cola(se ejecuta al dfifianl de la recursion, por tanto no tendra que estar retornando a vaciar la funcion si aun quedaran elementos por ejecutarse, algo qeu si pasara copn la vesion qeu dejare arriba, pero con la version de arriba se apliica la logica de manera mas natural a lo que s la recursividad, ya que su base es dividir yu toimar su porpio camino, y en etsa forma lo estamos manejando
    }*/ //Desventaja: No es tan claro en términos de estructura de control, porque parece iterativo, aunque sigue siendo recursivo.
     
     
     
    //version recursiva, ny me
   /* static int binarySearch(int arr[],int valorABuscar){       
       return binarySearch(arr, valorABuscar,0,(arr.length-1)/2,arr.length-1);
    }
     static int binarySearch(int arr[],int valorABuscar,int izquierdo, int medio,int derecho){       
         if(izquierdo>derecho)return -(izquierdo+1);
         if(arr[medio]==valorABuscar)return medio;
         else if(arr[medio]>valorABuscar){
             derecho=medio-1;
         }else{
             izquierdo=medio+1;
         }
             medio=izquierdo+(derecho-izquierdo)/2;
         
         return binarySearch(arr, valorABuscar, izquierdo, medio, derecho);
    } */
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////version quitando los comentarios, en su foirma estandar
    static int binarySearch(int arr[],int valorABuscar){
        int ini=0,fin=arr.length-1;       
       int medio=0; 
        while (ini<=fin) {            
            medio=ini+(fin-ini)/2;          
            if(arr[medio]==valorABuscar)return medio;
            else if(arr[medio]>valorABuscar){
                fin=medio-1;
            }else{
                ini=medio+1;    
            }          
        }  
        return -(ini+1); //asi lo maneja tambien el metodo binarySearch de java
      }
    
    

      
    //funcionando con retornoi personalizado y estandar tal yu como binarysearch de ajva lo hace, retronadno en caso no encutre un negativo el cual al oiperarse con la operacion que lo devuelve obtenermos el indice positivo en el cual deberiia ir el elemento no encontrado
     /* static int binarySearch(int arr[],int valorAbuscar){
        int ini=0,fin=arr.length-1;       
       int medio=0; 
        while (ini<=fin) {            
            medio=ini+(fin-ini)/2;          
            if(arr[medio]==valorAbuscar)return medio;
            else if(arr[medio]>valorAbuscar){
                fin=medio-1;
            }else{
                ini=medio+1;     //ini nos indicara en todo momento el valor del indice donde deberia ir el valor en el areglo
            }          
        }  
         //return (-ini-1);tambien funciona esto 
         // return -(ini-1);//con menos es un valor malo, ya que osea nos ayuda la idea pero para el valor de cero no funcionaria y me devolvceria un 1 positivo que si , es valido ya qeu al pasaralo a la operacion inversa se conviere a cero de nuevo pero pues es malo en el hecho que es un 1 positivo y por tanto indica qeu si existe el valor,y no es asi, deberia devoler cuando no se encuentra todos los valores negativos, asi por tanto se hace la formad e abajo qeu es la fomula para logarr estocon todos los valores
        return -(ini+1);//formula matematica que me garantixza enciar un valor negativo y asu vez al aplicar en de nuevo la msima formula aeste valor obetner el valor de ini el cual es la posion donde debrai insertarse
       //  return ~ini;//esto tambien logra este efeto por la forma en qeu este operador funciona vbit a bit, pero pues mejor usar la expresion arimetcia que es ma intiuituva ´para el fgin del algoritmo, y asi no usar este operador el cual se usa para otro tiipo de tareas 
      }*/
    
      /**
       * ✔️ Si el tamaño es impar, la fórmula (izquierda + derecha) / 2 escoge el valor central exacto.
✔️ Si el tamaño es par, elige el elemento más a la izquierda por defecto.
       */
       
    //version, le queitamos un par de lineas redundantes, asi dejamosuna sola linea para calcular el medio
    /*static int binarySearch(int arr[],int valorAbuscar){
        int ini=0,fin=arr.length-1;       
       int medio=0; 
        while (ini<=fin) {            
            medio=ini+(fin-ini)/2;
            
            if(arr[medio]==valorAbuscar)return medio;
            else if(arr[medio]>valorAbuscar){
                fin=medio-1;
            }else{
                ini=medio+1;
            }          
        }  
  
        return -1;
    }*/
    
    //version que retorna -1 si no lo encuentra
    /*static int binarySearch(int arr[],int valorAbuscar){
        int ini=0,fin=arr.length-1;
        //int medio=(fin+ini)/2; //matematicamente esta forma calcula el medio y es equivalente a la forma en que se restan y se diuvide en 2 y luego se suma al inicio, pero para en java u algun lenguaje de programcon, en la version de mumas corremos el riesgo de que si nuestro areglo es muy grande, puede que esa suma execda y provoque und esboradamiento, por lo tatno nos arruinaroia nuetra logica yu valores ya que al desbordarse debvuelve valores negativos, lo cual ya arruina la logica
       int medio=ini+(fin-ini)/2; //por esllo usaremos la version donde se restan asi nos aseguraemos de no desordar, ya qeu la difecenia siempre sera un nuemro menor al fin y menor o igual en algunos casos a inicio
        while (ini<=fin) {            
            
            if(arr[medio]==valorAbuscar)return medio;
            else if(arr[medio]>valorAbuscar){
                fin=medio-1;
                medio=ini+(fin-ini)/2;
            }else{
                ini=medio+1;
                medio=ini + (fin-ini)/2;
            }          
        }  
  
        return -1;
    }*/
}
