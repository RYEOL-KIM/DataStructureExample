package Queue;

import java.util.ArrayList;

public class Solution02 {
    private ArrayList<Integer> listQueue = new ArrayList<>();

    public void add(Integer data) {
        listQueue.add(data);
    }

    public Integer poll() {
            if (listQueue.size() == 0) {
            return null;
        } else {
            return listQueue.remove(0);
        }
    }

    public int size() {
        return listQueue.size();
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}
