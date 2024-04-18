package by.itstep.goutor.javalesson.lesson39.controller;

import by.itstep.goutor.javalesson.lesson39.model.entity.Student;
import by.itstep.goutor.javalesson.lesson39.model.logic.BinaryWorker;
import by.itstep.goutor.javalesson.lesson39.model.logic.StudentWorker;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String binaryFileName = "D:\\Прога\\test.bin";
//        String binaryFileName = "D:/Прога/test.bin";
//        BinaryWorker.write(binaryFileName);

//        String text = BinaryWorker.read(binaryFileName);
//        System.out.println(text);


        //Lesson 40 Student worker
        Student[] students = {
                new Student("Alex", 20, 9, true),
                new Student("Alice", 18, 8, true)
        };

        String filaName = "D:/прога/student.dat";

        List<Student> list = StudentWorker.read(filaName);
        for (Student student : list){
            System.out.println(student);
        }
    }
}
