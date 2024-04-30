package com.sinerji.Comparison;

import java.util.ArrayList;
import java.util.List;

import com.sinerji.Comparison.interfaces.ComparisonStrategy;

public class LineByLineComparisonStrategy implements ComparisonStrategy {
	public List<Difference> compare(List<String> fileOneLines, List<String> fileTwoLines) {
		List<Difference> differences = new ArrayList<>();
		int numLines = Math.min(fileOneLines.size(), fileTwoLines.size());
		
		for (int i = 0; i < numLines; i++) {
			String[] lineOne = fileOneLines.get(i).split("\\|");
			String[] lineTwo = fileTwoLines.get(i).split("\\|");
			if (!lineOne.equals(lineTwo)) {
				int minLength = Math.min(lineOne.length, lineTwo.length);
				for (int j = 0; j < minLength; j++) {
					if (!lineOne[j].equals(lineTwo[j])) {
						differences.add(new Difference(lineOne[1], j,
								String.valueOf(lineOne[j]), String.valueOf(lineTwo[j])));
					}
				}
				if (lineOne.length != lineTwo.length) {
					int longerLength = Math.max(lineOne.length, lineTwo.length);
					for (int j = minLength; j < longerLength; j++) {
						String charFromLonger = lineOne.length > lineTwo.length ? lineOne[j]
								: lineTwo[j];
						differences.add(new Difference(lineOne[1], j,
								lineOne.length > lineTwo.length ? String.valueOf(charFromLonger) : "",
								lineOne.length > lineTwo.length ? "" : String.valueOf(charFromLonger)));
					}
				}
			}
		}

		return differences;
	}

}
