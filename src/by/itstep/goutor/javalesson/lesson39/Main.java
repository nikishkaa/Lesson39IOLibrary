package by.itstep.goutor.javalesson.lesson39;

public class Main {
    public static void main(String[] args) {
//        String binaryFileName = "D:\\Прога\\test.bin";
        String binaryFileName = "D:/Прога/test.bin";
//        BinaryWorker.write(binaryFileName);

        String text = BinaryWorker.read(binaryFileName);
        System.out.println(text);
    }
}
