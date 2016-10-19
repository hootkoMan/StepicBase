package m6_generics_collections_streams;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_6_2_15_sequenceOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> integers = new ArrayDeque<>();
        for (int j = 0; scanner.hasNext(); j++) {
            int t = scanner.nextInt();
            if (j % 2 != 0) {
                integers.add(t);
            }
        }

        Iterator<Integer> integerIterator = integers.descendingIterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }
    }
}
