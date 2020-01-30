import java.util.Scanner;
public class Matriz 
{
	public static double [] [] A;
    public static void main(String[] args) 
    {
		int x,y;
		double val_min, val_max;
        Scanner teclado = new Scanner(System.in);
        do { System.out.print("Ingrese numero de filas: ");
        x = teclado.nextInt(); }while(x<1);
		do { System.out.print("Ingrese numero de columnas: ");
        y = teclado.nextInt(); }while(y<2);
		do { System.out.print("Ingrese valor minimo: ");
        val_min = teclado.nextDouble(); }while(val_min<0);
		do { System.out.print("Ingrese valor maximo: ");
        val_max = teclado.nextDouble(); }while(val_max<=val_min);
		crearMatriz(x,y,val_min,val_max);
		mostrarMatriz(x,y);
    }
    public static void crearMatriz(int x, int y, double min, double max)
    {
		int i=0, j=0;		//j son las columnas; i son las filas
		A = new double [x][y];
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
				A[i][j] = Math.random()*(max-min)+ min;
		}
    }
	public static void mostrarMatriz(int x, int y)
    {
		int i=0, j=0;
		for(i=0;i<x;i++)
		{	System.out.println("");
			for(j=0;j<y;j++)
				System.out.print(A[i][j] + "\t");
		}
    }
}