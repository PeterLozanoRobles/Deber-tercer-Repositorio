import java.util.Date;

public class Empleado{

private String nombre;
public String puesto;
private Date fecha;

Empleado(String nombre,String puesto){
this.nombre=nombre;
fecha=new Date();
this.puesto=puesto;
}
public void mostrar(){
System.out.println(nombre);
System.out.println(puesto);
System.out.println(fecha);
}

public void setnombre(String nombre){
this.nombre=nombre;
}
}