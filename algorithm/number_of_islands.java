class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    check(grid, i, j);
                }
            }
        }
        return count;
    }

    public void check(char[][] grid, int i, int j) {
        if (i < 0 || j < 0) {
            return;
        } else if (i >= grid.length || j >= grid[i].length) {
            return;
        } else if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        check(grid, i + 1, j);
        check(grid, i - 1, j);
        check(grid, i, j + 1);
        check(grid, i, j - 1);
        return;
    }
}