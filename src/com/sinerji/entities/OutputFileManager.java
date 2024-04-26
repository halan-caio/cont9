package com.sinerji.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (Difference diff : differences) {
                writer.write(diff.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
