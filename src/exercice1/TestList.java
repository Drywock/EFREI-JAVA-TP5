package exercice1;

/**
 * 
 */

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author Thomas LINTANF
 *
 */
public class TestList {

	public static void main(String[] args) {
		
		/*
		
		//Question 1:
		List list; // Creer une reference a une variable List
		if (args.length == 0) // si le programmene recoit pas d'argument
			list = new ArrayList<String>(); // initialise la List avec une ArrayList
		else // Sinon
			list = new LinkedList<String>(); // initialise la List avec une LinkedList
		
		for(String s:args) 
			list.add(s); //Stocke les arguments dans la List
		 
		 // La LinkedList permet des insertions facilement mais est plus longue à parcourir la ou
		 // L'insertions d'élément au coeur d'une ArrayList est plus long mais l'accès est plus rapides.
		 // Cela est du à la façon dont les object sont stocker dans ces Collections.
		  
		 */
		
		//Question 2:
		// L'interface List permet de regrouper les comportements identiques des differrentes 
		// collection de type liste
		
		//Question 3:
		List list = new ArrayList<String>(); 	// initialise un object ArrayList
		Collections.addAll(list, args); 		// Stocke tout les arguments
		for(int i=0; i<list.size(); i++) {
			String s = (String)list.get(i);
			System.out.printf("%s:%d\n", s, s.length());
		} // affiche chaque argument et sa longueur dans la console
	}

}
