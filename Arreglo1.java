import java.util.Arrays;
public class Arreglo1{
int[] Cadena;
Arreglo1(){
	Cadena=new int[15];
}
Arreglo1(int tamanio){
	Cadena=new int[tamanio];
}
void modificar (int indice,int valor){
   Cadena[indice]=valor;
}
void muestraFor(){
	for(int i=0;i<Cadena.length;i++)
		System.out.println(Cadena[i]);
}
void muestraItem(){//lo mismo que muestraFor 
	for(int i : Cadena)
		System.out.print(i);
}
void muestraString(){
	System.out.println(Arrays.toString(Cadena));
	//toString metodo pertenerse a la clase Arreglos
	System.out.println(Cadena.toString());
}}