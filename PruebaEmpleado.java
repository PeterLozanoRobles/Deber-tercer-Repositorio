import java.util.Scanner;
public class PruebaEmpleado{
public static void main(String args[]){

Gerente prueba=new Gerente("Lady","Estudiante","Ug");
prueba.muestra_gerente();
//MOSTRABA DATOS DE UNA PERSONA
System.out.println(prueba.puesto);

//COMIENZO DE LA SEGUNDA PERSONA
System.out.println("Ingrese un nuevo nombre: ");

//Scanner se usa siempre y cuando se vaya a ingresar datos
Scanner nomb = new Scanner(System.in);
prueba.setNombre(nomb.nextLine());

System.out.println("Ingrese un nuevo puesto: ");
Scanner puesto = new Scanner(System.in);
prueba.setPuesto(puesto.nextLine());
prueba.muestra_gerente();
}}