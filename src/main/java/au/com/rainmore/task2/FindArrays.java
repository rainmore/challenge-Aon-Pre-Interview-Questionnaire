package au.com.rainmore.task2;

import java.util.OptionalInt;

public class FindArrays {

    public static OptionalInt find(int[] a1, int[] a2) {
        if (a2.length > a1.length) {
            return OptionalInt.empty();
        }

        int index = 0;
        int next = 0;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[next]) {
                index = i;
                next++;
            }
            if (next > a2.length - 1) {
                break;
            }
        }

        if (next == a2.length) {
            return OptionalInt.of(index - (next - 1));
        }

        return OptionalInt.empty();
    }
}
