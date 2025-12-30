package A2dfs;

import java.util.*;

public class A문제풀이 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

//        출발은 0부터 시작했을 때 dfs로 방문할 경우 방문순서
        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());

        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        visited = new boolean[N+1];

        for (int i = 1; i <= N; i++) {
            Collections.sort(adjList.get(i));
        }
        dfs(V);
        System.out.println();
        visited = new boolean[N + 1]; // 방문배열 초기화
        bfs(V);



    }
    static void dfs(int V){
        visited[V] = true;
        System.out.print(V + " ");

        for (int next : adjList.get(V)){
            if (!visited[next]){
                dfs(next);
            }
        }


    }
    static void bfs(int V) {
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visited[V] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");

            for (int next : adjList.get(now)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}

//관련문제
//DFS/BFS(1260) 백준
//트리의 부모찾기 : 백준
//연결요소의개수(11724) : 백준