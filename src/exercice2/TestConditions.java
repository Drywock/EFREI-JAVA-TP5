/**
 * 
 */
package exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Gabriel RIBIER, Thomas LINTANF
 *
 */
public class TestConditions {
	
	/**
	 * Remplit une liste avec n entiers aleatoires
	 * @param list liste a remplir
	 * @param n nombre d'entier a mettre
	 */
	public static void remplitAlea(List list, int n) {
		
		Random rnd = new Random();
		
		for(int cpt = 0; cpt < n; cpt++) {
			list.add(rnd.nextInt(50) + 1);
		}
		
	}
	
	/**
	 * Compte le nombre de fois ou la condition est dans l'etat attendue
	 * @param list liste a tester
	 * @param test condition a tester
	 * @param bool resultat attendu du test
	 * @return nombre de fois ou on obtient le resultat attendu
	 */
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
			System.err.println("ERREUR 1 : Il n'y a pas d'argument");
			System.exit(1);
		}
		else {
			if(args.length > 1) {
				System.out.println("argument ignore");
			}
			String arg1 = args[0];
			
			int n = 0;
			try{
				n = java.lang.Integer.parseInt(arg1);
			}
			catch(NumberFormatException e) {
				System.err.println("ERREUR 2 : L'argument n'est pas un nombre");
				System.exit(1);
			}
			
			List list = new ArrayList();
			remplitAlea(list, n);
			Pair test1 = new Pair();
			SuperieurA test2 = new SuperieurA(25);
			InclusIntervalle test3 = new InclusIntervalle(10,35);
			Condition[] conditions = {test1, test2, test3};
			for(Condition condition : conditions) {
				int vrai = compte(list, condition, true);
				System.out.println(condition + ": " + vrai + "V+" + (n-vrai) + "F");
			}
		}
	}

}
