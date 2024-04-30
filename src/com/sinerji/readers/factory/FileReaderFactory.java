package com.sinerji.readers.factory;

import com.sinerji.readers.ContimaticFileReader;
import com.sinerji.readers.SPEDFileReader;
import com.sinerji.readers.interfaces.CSVFileReader;

public class FileReaderFactory {
	public static CSVFileReader getReader(String fileType) {
		if (fileType.equalsIgnoreCase("SPED")) {
			return new SPEDFileReader();
		} else if (fileType.equalsIgnoreCase("Contimatic")) {
			return new ContimaticFileReader();
		} else {
			throw new IllegalArgumentException("Unknown file type");
		}
	}
	
}
