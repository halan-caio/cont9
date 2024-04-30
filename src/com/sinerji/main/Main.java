package com.sinerji.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.sinerji.Comparison.Difference;
import com.sinerji.Comparison.DifferenceFinder;
import com.sinerji.Comparison.LineByLineComparisonStrategy;
import com.sinerji.output.OutputFileManager;
import com.sinerji.readers.factory.FileReaderFactory;
import com.sinerji.readers.interfaces.CSVFileReader;

public class Main {

	public static void main(String[] args) {
        String spedFile = args[0];
        String contimaticFile = args[1];

        CSVFileReader spedReader = FileReaderFactory.getReader("SPED");
        CSVFileReader contimaticReader = FileReaderFactory.getReader("Contimatic");

        List<String> spedLines = spedReader.readLines(spedFile);
        List<String> contimaticLines = contimaticReader.readLines(contimaticFile);

        DifferenceFinder finder = new DifferenceFinder(new LineByLineComparisonStrategy());
        List<Difference> differences = finder.findDifferences(spedLines, contimaticLines);

        OutputFileManager outputFileManager = OutputFileManager.getInstance();
        outputFileManager.writeDifferencesToFile(differences, "Resultado" + getCurrentDateTime() + ".txt");
    }

    private static String getCurrentDateTime() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }
}
