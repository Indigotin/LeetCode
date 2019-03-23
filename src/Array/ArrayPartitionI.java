package Array;

public class ArrayPartitionI {

    private int Area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                getArea(grid,i,j,0);
            }
        }
        return Area;
    }

    private void getArea(int[][] grid,int i,int j,int area){
        if(grid[i][j] == 1) {
            //表示已经访问过
            grid[i][j] = 2;
            area++;
            if (area > Area)
                Area = area;
        }
        else
            return;

        //上
        if(i-1 >= 0)
            getArea(grid,i-1,j,area);
        //下
        if(i+1 < grid.length)
            getArea(grid,i+1,j,area);
        //左
        if(i-1>=0 && j-1>=0)
            getArea(grid,i-1,j-1,area);
        //右
        if(i+1<grid.length && j+1<grid[i].length)
            getArea(grid,i+1,j+1,area);

        //还原
        if(grid[i][j] == 2){
            grid[i][j] = 1;
            return;
        }
    }
    public static void main(String[] args){
        int[][] grid= {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(new ArrayPartitionI().maxAreaOfIsland(grid));
    }
}
