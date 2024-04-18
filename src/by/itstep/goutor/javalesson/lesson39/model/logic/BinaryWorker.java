package by.itstep.goutor.javalesson.lesson39.model.logic;

import java.io.*;

public class BinaryWorker {
    public static void write(String filename) {
        OutputStream stream = null;

        try {
            stream = new FileOutputStream(filename);
            stream = new BufferedOutputStream(stream);
            for (int i = -1000; i < 0; i++) {
                stream.write(i);
            }
            if (stream != null) {
                stream.flush();
                stream.close();
            }


        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }


    public static String read(String filename) {
        InputStream stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileInputStream(filename);
            stream = new BufferedInputStream(stream);


            int number;

            while ((number = stream.read()) != -1) {
                builder.append(number).append(" ");
            }

            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (FileNotFoundException exception) {
                System.out.println(exception);
            } catch (IOException exception) {
                System.out.println(exception);
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }
}
