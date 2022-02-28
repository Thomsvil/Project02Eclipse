package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}
	
	/** 
	 * m�thode pour lire les symptomes du fichier dont le chemin est stocker dans filepath
	 * @return liste des symptomes  
	 */
	@Override
	public List<String> getSymptoms() {
		
		List<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
				
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
