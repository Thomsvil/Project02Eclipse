package com.hemebiotech.analytics;

import java.util.List;


public interface ISymptomReader {
	/** 
	 * m�thode pour lire les symptomes du fichier dont le chemin est stocker dans filepath
	 * @return liste des symptomes  
	 */
	List<String> getSymptoms ();
}
