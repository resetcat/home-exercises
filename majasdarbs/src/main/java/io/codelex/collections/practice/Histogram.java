package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        List<Integer> scoreList = Arrays.stream(scores.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<StringBuilder> histogram = new ArrayList<>();
        histogram.add(new StringBuilder("00-09: "));
        histogram.add(new StringBuilder("10-19: "));
        histogram.add(new StringBuilder("20-29: "));
        histogram.add(new StringBuilder("30-39: "));
        histogram.add(new StringBuilder("40-49: "));
        histogram.add(new StringBuilder("50-59: "));
        histogram.add(new StringBuilder("60-69: "));
        histogram.add(new StringBuilder("70-79: "));
        histogram.add(new StringBuilder("80-89: "));
        histogram.add(new StringBuilder("90-99: "));
        histogram.add(new StringBuilder("  100: "));

        for (int score : scoreList) {
            if (score == 100) {
                addStar(histogram, 10);
            } else if (score >= 90) {
                addStar(histogram, 9);
            } else if (score >= 80) {
                addStar(histogram, 8);
            } else if (score >= 70) {
                addStar(histogram, 7);
            } else if (score >= 60) {
                addStar(histogram, 6);
            } else if (score >= 50) {
                addStar(histogram, 5);
            } else if (score >= 40) {
                addStar(histogram, 4);
            } else if (score >= 30) {
                addStar(histogram, 3);
            } else if (score >= 20) {
                addStar(histogram, 2);
            } else if (score >= 10) {
                addStar(histogram, 1);
            } else {
                addStar(histogram, 0);
            }
        }
        for (StringBuilder column : histogram) {
            System.out.println(column);
        }


    }

    public static void addStar(List<StringBuilder> list, int position) {
        list.get(position).append("*");
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream().findFirst().orElseThrow(IllegalStateException::new);
    }
}
