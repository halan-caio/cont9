package com.sinerji.Comparison.interfaces;

import java.util.List;

import com.sinerji.Comparison.Difference;

public interface ComparisonStrategy {
	List<Difference> compare(List<String> fileOne, List<String> fileTwo);
}
