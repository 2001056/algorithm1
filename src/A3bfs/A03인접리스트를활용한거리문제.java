package A3bfs;

import java.util.*;

public class A03인접리스트를활용한거리문제 {
//        가장 먼 노드 : 프로그래머스
    //        촌수 계산 : 백준

    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // 전체 사람 수
        int A = sc.nextInt();      // 촌수 계산할 사람 1
        int B = sc.nextInt();      // 촌수 계산할 사람 2
        int M = sc.nextInt();      // 관계 수

        // 인접 리스트 초기화
        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        // 관계 입력 (양방향)
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }

        visited = new boolean[N + 1];
        dist = new int[N + 1];

        bfs(A);

        // 결과
        if (visited[B]) {
            System.out.println(dist[B]);
        } else {
            System.out.println(-1);
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : adjList.get(now)) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[now] + 1;
                    q.add(next);
                }
            }
        }
    }
}
