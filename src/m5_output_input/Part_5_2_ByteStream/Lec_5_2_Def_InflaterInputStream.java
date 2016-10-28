package m5_output_input.Part_5_2_ByteStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Lec_5_2_Def_InflaterInputStream {
    public void someMethod() {
        byte[] originalData = {1, 2, 3, 4, 5};

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try (OutputStream dos = new DeflaterOutputStream(os)) {
            dos.write(originalData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] deflatedData = os.toByteArray();

        try (InflaterInputStream iis = new InflaterInputStream(
            new ByteArrayInputStream(deflatedData))){
            int read = iis.read();
            while (read >= 0) {
                System.out.printf("%02x", read);
                read = iis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
