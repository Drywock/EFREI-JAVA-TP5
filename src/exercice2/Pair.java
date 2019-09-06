/**
 * 
 */
package exercice2;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
public class Pair implements Condition {
	
	
	public Pair() {} // Constructeur par defaut
	
	
	/**
	 * Test la parit�
	 * @param i le nombre � tester
	 * @return true si i est pair, false sinon
	 */
	@Override
	public boolean verif(int i) {
		return i%2 == 0;
	}

	@Override
	public String toString() {
		return "Pair";
	}
	
	
}
