package A4greedy;

import java.util.Arrays;
import java.util.Comparator;

//greedy탐욕법) : 현재로서 최적의 해를 선택했을때, 전체의 최적해를 보장하는 알고리즘.
public class A01GreedyBasic {
    public static void main(String[] args) {
//        1,5,10,20원 짜리의 동전이 있을 때, 이를 조합하여 99를 만들 수 있는 조합 중에 최소개수 구하라.
        int[] arr = {1,5,10,20};
        int target = 99;
        int total = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            int a = arr[i];
            int b = (target/a);
            total += b;
            target -= b*a;
        }

        System.out.println(total);
    }
}
