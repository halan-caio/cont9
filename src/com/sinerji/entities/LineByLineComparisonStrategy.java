package com.sinerji.entities;

import java.util.ArrayList;
import java.util.List;

import com.sinerji.entities.interfaces.ComparisonStrategy;

public class LineByLineComparisonStrategy  implements ComparisonStrategy {
	 public List<Difference> compare(List<String> fileOneLines, List<String> fileTwoLines) {
	        List<Difference> differences = new ArrayList<>();
	        int numLines = Math.min(fileOneLines.size(), fileTwoLines.size());

	        for (int i = 0; i < numLines; i++) {
	            String lineOne = fileOneLines.get(i);
	            String lineTwo = fileTwoLines.get(i);
	            if (!lineOne.equals(lineTwo)) {
	                int minLength = Math.min(lineOne.length(), lineTwo.length());
	                for (int j = 0; j < minLength; j++) {
	                    if (lineOne.charAt(j) != lineTwo.charAt(j)) {
	                        differences.add(new Difference(i + 1, j + 1, String.valueOf(lineOne.charAt(j)), String.valueOf(lineTwo.charAt(j))));
	                    }
	                }
	                if (lineOne.length() != lineTwo.length()) {
	                    int longerLength = Math.max(lineOne.length(), lineTwo.length());
	                    for (int j = minLength; j < longerLength; j++) {
	                        char charFromLonger = lineOne.length() > lineTwo.length() ? lineOne.charAt(j) : lineTwo.charAt(j);
	                        differences.add(new Difference(i + 1, j + 1, lineOne.length() > lineTwo.length() ? String.valueOf(charFromLonger) : "", lineOne.length() > lineTwo.length() ? "" : String.valueOf(charFromLonger)));
	                    }
	                }
	            }
	        }

	        return differences;
	    }

}
