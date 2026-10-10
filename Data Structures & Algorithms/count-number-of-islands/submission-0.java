class Solution {
    public int numIslands(char[][] grid) {
        int counter=0;
        int[] [] visited= new int[grid.length][grid[0].length];

        for(int m=0;m<grid.length;m++){
            for(int n=0;n<grid[0].length;n++){
                if(visited[m][n]==0&&grid[m][n]=='1'){
                    bfs(m,n,visited,grid);
                    counter ++;
                }
            }
        }
        return counter;
    }
    void bfs(int row, int col, int[][] visited, char[][]grid){
        visited[row][col]=1;
        int[] rNbr = { -1, 0, 1, 0};
        int[] cNbr = { 0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});

        while(!q.isEmpty()){
            int[] pos = q.poll();
            int r = pos[0];
            int c = pos[1];

                        // Explore all 4 adjacent cells
            for (int k = 0; k < 4; k++) {
                int newR = r + rNbr[k];
                int newC = c + cNbr[k];
                if (isSafe(grid, newR, newC, visited)) {
                    visited[newR][newC] = 1;
                    q.add(new int[]{newR, newC});
                }
            }
        }
        return;
    }
     static boolean isSafe(char[][] grid, int r, int c, int[][] vis) {
        int rows = grid.length;
        int cols = grid[0].length;
        return (r >= 0) && (r < rows) && (c >= 0) && 
               (c < cols) && (grid[r][c] == '1' && vis[r][c]!=1);
    }
}
