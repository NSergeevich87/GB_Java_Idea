import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // task_1 backup
        Files.createDirectory(Path.of("./backup"));

        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));

        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            Files.copy(file, Path.of("./backup/" + file.toString()));
        }

        // task_2
        int[] ar2 = {0,1,2,3,0,1,2,3,0};

        try(FileOutputStream fos = new FileOutputStream("save1.out")) {
            for (int b = 0; b < 3; b++) { // write to 3 bytes
                byte wr = 0;
                for (int v = 0; v < 3; v++) { // write by 3 values in each
                    wr += (byte) (ar2[3 * b + v] << (v * 2));
                }
                fos.write(wr);
            }
            fos.flush();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // task_3
        int[] ar20 = new int[9];

        FileInputStream fis = new FileInputStream("save1.out");
        int b;
        int i = 0;
        while ((b = fis.read()) != -1) {
            for (int v = 0; v < 3; ++v) { // 3 values of four possible
                ar20[i++] = b >> (v * 2) & 0x3;
            }
        }
        fis.close();

        System.out.println(Arrays.toString(ar20));





//        // 1
//        int[] ar0 = {1,2,3,4,5,6,7,8,0,8,7,6,5,4,3};
//        final int DIGIT_BOUND = 48;
//
//        try (FileOutputStream fos = new FileOutputStream("save.out"))
//        {
//            fos.write('[');
//            for (int i = 0; i < ar0.length; i++) {
//                fos.write(DIGIT_BOUND + ar0[i]);
//                if (i < ar0.length - 1) fos.write(',');
//            }
//            fos.write(']');
//            fos.flush();
//            fos.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        // 2
//        int[] ar00 = new int[15];
//        //final int DIGIT_BOUND = 48;
//
//        try(FileInputStream fis = new FileInputStream("save.out")) {
//            fis.read(); // '['
//            for (int i = 0; i < ar00.length; i++) {
//                ar00[i] = fis.read() - DIGIT_BOUND;
//                fis.read(); // ','
//            }
//            fis.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(Arrays.toString(ar00));

    }
}
