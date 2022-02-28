package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {

	/**
	 *  Sert a écrire dans le fichier result.out le contenue du parametre
	 * @param   map de symptom associer a son nombre d'occurence  
	 */
	public void writeSymptoms(Map<String, Integer> mSymptom) {

		try(FileWriter writer = new FileWriter ("result.out")) {

			
			for (Entry<String, Integer> entry : mSymptom.entrySet() ) {
				writer.write(entry.getKey() + " : " + entry.getValue()+ "\n");;
			} 
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
