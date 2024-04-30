package com.sinerji.Comparison;

import java.util.List;

import com.sinerji.Comparison.interfaces.ComparisonStrategy;

public class DifferenceFinder {
    private ComparisonStrategy strategy;
    
    public DifferenceFinder(ComparisonStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Difference> findDifferences(List<String> fileOneLines, List<String> fileTwoLines) {
        return strategy.compare(fileOneLines, fileTwoLines);
    }
}

