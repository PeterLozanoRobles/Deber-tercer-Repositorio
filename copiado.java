import java.util.*;
public class copiado{
	public static void main (String args[]){
		int x[]=new int[4];
		int y[]=new int[3];
		for (int x=0;x<y.length;x++)
        y[x] = y[x];

		System.arraycopy(x,y,x.length);
		System.out.println(x);

}}