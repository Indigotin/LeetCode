package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class maxAreaOfIsland {

    static int count = 0;
    public static int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                count = 0;
                temp(i,j,grid);
                //System.out.println("递归完count="+count);
                if(max < count)
                    max = count;

                //System.out.println("max="+max);
            }
        }
        return max;
    }

    private static void temp(int i,int j,int[][] grid){


        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length)
            return;

        if(grid[i][j] ==  0 || grid[i][j] ==  2){
            return;
        }
        if(grid[i][j] == 1){
            count++;
            grid[i][j] = 2;
            System.out.println("grid[i][j]="+grid[i][j]+"i="+i+"j="+j);
            System.out.println("count="+count);
        }

        temp(i-1,j,grid);
        temp(i,j-1,grid);
        temp(i+1,j,grid);
        temp(i,j+1,grid);
        return;
    }
    public static void main(String[] args){

        ArrayList<String> line = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int i=0;

        line.add(input.next());
        //System.out.println(line.get(i));
        while (!line.get(i).substring(line.get(i).length()-2).equals("]]")){
            i++;
            line.add(input.next());
        }

        /*for(int j=0;j<line.size();j++){
            System.out.println(line.get(j));
        }*/

        int[][] grid = new int[line.size()][50];
        for(int j=0;j<line.size();j++){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int k=0;k<line.get(j).length();k++){
                if(Character.isDigit(line.get(j).charAt(k))){
                    temp.add(Integer.parseInt(String.valueOf(line.get(j).charAt(k))));
                }
            }
            grid[j] = new int[temp.size()];
            for(int k=0;k<temp.size();k++) {
                grid[j][k] = temp.get(k);
            }
        }

        for(int j=0;j<grid.length;j++){
            for(int k=0;k<grid[j].length;k++){
                //System.out.print(grid[j][k]+" ");
            }
            //System.out.println();
        }

        maxAreaOfIsland(grid);
    }
}
