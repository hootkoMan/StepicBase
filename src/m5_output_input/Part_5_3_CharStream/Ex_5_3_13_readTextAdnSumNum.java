package m5_output_input.Part_5_3_CharStream;

import java.util.Scanner;

public class Ex_5_3_13_readTextAdnSumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] strings = scanner.next().split(" ");
            Double[] doubles = new Double[strings.length];
            try {
                for (int i = 0; i < strings.length; i++) {
                    doubles[i] = Double.parseDouble(strings[i]);
                }
            } catch (Exception e) {
            }

        }

    }

    // not work
}