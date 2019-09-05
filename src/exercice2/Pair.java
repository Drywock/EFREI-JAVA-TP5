/**
 * 
 */
package exercice2;

/**
 * @author Thomas LINTANF
 *
 */
public class Pair implements Condition {
	
	
	public Pair() {} // Constructeur par defaut
	
	
	/**
	 * Test la parité
	 * @param i le nombre à tester
	 * @return true si i est pair, false sinon
	 */
	@Override
	public boolean verif(int i) {
		return i%2 == 0;
	}

	@Override
	public String toString() {
		return "(Pair)";
	}
	
	
}
