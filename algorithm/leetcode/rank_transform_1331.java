import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        int[] rank = new int[arr.length];
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int order = 1;
        for (int i = 0; i < copy.length; i++) {
            if (!map.containsKey(copy[i])) {
                map.put(copy[i], order);
                order++;
            }
        }
        for (int i = 0; i < copy.length; i++) {
            rank[i] = map.get(arr[i]);
        }
        return rank;
    }
}