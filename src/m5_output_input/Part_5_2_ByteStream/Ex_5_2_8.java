package m5_output_input.Part_5_2_ByteStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex_5_2_8 {

    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01});
        System.out.print(checkSumOfStream(stream));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        return 0;
    }
}