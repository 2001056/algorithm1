package A1sort;

import java.util.*;

public class A02힙정렬문제풀이 {
    public static void main(String[] args) {
//    명예의 전당 : 프로그래머스
        Scanner sc = new Scanner(System.in);
//        int K = Integer.parseInt(sc.nextLine());
//        int[] score = {10, 100, 20, 150, 1, 100, 200}; // 명예의 전당 : 프로그래머스
//        int a = 1;
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(score[0]);
//        for (int i = 0; i < score.length - 1; i++) {
//            if (score[a] > pq.peek()) {
//                if (pq.size() < K) {
//                    pq.add(score[a]);
//                    a++;
//                } else {
//                    pq.poll();
//                    pq.add(score[a]);
//                    a++;
//                }
//            } else {
//                a++;
//            }
//
//            System.out.println(pq.peek());
//        }
//    야근지수 : 프로그래머스
        int[] works = {4,3,3};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer=0;
        int n = 4;
        int total = 0;
        for (int a : works){
            total +=a;
            pq.add(a);
        }
        if (n >= total) {
            return;
        }

            for (int i = 0; i < n; i++) {
                if (pq.isEmpty() || pq.peek() == 0) {
                    return;
                }else pq.add(pq.poll() - 1);
            }
            while(!pq.isEmpty()) {
                int a = pq.poll();
                answer += (long) a * a;

            }
        System.out.println(answer);
        }




    }





