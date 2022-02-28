package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomsCounter {
	/** 
	 * Méthode de comptage des occurences de Lsymptom 
	 * @param lSymptom liste des symptomes
	 * @return map de symptom associer a son nombre d'occurence  
	 */
	public Map<String, Integer> countSymptoms(List<String> lSymptom);

}
