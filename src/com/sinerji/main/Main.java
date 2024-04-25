package com.sinerji.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.sinerji.entities.Difference;
import com.sinerji.entities.DifferenceFinder;
import com.sinerji.entities.FileReaderFactory;
import com.sinerji.entities.LineByLineComparisonStrategy;
import com.sinerji.entities.OutputFileManager;
import com.sinerji.entities.interfaces.CSVFileReader;

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
