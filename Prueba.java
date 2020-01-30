import java.util.Arrays;
public class Prueba{
public static void main(String args [])
{
Arreglo1 dato=new Arreglo1();
Arreglo1 cadena1=new Arreglo1(22);
dato.modificar(1,31);
cadena1.modificar(1,5);
dato.muestraFor();
cadena1.muestraFor();
dato.muestraItem();
cadena1.muestraItem();
dato.muestraString();
cadena1.muestraString();
//Comparar arreglos tanto en contenido, tamaño y orden
if(Arrays.equals(dato.Cadena,cadena1.Cadena))
    System.out.println("Iguales");
else
	System.out.println("Diferente");
}}