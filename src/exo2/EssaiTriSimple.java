package exo2;

public class EssaiTriSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TriSimple ts=new TriSimple(5);
		ts.insert(4);
		ts.insert(2);
		ts.insert(1);
		ts.insert(3);
		
		ts.remove(3);
		ts.remove(1);
		
		System.out.println(ts.getSize());
		
		System.out.println(ts);

	}

}
