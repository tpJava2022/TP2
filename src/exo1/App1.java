package exo1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class App1 {
	
	static double tronque(double val,int n) {
		String s1,s2,s3;
		s1=String.valueOf(val);
		StringTokenizer st=new StringTokenizer(s1,".");
		s2=st.nextToken();
		if(st.hasMoreTokens()) {
			s3=st.nextToken();
			s3=s3.substring(0, n);
			//System.out.println(s3);
			if(s3.length()==0)
				s1=s2;
			else	s1= s2 + "." + s3;
			//s3=s3.delete(s3.length()-1 , s3.length());
		}
		val=Double.parseDouble(s1);
		
		return val;
	}

	public static void main(String[] args) {
		
		double nb = 0;
		String input;
		int n;
		
		for(int i=0;i<args.length;i+=2) {
			try {
			nb=Double.parseDouble(args[i]);
			}catch(NumberFormatException ex1) {
				System.out.println("format invalide.");
				continue;
			}
			if(args[i+1].isEmpty())continue;
			try {
			n=Integer.parseInt(args[i+1]);
			System.out.println(tronque(nb, n));
			}catch(NumberFormatException ex1) {
				System.out.println("vous devez insérer un entier.");
				continue;
			}	
		}
		/*Scanner cl=new Scanner(System.in);
		System.out.print("saisissez un double:");
		input=cl.next();
		try {
		nb=Double.parseDouble(input);
		System.out.print("le nombre à tronquer :");
		n=cl.nextInt();
		System.out.println(tronque(nb,n));
		}catch(NumberFormatException ex) {
			System.out.println("Format Invalide.");
		}*/
	}

}
