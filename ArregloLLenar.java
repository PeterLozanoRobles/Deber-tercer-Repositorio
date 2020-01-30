//llenar un arreglo y buscar un elemento
import java.util.Scanner;
public class ArregloLLenar {
Scanner entrada = new Scanner(System.in);

 //metodo llenar
public void llenar(){
int nElementos;
//pidiendon tamaño del arreglo
System.out.print("INGRESE CANTIDAD DE ELEMENSTO DEL ARREGLO : ");
nElementos=entrada.nextInt();
//creando arreglo
int numeros[]=new int[nElementos];
//pedir elementos del arreglo
for(int i=0;i<nElementos;i++){
    System.out.print(i+1 +" INGRESE NUMERO : ");  
    numeros[i]=entrada.nextInt();
	}
//mostrando datos
System.out.println("ARREGLO ES : ");
for(int i=0;i<nElementos;i++){
    System.out.println( (i) +") " +numeros[i]);
	}

//BUSCANDO ELEMENTO DEL ARREGLO
    int i = 0,buscado;
   System.out.print("INGRESE NUMERO A BUSCAR : ");
buscado= entrada.nextInt();
while(i<nElementos && numeros[i]<buscado){ 
 i++;
 }
if(i==nElementos){System.out.println("NUMERO NO ENCONTRADO , SE RECORRIO TODO EL ARREGLO");}   
else{
	if(numeros[i]==buscado)
							{
		System.out.println("NUMERO ENCONTRADO EN LA POSICION " +i);
							}
    else{System.out.println("NUMERO NO ENCONTRADO");
		}    
} //fin if 
}//fin metodo llenar
}  

