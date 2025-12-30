package A1sort;

import javax.swing.plaf.LabelUI;
import java.lang.reflect.Array;
import java.util.*;

//트리탐색 + 재귀적 호출 통한 힙정렬
public class A01HeapSort구현 {
    public static void main(String[] args) {
//        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//        1.최초 힙 구성
//        1-1)부모노드(n/2)와 자식노드(n/2) 분리하여 부모노드를 대상으로 heapify
//        1-2)자식노드의 왼쪽노드 : 부모노드x2 + 1 , 자식노드의 오른쪽노드 : 부모노드x2 +2
//        1-3)heapify 과정이 재귀 호출로 이루어짐.
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            heapify(arr, i,arr.length);
//        }
//        System.out.println(Arrays.toString(arr));
////        2.루트노드와 최하위노드를 자리 change 해가면서 재heapify
////        2-1) 자리change한 마지막 노드는 heapify 대상에서 제외
////        2-1) 최소힙 -> 내림차순 , 최대힙-> 오름차순 정렬
//        for (int i = arr.length-1; i >= 0; i--) {
//            int temp = arr[0];
//            arr[0] = arr[i]; //마지막 자리값 감소
//            arr[i] = temp;
//            heapify(arr,0 ,i); // 전체길이 감소
//        }
//        System.out.println(Arrays.toString(arr));

//        pq를 통한 정렬방법
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList(7, 6, 5, 8, 3, 5, 9, 1, 6));
//        Queue<Integer> pq = new PriorityQueue<>();
//        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
        System.out.println(pq);
        System.out.println(pq.poll()); // poll의 복잡도 log(n)
        pq.add(2); // add의 복잡도 = log(n)
        System.out.println(pq);
//        for (int a : arr){
//            pq.add(a);
//        }
//        System.out.println(pq);
//        List<Integer> myList = new ArrayList<>();
//        while (!pq.isEmpty()){
//            myList.add(pq.poll());
//        }
//       System.out.println(myList);



    }

    static void heapify(int[] arr, int parent, int length) {
//        자식노드와의 비교 , 만약 자식 노드가 더 작으면 자리 change
        int temp = 0;
        int left = parent * 2 + 1;
        int right = parent * 2 + 2;
        int small = parent;
        if (left < length && arr[left] < arr[small]) {
            small = left;
        }
        if (right < length && arr[right] < arr[small]) {
            small = right;
        }
        if (parent != small) {
            temp = arr[small];
            arr[small] = arr[parent];
            arr[parent] = temp;
            heapify(arr, small,length);
        }
//        if (arr[left]<arr[right]) {
//            if (arr[parent] > arr[left]) {
//                temp = arr[left];
//                arr[left] = arr[parent];
//                arr[parent] = temp;
//                heapify(arr, left);
//            }
//        } else {
//            if (arr[parent] > arr[right]) {
//                temp = arr[right];
//                arr[right] = arr[parent];
//                arr[parent] = temp;
//                heapify(arr, right);
//            }
//        }
//        }
//        자리가 change 된다면, 재귀 호출

//        heapify(arr, 자식노드의 index);

    }
}

