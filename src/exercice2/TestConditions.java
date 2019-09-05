/**
 * 
 */
package exercice2;

import java.util.List;
import java.util.Random;

/**
 * @author Gabriel RIBIER
 *
 */
public class TestConditions {
	
	public static void remplitAlea(List list, int n) {
		
		Random rnd = new Random();
		
		for(int cpt = 0; cpt < n; cpt++) {
			list.add(rnd.nextInt(50) + 1);
		}
		
	}
	
	public static int compte(List list, Condition test, boolean bool) {
		
		int cpt = 0;
		
		for(Object i : list) {
			if(test.verif((int) i) == bool) {
				cpt++;
			}
		}
		
		return cpt;
	}
	
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("ERREUR 1 : Il n'y a pas d'argument");
			System.exit(1);
		}
		else {
			if(args.length > 1) {
				System.out.println("argument ignore");
			}
			String arg1 = args[0];
			
			int n = java.lang.Integer.parseInt(arg1);
			
			if(n == null) {
				System.out.println("ERREUR 2 : Il n'y a pas d'entier correct dans le premier argument");
			}
			else {
				List list = new List();
				remlpitAlea(list, n);
			}
		}
	}

}
