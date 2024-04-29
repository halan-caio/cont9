package com.sinerji.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sinerji.entities.interfaces.CSVFileReader;

public class ContimaticFileReader implements CSVFileReader {
    public List<String> readLines(String filePath) {
    	List<String> lines = new ArrayList<>();
		final String[] PREFIXES = { "|0000|", "|C100|", "|C190|", "|D100|", "|D190|" };

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				// Verifica se a linha começa com algum dos prefixos desejados
				boolean validLine = false;
				for (String prefix : PREFIXES) {
					if (line.startsWith(prefix)) {
						validLine = true;
						break; // Não é necessário verificar outros prefixos
					}
				}
				if (validLine) {
					lines.add(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lines;
    }
}