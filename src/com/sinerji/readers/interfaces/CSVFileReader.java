package com.sinerji.readers.interfaces;

import java.util.List;

public interface CSVFileReader {
	List<String> readLines(String filePath);
}
