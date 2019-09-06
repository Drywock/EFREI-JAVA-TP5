/**
 * 
 */
package exercice2;

/**
 * @author Gabriel RIBIER, Thomas LINTANF
 *
 */
public class SuperieurA implements Condition{
	
	//Attributs
	private int ref;
	
	//Constructeur avec 1 argument
	public SuperieurA(int number) {
		ref = number;
	}

	/**
	 * @return the ref
	 */
	public int getRef() {
		return ref;
	}

	@Override
	public String toString() {
		return "SuperieurA(" + ref + ")";
	}
	
	@Override
	public boolean verif(int i) {
		return i > ref;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ref;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperieurA other = (SuperieurA) obj;
		if (ref != other.ref)
			return false;
		return true;
	}

}
