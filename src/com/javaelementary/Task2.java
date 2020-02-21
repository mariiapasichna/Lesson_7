package com.javaelementary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task2 {

    /*
    2. Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов
    */

    public static void main(String[] args) {
        textParsing("test.txt");
    }

    private static void textParsing(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<String> worlds = new ArrayList<>();
            int numberOfLines = 0;
            int numberOfChars = 0;
            Scanner scanner = new Scanner(br);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                worlds.addAll(Arrays.asList(line.split(" ")));
                numberOfLines++;
                numberOfChars += line.length();
            }
            System.out.println("Number of lines: " + numberOfLines);
            System.out.println("Number of worlds: " + worlds.size());
            System.out.println("Number of chars: " + numberOfChars);
        } catch (IOException e) {
            System.out.println("File " + fileName + " not found");
        }
    }
}