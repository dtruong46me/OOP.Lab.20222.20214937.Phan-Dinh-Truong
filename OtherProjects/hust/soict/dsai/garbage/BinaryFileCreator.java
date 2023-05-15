package OtherProjects.hust.soict.dsai.garbage;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class BinaryFileCreator {
    public static void main(String[] args) throws IOException {
        String filename = "OtherProjects/hust/soict/dsai/garbage/test.bin";
        Random random = new Random();
        int[][] arr = new int[1000][100];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filename))) {
            for (int[] row : arr) {
                for (int num : row) {
                    outputStream.write(num);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File created successfully!");
    }
}
