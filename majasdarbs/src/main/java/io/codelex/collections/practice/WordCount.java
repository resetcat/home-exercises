package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> fileList = Files.readAllLines(path, charset);
        String fileString = String.join(" ", fileList);
        List<String> wordList = new ArrayList<>(List.of(fileString.split("\\s+")));

        int lineCount = fileList.size();
        int wordCount = wordList.size();
        int charCount = fileString.trim().length();

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }
}
