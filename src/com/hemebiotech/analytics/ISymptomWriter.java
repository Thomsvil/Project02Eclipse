package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomWriter {
	/**
	 *  Sert a écrire dans le fichier result.out le contenue du parametre
	 * @param   map de symptom associer a son nombre d'occurence  
	 */
	public void writeSymptoms(Map<String, Integer> mSymptom);
}
