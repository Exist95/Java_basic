package fastcampus.part5.test;

import fastcampus.part5.model.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);
        System.out.println(min);
        System.out.println(max);
    }
}
