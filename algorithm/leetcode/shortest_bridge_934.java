class Solution {
    private final static int[][] DIRS = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int shortestBridge(int[][] grid) {
        Queue<int[]> que = labelOneIsland(grid);
        return bfs(grid, que, 1);
    }

    public Queue<int[]> labelOneIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> que = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, que);
                    return que;
                }
            }
        }
        return que;
    }

    public void dfs(int[][] A, int x, int y, Queue<int[]> queue) {
        A[x][y] = -1;
        queue.add(new int[] { x, y });
        for (int[] dir : DIRS) {
            int i = x + dir[0];
            int j = y + dir[1];
            if (outOfBound(A, i, j) || A[i][j] < 0)
                continue;
            if (A[i][j] == 1) {
                dfs(A, i, j, queue);
            }
        }
    }

    public boolean outOfBound(int[][] A, int x, int y) {
        return (x < 0 || y < 0 || x >= A.length || y >= A[0].length);
    }

    public int bfs(int[][] A, Queue<int[]> queue, int target) {
        int dist = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] cell = queue.poll();
                for (int[] dir : DIRS) {
                    int i = cell[0] + dir[0];
                    int j = cell[1] + dir[1];
                    if (outOfBound(A, i, j) || A[i][j] < 0) {
                        continue;
                    }
                    if (A[i][j] == target) {
                        return dist;
                    }
                    A[i][j] = -2;
                    queue.add(new int[] { i, j });
                }
            }
            dist++;
        }
        return dist;
    }

}