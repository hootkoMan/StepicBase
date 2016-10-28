package m5_output_input.Part_5_2_ByteStream;


import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lec_5_2_output_input {
    public void readFile() throws IOException {
        InputStream inputStream = new FileInputStream(new File("read.txt"));
        OutputStream outputStream = new FileOutputStream(new File("newFile.txt"));

        InputStream inputStream1 = Files.newInputStream(Paths.get("read1.txt"));
        OutputStream outputStream1 = Files.newOutputStream(Paths.get("newFile1.txt"));

        int totalBytesWritten = 0;
        byte[] buf = new byte[1024];
        int blockSize = 0;
        while ((inputStream.read(buf)) > 0) {
            outputStream.write(buf, 0, blockSize);
            totalBytesWritten += blockSize;
        }
    }

    public void readClass() {
        try (InputStream inputStream = Lec_5_2_output_input.class.getResourceAsStream("Main.class")){
            int read = inputStream.read();
            while (read >= 0) {
                System.out.printf("%02x", read);
                read = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromSocket() {
        try (Socket socket = new Socket("site.com", 80)) {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("GET / HTTP/1.0\r\n\r\n".getBytes());
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            int read = inputStream.read();
            while (read >= 0) {
                System.out.println((char) read);
                read = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dataIOStream() {
        byte[] data = {1, 2, 3, 4, 5};
        InputStream inputStream = new ByteArrayInputStream(data);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // ...
        byte[] result = outputStream.toByteArray();
    }
}
