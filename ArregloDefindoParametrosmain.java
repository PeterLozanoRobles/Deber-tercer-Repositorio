//definiendo un arreglo con parametro

public class ArregloDefindoParametrosmain {
 public static void main(String[] args){
	 
     //mostrando arreglos vacios
System.out.println("MOSTRANDO ARREGLO CON ELEMENTOS VACIOS");
ArregloDefindoParametros cerando = new ArregloDefindoParametros();
cerando.mostrar();


    //mostrando arreglos vacios modificando un elemento
System.out.println("\nMOSTRANDO ARREGLO CON ELEMENTOS VACIOS CON UN ELEMNTO MODIFICADO");
cerando.modificar(1,999);//se esta modificando el indice 1 con el alor 999
cerando.mostrar();
    
     
    
  //mostrando arreglos
System.out.println("\nMOSTRANDO ARREGLO CON PARAMETROS INDICANDO SUS INDICES Y VALORES");
ArregloDefindoParametros mostrando=new ArregloDefindoParametros(3,13);  
ArregloDefindoParametros string = new ArregloDefindoParametros();
mostrando.mostrar();
System.out.println("\nMOSTRANDO ARREGLO CON PARAMETROS USANDO TO STRING ARRAY");
mostrando.muestrastri();
   
}  
}
