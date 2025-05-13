package com.probandomemoria;

public class ProbandoMemoriaJava {
   Integer a;
   
   @Override                //EL NOMBRE DE LA variable oparametro es idndiferenfte puedo ponerle como el original de Objetct que es obj, o el de Integer y String que es anObject, da igiual esto, o le pongo un mobre mio propio tyipo objT, a la hora dela sugerencia se notar el cambio al mostrar en ayuda coimo esta implementado el metodo y ahi se vera el aprametro nombrado ocomo objT y pues ademas de otrads sugerncias se notra obviuamente cual es la implemntacion que se esta usando
   public boolean equals(Object objT){
       ProbandoMemoriaJava otro=(ProbandoMemoriaJava)objT;
       return this.a.equals(otro.a);
   }
    public static void main(String[] args) {
      /*  Integer a =562;
         Integer b =562;
         if(a==b)System.out.println("si");
         else System.out.println("no");
         
           Integer c =62;
         Integer d= 62;
         if(c==d)System.out.println("si");
         else System.out.println("no");*/
    
    ProbandoMemoriaJava p1=new ProbandoMemoriaJava();
    ProbandoMemoriaJava p2=new ProbandoMemoriaJava();
    
      String sfwf="sfsff";
      String jfjfjf="sfasf";
    //if(sfwf.equals(jfjfjf));
    //  if(p1.a.equals(p2.a));ambos equals son implementaciones diferentes en Integer y String
    p1.a=9999;
    
        System.out.println(p1.a);
        System.out.println(p2.a);
        p2.a=9999;
        //no usar preferiblemente, NO
        //p2.finalize();//NO, depredcado, no y no
        System.out.println("********************");
             System.out.println(p1.a);
        System.out.println(p2.a);
         //implementanbdo nuestro propio equials osea soibreecribniendo ´podremois comparar por valor
         //ya que si hacemos
         //if((p1.a).equals((p2.a)))System.out.println("si");//si Integer no implemntara equals entonces aca esdtaria usandose la implentacion que esta en object la cual es seguir comparando referencias,y daria no, asi que tocrai hacer  un impementacion en nuestra calse como la que prosigue
         //es una forma de velo, usaremos nada mas p1 y p2 para ver que en nuetra porpia clase no tenemos impmentecaion de equals y veremos como no nos compara por valor
         if(p1.equals(p2))System.out.println("si");//cuando ya agreguemos nuestra proipia implementacon esto dara si
         //if(p1.a==p2.a)System.out.println("si");//recordar si en a, sus valores fueran dentro del rango -128 a 127 om algo asi mas o menos, esto dara si, ya valores en ese rango se cran en integfer cahce asi los objetos que tengan ese mismo valore a puntan a una sola direccion de memoria
         else System.out.println("no");  //ahora si es mayor a ese rango, pues se crearan objetos en el heap , por lo cual daria no, ya que serian 2 objetos ttalmente diferentes, ya qyue aunque seanm valores iguales, pues se crarn como nuevos objetos tal y como usar un operador new, serian direcciones de memoria difrentes lamacenadas enla referencia
    }  //ahora usando un a variable primitiva como int pues ya esto pues se compara por valor , asi que si son iguales siemrpe dsara si
}
