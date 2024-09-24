package challenges;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] pi = {3,1,4,1,5,9,2,6};
        sort(pi);
        System.out.println(Arrays.toString(pi));
    }

    public static int[] sort(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}