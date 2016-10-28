package m5_output_input.Part_5_2_ByteStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex_5_2_9_writeByte {
    public static void main(String[] args) throws IOException {
//        byte[] bytes = {65, 13, 10, 10, 13};

        List<Byte> byteArrayList = new ArrayList<>();

        while (true) {
            byte newByte = (byte) System.in.read();
            if (newByte == -1) {
                break;
            }
            byteArrayList.add(newByte);
        }

        for (int i = 0; i < byteArrayList.size() - 1; i++) {
            if (byteArrayList.get(i) == 13 && byteArrayList.get(i + 1) == 10) {
                continue;
            }
            System.out.write(byteArrayList.get(i));
        }


        /*int c;
        while ((c = System.in.read()) != -1) {
            if (c == (char) 13) {
                if ((c = System.in.read()) != -1 && c == 10) {
                    continue;
                } else {
                    System.out.write(13);
                }
            }
            System.out.write(c);
        }*/
        System.out.flush();

        // not work

    }
}
