package exo2;

import java.util.Scanner;

public class EssaiTriSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TriSimple ts=new TriSimple();
		Scanner cl=new Scanner(System.in);
		int choix;
		int elem;
		
		while(true) {
			System.out.println("1-inserer un �l�ment.");
			System.out.println("2-suprimer un �l�ment.");
			System.out.println("3-quiter");
			System.out.print("saisissez un choix :");
			choix=cl.nextInt();
			switch (choix) {
			case 1: {
				System.out.print("saisissez un �l�mennt � ins�rer :");
				elem=cl.nextInt();
				ts.insert(elem);
				System.out.println(ts);
				break;
			}
			case 2:{
				System.out.print("saisissez un �l�mennt � supprimer :");
				elem=cl.nextInt();
				ts.remove(elem);
				System.out.println(ts);
				break;
			}
			case 3:
				return;
			default:
				System.out.println("choix invalide.");
			}
		}
		
//		ts.insert(4);
//		ts.insert(2);
//		ts.insert(1);
//		ts.insert(3);
//		
//		ts.remove(3);
//		ts.remove(1);
//		
//		System.out.println(ts.getSize());
		
		//System.out.println(ts);

	}

}
