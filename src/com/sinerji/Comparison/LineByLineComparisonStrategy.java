package com.sinerji.Comparison;

import java.util.ArrayList;
import java.util.List;

import com.sinerji.Comparison.interfaces.ComparisonStrategy;

public class LineByLineComparisonStrategy implements ComparisonStrategy {
	public List<Difference> compare(List<String> fileOneLines, List<String> fileTwoLines) {
		List<Difference> differences = new ArrayList<>();
		int numLines = Math.min(fileOneLines.size(), fileTwoLines.size());

		// Verifica se as linhas são diferentes
		for (int i = 0; i < numLines; i++) {
			String[] lineOne = fileOneLines.get(i).split("\\|");
			String[] lineTwo = fileTwoLines.get(i).split("\\|");
			if (!lineOne.equals(lineTwo)) {
				int minLength = Math.min(lineOne.length, lineTwo.length);
				
				// Verifica se os elementos das linhas são diferentes
				for (int j = 0; j < minLength; j++) {
					if (!lineOne[j].equals(lineTwo[j]) && !areEquals(lineOne[j], lineTwo[j]) 
							&& !areEqualDouble(lineOne[j], lineTwo[j])) {
						differences.add(
								new Difference(lineOne[1], j, String.valueOf(lineOne[j]), String.valueOf(lineTwo[j])));
					}
				}

// ------------ Caso alguma linha seja maior que a outra.
//				if (lineOne.length != lineTwo.length) {
//					int longerLength = Math.max(lineOne.length, lineTwo.length);
//					for (int j = minLength; j < longerLength; j++) {
//						String charFromLonger = lineOne.length > lineTwo.length ? lineOne[j]
//								: lineTwo[j];
//						differences.add(new Difference(lineOne[1], j,
//								lineOne.length > lineTwo.length ? String.valueOf(charFromLonger) : "",
//								lineOne.length > lineTwo.length ? "" : String.valueOf(charFromLonger)));
//					}
// ------------ }
			}
		}

		return differences;
	}

	private boolean areEquals(String SPEDFileData, String ContimaticFileData) {
		if ((SPEDFileData.equals("") && ContimaticFileData.equals("0"))
				|| (ContimaticFileData.equals("") && SPEDFileData.equals("0"))) {
			return true;
		}
		return false;
	}
	
	private boolean areEqualDouble(String str1, String str2) {
		try {
	        // Convertendo as strings em números double
	        double num1 = Double.parseDouble(str1.replace(',', '.'));
	        double num2 = Double.parseDouble(str2.replace(',', '.'));

	        // Comparando os números com uma pequena tolerância
	        double tolerance = 0.000001;
	        return Math.abs(num1 - num2) < tolerance;
	    } catch (NumberFormatException e) {
	        // Se as strings não puderem ser convertidas em números double, elas são consideradas diferentes
	        return false;
	    }
	}

}
