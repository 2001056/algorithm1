package A3bfs;

import java.util.*;

public class A01Bfs방문순서 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] nodes = {{0,1},{0,2},{1,3},{2,3},{2,4}};
        visited = new boolean[nodes.length];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] n : nodes){
            int start = n[0];
            int end = n[1];
            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }
        for (List<Integer> l : adjList){
            l.sort(Comparator.naturalOrder());
        }
        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(0);
        visited[0] = true;
        while (!myQue.isEmpty()){
            int temp = myQue.poll();
            System.out.println(temp);
            for (int a : adjList.get(temp)){
                if (visited[a])continue;
                myQue.add(a);
//                bfs에서 visited는 queue에 add하는 시점에 true 세팅해야 함
                visited[a] = true;
            }
        }

    }

}
