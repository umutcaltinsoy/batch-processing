package com.altinsoy.spring.batch.config;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CsvGenerator {
    public static void main(String[] args) {
        String csvFile = "data.csv";
        String[] header = {"id", "firstName", "lastName", "email", "gender", "contactNo", "country", "dob"};
        int numLines = 100000;

        try {
            FileWriter writer = new FileWriter(csvFile);
            // write header
            for (int i = 0; i < header.length; i++) {
                writer.append(header[i]);
                if (i != header.length - 1) {
                    writer.append(",");
                } else {
                    writer.append("\n");
                }
            }
            // write data
            Random random = new Random();
            for (int i = 1; i <= numLines; i++) {
                writer.append(String.valueOf(i));
                writer.append(",");
                writer.append("First" + i);
                writer.append(",");
                writer.append("Last" + i);
                writer.append(",");
                writer.append("email" + i + "@example.com");
                writer.append(",");
                writer.append(random.nextBoolean() ? "Male" : "Female");
                writer.append(",");
                writer.append("+1-555-555-" + String.format("%04d", i));
                writer.append(",");
                writer.append("USA");
                writer.append(",");
                writer.append(String.format("%04d-%02d-%02d", random.nextInt(73) + 1950, random.nextInt(12) + 1, random.nextInt(28) + 1));
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

