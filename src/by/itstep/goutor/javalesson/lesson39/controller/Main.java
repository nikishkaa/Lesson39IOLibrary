package by.itstep.goutor.javalesson.lesson39.controller;


public class Main {
    public static void main(String[] args) {
        //String binaryFileName = "D:\\Прога\\test.byn";
        String binaryFileName = "D:/Прога/test.byn";


//        BinaryWorker.write(binaryFileName);

        String text = BinaryWorker.read(binaryFileName);
        System.out.println(text);

    }
}
