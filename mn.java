import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mn {
public static void main(String args[]){
	int n;
	int m;
	int k;
	String x = null;
	String y = null;
	System.out.println("enter a number");
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader(i);
	try {
		 x = b.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("IO exception has occured");
		e.printStackTrace();
	}
	n = Integer.parseInt(x);
	System.out.println("enter a number");
	InputStreamReader i1 = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(i1);
	try {
		 y = b1.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("IO exception has occured");
		e.printStackTrace();
	}
	m = Integer.parseInt(y);
	for ( k = 0 ; k<= m ; k++){
		int j = k*n;
		System.out.println(n + " * " + k + " = " +j);
		
	}
	
}
}
