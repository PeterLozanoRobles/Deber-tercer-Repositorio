//definiendo un arreglo con parametro

import java.util.Arrays;
public class ArregloDefindoParametros {
 
//arreglo a crear
int[]cadena;

//constructor
ArregloDefindoParametros(int tamañoIndice, int valor)
{
cadena=new int[tamañoIndice];
for(int i=0;i<cadena.length;i++)
cadena[i]=valor;
}//fin constructor


//llenando arreglos con 0
ArregloDefindoParametros(){
cadena=new int[10];
}//fin llenados con 0


//metodo mostrar
public void mostrar()
{
for(int i=0;i<cadena.length;i++)
System.out.println("indice " +i +") "  + cadena[i]);
}//fin metodo mostrar


//metodo modificar
public void modificar(int indicemodificar, int valormodificar){
    cadena[indicemodificar]=valormodificar;
}//fin modificar


void muestrastri(){
System.out.println(Arrays.toString(cadena));
}








}//FIN
        
        


    
 

      
    
    

