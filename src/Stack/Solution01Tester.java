package Stack;

public class Solution01Tester {
    public static void main(String[] args) {
        Solution01 stack = new Solution01();
//
//        System.out.println(stack.size()); // 0
//        for(int i = 1; i < 10; i++) {
//            stack.push(i);
//        }
//        System.out.println(stack.pop()); // 9
//        System.out.println(stack.pop()); // 8
//        System.out.println(stack.size()); // 7
//        System.out.println(stack.show());
//        stack.push(8);
//        System.out.println(stack.size()); // 8
//        System.out.println(stack.show());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.show());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.show());
    }
}
