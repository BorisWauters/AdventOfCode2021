package com.github.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Part1 {

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("input/day1.txt"))) {
            solve(stream.mapToInt(Integer::parseInt).toArray());
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

    private static void solve(int[] lines) throws IOException {
        int count = 0;
        int line = lines[0];
        for (int i = 1; i < lines.length; i++) {
            if (line < lines[i])
                count++;

            line = lines[i];
        }
        System.out.println(count);
    }
}
