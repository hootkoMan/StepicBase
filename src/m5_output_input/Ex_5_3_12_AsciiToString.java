package m5_output_input;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Ex_5_3_12_AsciiToString {
    public static void main(String[] args) throws IOException {
        // 48 49 50 51  -->  "0123"

        InputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(inputStream, StandardCharsets.US_ASCII));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Reader reader = new InputStreamReader(inputStream, charset);
        int c;
        while ((c = reader.read()) != -1) {
            stringBuilder.append(Character.toChars(c));
        }

        return stringBuilder.toString();
    }
}
