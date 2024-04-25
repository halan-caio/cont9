package com.sinerji.entities;

import java.util.List;

public class OutputFileManager {
	private static OutputFileManager instance;

	private OutputFileManager() {
	}

	public static OutputFileManager getInstance() {
		if (instance == null) {
			instance = new OutputFileManager();
		}
		return instance;
	}

	public void writeDifferencesToFile(List<Difference> differences, String outputPath) {
		// Implementar escrita no arquivo de saída
	}

}
