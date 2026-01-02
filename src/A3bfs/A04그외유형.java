package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class A04그외유형 {
    //    이차원배열의 최단거리
//    게임맵 최단거리 : 프로그래머스
//    비노드형식의 거리문제 : 숨바꼭질 - 백준 1697``
    static int[] dy = {0, 0, -1, 1};
    static int[] dx = {-1, 1, 0, 0};

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,1});
        boolean[][] visited = new boolean[5][5];
        int answer = -1;
        loop1:
        while (!queue.isEmpty()){
            int[] temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i]+temp[0];
                int ny = dy[i]+temp[i];
                if(nx>=0&&nx<maps.length&&ny>=0&&ny<maps[0].length){
                    if (maps[nx][ny]==1 && !visited[nx][ny]){
                        queue.add(new int[]{nx,ny,temp[2]+1});
                        if(nx==maps.length-1 && ny==maps[0].length-1){
                            answer = temp[2]+1;
                            break loop1;
                        }
                    }

                }
            }
        }


        System.out.println(answer);
    }
}
