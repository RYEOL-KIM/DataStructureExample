package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Solution3Tester {
    public static void main(String[] args) {
        Solution03 browserStack = new Solution03();
        String[] actions = {"A", "B", "C", "-1", "1", "-1"};
        String start = "START";
        ArrayList<Stack> result = browserStack.browserStack(actions, start);

        System.out.println(result);
    }
}
