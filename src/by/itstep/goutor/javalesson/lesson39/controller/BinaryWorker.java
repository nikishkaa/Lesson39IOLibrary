package by.itstep.goutor.javalesson.lesson39.controller;

import java.io.*;

public class BinaryWorker {
    public static void write(String fileName) {

        OutputStream stream = null;
        try {
            stream = new FileOutputStream(fileName);

            for (int i = -1000; i < 0; i++) {
                stream.write(i);
            }

            stream.flush();

            stream.close();


        } catch (FileNotFoundException exception) {
        } catch (IOException exception) {
            System.out.println(exception);

        }


    }


    public static String read(String fileName) {

        InputStream stream = null;
        StringBuilder builder = new StringBuilder();
        try {
            stream = new FileInputStream(fileName);

            int number;

            while ((number = stream.read()) != -1) {
                builder.append(number).append(" ");
            }


            stream.close();


        } catch (FileNotFoundException exception) {
        } catch (IOException exception) {
            System.out.println(exception);

        }

        return builder.toString();
    }
}
