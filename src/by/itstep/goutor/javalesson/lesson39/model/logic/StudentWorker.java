package by.itstep.goutor.javalesson.lesson39.model.logic;

import by.itstep.goutor.javalesson.lesson39.model.entyti.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StudentWorker {
    public static void writer(String filename, Student[] students) {
        Writer stream = null;
        try {
            stream = BufferedWriter(new FileWriter(filename));
        } catch (IOException exception) {
            System.out.println(exception);
            for (Student student : students) {
                stream.write(student.getName());
                stream.write(student.getAge());
                stream.write(student.getMark() + "");

            }

        } finally {
            try {
                if (stream == null) {
                    stream.close();
                }
            } catch {

            }
        }
    }
}
