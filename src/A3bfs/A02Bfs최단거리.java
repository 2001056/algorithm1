package A3bfs;

import java.util.*;

public class A02Bfs최단거리 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] nodes = {{0,1},{0,2},{1,3},{2,3},{2,4}};
        visited = new boolean[nodes.length];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }
//        0부터 target까지 가는 최단거리
        int target=4;
        for (int[] n : nodes){
            int start = n[0];
            int end = n[1];
            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }
        for (List<Integer> l : adjList){
            l.sort(Comparator.naturalOrder());
        }
        Queue<int[]> myQue = new LinkedList<>();
        myQue.add(new int[]{0,0}); //int배열안에는 {노드번호,거리}
        visited[0] = true;
        int answer = -1;
        loop1:
        while (!myQue.isEmpty()){
            int[] temp = myQue.poll();
            for (int a : adjList.get(temp[0])){
                if (visited[a])continue;
                myQue.add(new int[]{a,temp[1]+1});
                visited[a] = true;
                if (target==a){
                    answer = temp[1]+1;
                    break loop1;
                }
            }
        }
        System.out.println(answer);

    }
}
