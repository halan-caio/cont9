package com.sinerji.entities.interfaces;

import java.util.List;

import com.sinerji.entities.Difference;

public interface ComparisonStrategy {

	List<Difference> compare(List<String> fileOne, List<String> fileTwo);
}
