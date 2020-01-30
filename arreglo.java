import java.util.*;
public class arreglo{
public static void main(String args[]){
 int[] x = new int [8];
System.out.println("nuemeros aleatorios");
for(int i=0; i<8; i++)
x[i] = (int) (Math.random()*15);
System.out.println(Arrays.toString(x));

System.out.println("ascendente");
Arrays.sort(x);
System.out.println(Arrays.toString(x));

System.out.println("descendente");
for(int i=x.length-1; i>=0; i--){
System.out.println(x[i]);
}
}}