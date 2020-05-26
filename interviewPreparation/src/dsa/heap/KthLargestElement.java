

package dsa.heap;


import java.util.PriorityQueue;

class KthLargestElement {

    int count = 0;
    PriorityQueue<Integer> minHeap = null;

    public KthLargestElement(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        count = k;
        for (int n : nums) {

            if (k > minHeap.size()) {
                minHeap.add(n);
            } else if (minHeap.peek() < n) {
                minHeap.poll();
                minHeap.add(n);
            }
        }

    }
    public int add(int val) {


        if (count > minHeap.size()) {
            minHeap.add(val);
        } else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.add(val);
        }
        return minHeap.peek();

    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4,5,8,2};
        KthLargestElement obj = new KthLargestElement(k, arr);

        System.out.println(obj.add(3));
        System.out.println( obj.add(5) );
        System.out.println(obj.add(10) );
        System.out.println(obj.add(9) );
        System.out.println(obj.add(4));

    }


}
