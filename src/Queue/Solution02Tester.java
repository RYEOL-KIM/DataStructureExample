package Queue;

public class Solution02Tester {
    public static void main(String[] args) {
        Solution02 queue = new Solution02();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.show());

        queue.poll();
        queue.poll();

        System.out.println(queue.show());

//        System.out.println(queue.size());
//
//        for (int i = 1; i < 10; i++) {
//            queue.add(i);
//        }
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
//        queue.add(10);
//        System.out.println(queue.size());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
//        System.out.println(queue.show());
    }
}
