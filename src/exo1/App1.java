package exo1;

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
		System.out.println(tronque(15.77777,1));

	}

}
