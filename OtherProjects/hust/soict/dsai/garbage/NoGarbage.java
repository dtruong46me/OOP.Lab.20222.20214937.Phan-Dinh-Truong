package OtherProjects.hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "OtherProjects/hust/soict/dsai/garbage/test.bin";
        byte[] inputBytes = { 0 };
        long startTime1, endTime1, startTime2,endTime2;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        startTime1 = System.currentTimeMillis();

        StringBuilder outputStringBuilder = new StringBuilder();

        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }

        endTime1 = System.currentTimeMillis();
        // System.out.println("Output: " + outputStringBuilder);
        System.out.println("StringBuilder Time: " + (endTime1 - startTime1) + "ms");

        startTime2 = System.currentTimeMillis();

        StringBuffer outputStringBuffer = new StringBuffer();

        for (byte b : inputBytes) {
            outputStringBuffer.append((char) b);
        }

        endTime2 = System.currentTimeMillis();
        // System.out.println("Output: " + outputStringBuffer);
        System.out.println("StringBuffer Time: " + (endTime2 - startTime2) + "ms");
    }
}