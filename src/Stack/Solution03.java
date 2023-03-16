package Stack;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Solution03 {

    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        // TODO:

        // 현재 페이지를 current에 push
        current.push(start);

        // actions를 순회하면서 각각 케이스 해결
        for (String action : actions) {
            if (Objects.equals(action, "1")) {
                if (nextStack.size() != 0) {
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());
                }
            } else if (Objects.equals(action, "-1")) {
                if (prevStack.size() != 0) {
                    nextStack.push(current.pop());
                    current.push(prevStack.pop());
                }
            } else {
                nextStack.clear();
                prevStack.push(current.pop());
                current.push(action);
            }
        }

        // result에 스택 입력후 리턴
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }
}
