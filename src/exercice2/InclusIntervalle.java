/**
 * 
 */
package exercice2;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
public class InclusIntervalle implements Condition{
	
	// Attributs
	private int inf,sup; 
	
	public InclusIntervalle(int inf, int sup) {
		super();
		this.inf = inf;
		this.sup = sup;
	}

	
	/**
	 * V�rifie si le nombre fournis est dans l'intervalle
	 * @param i nombre � tester
	 * @return true si i est dans l'intervalle, false sinon
	 */
	@Override
	public boolean verif(int i) {
		return ( i >= inf && i < sup);
	}

	
	
	/**
	 * @return la borne inf
	 */
	public int getInf() {
		return inf;
	}

	/**
	 * @return la borne sup
	 */
	public int getSup() {
		return sup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inf;
		result = prime * result + sup;
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
		InclusIntervalle other = (InclusIntervalle) obj;
		if (inf != other.inf)
			return false;
		if (sup != other.sup)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InclusIntervalle[" + inf + ";" + sup + "[";
	}
	
	
}
