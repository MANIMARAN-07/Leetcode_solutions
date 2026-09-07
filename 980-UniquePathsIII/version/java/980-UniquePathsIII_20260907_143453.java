// Last updated: 07/09/2026, 14:34:53
1class Solution{
2    public int uniquePathsIII(int[][] grid){
3        int zero=0;
4        int sx=0;
5        int sy=0;
6        for(int r=0;r<grid.length;r++){
7            for(int c=0;c<grid[0].length;c++){
8                if(grid[r][c]==0)zero++;
9                else if(grid[r][c]==1){
10                    sx=r;
11                    sy=c;
12                }
13            }
14        }
15        return dfs(grid,sx,sy,zero);
16    }
17    public int dfs(int grid[][],int x,int y,int zero){
18        if(x<0||y<0||x>=grid.length||y>= grid[0].length||grid[x][y]==-1){
19            return 0;
20        }
21        if(grid[x][y]==2){
22            return zero==-1?1:0;
23        }
24        grid[x][y]=-1;
25        zero--;
26        int totalPaths=dfs(grid,x+1,y,zero)+dfs(grid,x-1,y,zero)+dfs(grid,x,y+1,zero)+dfs(grid,x,y-1,zero);
27        grid[x][y]=0;
28        zero++;
29        return totalPaths;
30    }
31}