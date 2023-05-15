package OtherProjects.hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "OtherProjects/hust/soict/dsai/garbage/test.bin";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();

        String outputString = "";

        for (byte b : inputBytes) {
            outputString = outputString + (char) b;
        }
        endTime = System.currentTimeMillis();
        // System.out.println("Output: " + outputString);
        // System.out.println(inputBytes);
        System.out.println("Time excute: " + (endTime - startTime) + "ms");
    }
}