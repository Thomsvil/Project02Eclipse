package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public void analyse() {
		
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> lSymptom = reader.getSymptoms();
		
		ISymptomsCounter counter = new SymptomsCounter();
		Map<String, Integer> mSymptom = counter.countSymptoms(lSymptom);
		
		ISymptomWriter writer = new WriteSymptomDataToFile();
		writer.writeSymptoms(mSymptom);
		
		
	}
}
