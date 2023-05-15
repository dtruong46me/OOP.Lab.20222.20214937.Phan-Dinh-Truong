package OtherProjects.hust.soict.dsai.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();

        String string = "";
        for (int i = 0; i < 100000; i++) {
            string = string + "ab";
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("Execution time using '+' operator: " + (endTime1 - startTime1) + " ms");

        // Concatenating using StringBuffer
        long startTime2 = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("ab");
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("Execution time using StringBuffer: " + (endTime2 - startTime2) + " ms");

        // Concatenatin using StringBuilder
        long startTime3 = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("ab");
        }

        long endTime3 = System.currentTimeMillis();
        System.out.println("Execution time using StringBuilder: " + (endTime3 - startTime3) + " ms");
    }
}
