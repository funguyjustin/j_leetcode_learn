package leetcode.queue;

public class NumIsIlands {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    subMergeIsland(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void subMergeIsland(char[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        subMergeIsland(grid, i, j + 1);
        subMergeIsland(grid, i, j - 1);
        subMergeIsland(grid, i + 1, j);
        subMergeIsland(grid, i - 1, j);
    }
}
