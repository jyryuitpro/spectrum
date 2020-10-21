package stream.reader;

import java.io.*;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("reader.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
        FileReader fis = new FileReader("reader.txt");

        int i;

        while ((i = fis.read()) != -1) {
            System.out.print((char)i);
        }

//        while ((i = isr.read()) != -1) {
//            System.out.print((char)i);
//        }

        fis.close();
//        isr.close();
    }
}
