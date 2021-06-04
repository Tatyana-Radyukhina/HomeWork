import java.io.*;
import java.nio.charset.StandardCharsets;

public class HomeWork {

    public static void main(String[] args) throws IOException {
        OutputStream two = new FileOutputStream("src/TextOut.txt");
        byte[] arrayByte = "testovoezadanie".getBytes(StandardCharsets.UTF_8);
        two.write(arrayByte, 0,8);
        two.close();
    }
}
