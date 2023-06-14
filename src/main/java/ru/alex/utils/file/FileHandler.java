package ru.alex.utils.file;

import java.io.*;

public class FileHandler {

    public static String getSqlQueryFromFile(String pathToFile) {

        StringBuilder sqlQueryFromFile = new StringBuilder();

        try ( var file = new FileReader(pathToFile);
              var fileBuffer = new BufferedReader(file)) {

            while (fileBuffer.ready()) {
                sqlQueryFromFile.append(fileBuffer.readLine()).append("\n");
            }

            return sqlQueryFromFile.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
