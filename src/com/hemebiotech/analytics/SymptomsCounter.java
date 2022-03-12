package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter implements ISymptomsCounter{
/** 
 * Méthode de comptage des occurences de Lsymptom 
 * @param lSymptom liste des symptomes
 * @return map de symptom associer a son nombre d'occurence  
 */
	public Map<String, Integer> countSymptoms(List<String> lSymptom) {
		
		Map<String, Integer> mSymptom = new TreeMap<>();
	
		for ( String symptom : lSymptom ) {
			symptom = symptom.trim().toLowerCase();
			if( mSymptom.containsKey(symptom) ) {
				
				int nbOccur = mSymptom.get(symptom);
				mSymptom.put(symptom,nbOccur+1);
				
			} else {
				mSymptom.put(symptom, 1);
			}
			
		}

		return mSymptom;
	}
}
