import java.util.Scanner;
public class Fecha
{
	public static int bandera=0,dia,mes,anio;
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String arg[])
	{
		System.out.print("INGRESE EL ANIO: ");
		anio=teclado.nextInt();
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
		{ 
			bandera = 1;
			ingreso();
		}
		else
		{
			ingreso();
		}
		mostrar();
	}
	
	public static void ingreso()
	{
		do 
		{
			System.out.print("INGRESE EL MES: ");
			mes=teclado.nextInt();
		}while(mes<1 || mes>12);
		if (mes==2)
		{
			if(bandera==1)
			{
				do
				{
					System.out.print("INGRESE EL DIA: ");
					dia=teclado.nextInt();
				}while(dia<1 || dia>29);
			}
			else
			{
				do
				{
					System.out.print("INGRESE EL DIA: ");
					dia=teclado.nextInt();
				}while(dia<1 || dia>28);
			}
		}
		else
		{
			if (mes==4 || mes==6 || mes==9 || mes==11)
			{
				do
				{
					System.out.print("INGRESE EL DIA: ");
					dia=teclado.nextInt();
				}while(dia<1 || dia>30);
			}
			else 
			{
				do
				{
					System.out.print("INGRESE EL DIA: ");
					dia=teclado.nextInt();
				}while(dia<1 || dia>31);
			}
		}
	}

	public static void mostrar()
	{
		System.out.println("La fecha actual es: " + dia + "/" + mes + "/" + anio);
		if(mes==2)
		{
			if(bandera==1)
			{
				if(dia==29)
				{
					dia=1; mes++;
				}
				else
					dia++;
			}
			else
			{
				if(dia==28)
				{
					dia=1; mes++;
				}
				else
					dia++;
			}
		}
		else if (mes==4 || mes==6 || mes==9 || mes==11)
		{	
			if (dia==30)
			{	
				dia=1; mes++;
			}
			else
				dia++;
		}
		else 
		{	
			if (dia==31)
			{	
				dia=1; mes++; 
				if(mes==13)
				{
					mes=1; anio++;
				}
			}
			else
				dia++;
		}
		System.out.print("La fecha siguiente es: " + dia + "/" + mes + "/" + anio);
	}
	
}