package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "banana", "Apple",
                "Melon", "Mango"};

        /**
         * 1. 중복제거
         * 2.문자열 길이 변경
         * int[] 배열로 변경
         */

        int[] nums = Arrays.stream(fruits).distinct().mapToInt(String::length).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
