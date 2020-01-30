public class Gerente extends Empleado{

String departamento;

Empleado(String nomb,String puesto,String departamento){
super(nombre,puesto);
this.departamento=departamento;
}
public void mostrar(){
}
System.out.println(this.departamento);
}

