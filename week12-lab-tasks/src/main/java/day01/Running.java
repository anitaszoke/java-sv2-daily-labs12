package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Running {
    public static final String SEPARATOR = " km;";

    public List<Run> read(YearMonth date) {
        List<Run> runs = new ArrayList<>();
        String line;
        String path = "src/main/resources/running.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                if (!line.contains("Kilometers")) {
                    Run run = parseLine(line);

                    if (line.contains(date.toString())) {
                        runs.add(run);
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Error by parsing, general io", ioe);
        }
        return runs;
    }

    public double monthlyRun(YearMonth date) {
        List<Run> runs = read(date);
        double sum = 0;
        for (Run r : runs) {
            sum += r.getKm();
        }
        return sum;
    }

    private Run parseLine(String line) {
        String[] fieldKm = line.split(SEPARATOR);

        if (fieldKm.length > 3) {
            throw new IllegalArgumentException("Invalid line: " + line);
        }
        if (fieldKm[0].length() == 0) {
            throw new IllegalArgumentException("Empty line:" + line);
        }
        return new Run(Double.parseDouble(fieldKm[0]), LocalDate.parse(fieldKm[1]));
    }

    public static void main(String[] args) {
        System.out.println((new Running().monthlyRun(YearMonth.of(2021,12))));
    }
}