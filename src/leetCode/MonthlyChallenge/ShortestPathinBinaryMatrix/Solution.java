package leetCode.MonthlyChallenge.ShortestPathinBinaryMatrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    int min=Integer.MAX_VALUE;
    Set<String> visitedNode = new HashSet<>();
    public int shortestPathBinaryMatrix(int[][] grid) {
        visitedNode.add(0+""+0);
        shortestPath(grid,0,0);
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }

    //Time Limit Exceeded
    public void shortestPath(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid.length || grid[i][j]!=0){
            return;
        }
        if(i==grid.length-1 && j==grid.length-1){
            min = Math.min(min,visitedNode.size());
            return;
        }

        if(!visitedNode.contains((i+1)+""+j)){
            visitedNode.add((i+1)+""+j);
           shortestPath(grid,i+1,j);
            visitedNode.remove((i+1)+""+j);
        }

        if(!visitedNode.contains(i+""+(j+1))){
            visitedNode.add(i+""+(j+1));
            shortestPath(grid,i,j+1);
            visitedNode.remove(i+""+(j+1));
        }

        if(!visitedNode.contains((i-1)+""+j)){
            visitedNode.add((i-1)+""+j);
            shortestPath(grid,i-1,j);
            visitedNode.remove((i-1)+""+j);
        }

        if(!visitedNode.contains(i+""+(j-1))){
            visitedNode.add(i+""+(j-1));
            shortestPath(grid,i,j-1);
            visitedNode.remove(i+""+(j-1));
        }

        if(!visitedNode.contains((i+1)+""+(j+1))){
            visitedNode.add((i+1)+""+(j+1));
            shortestPath(grid,i+1,j+1);
            visitedNode.remove((i+1)+""+(j+1));
        }

        if(!visitedNode.contains((i-1)+""+(j-1))){
            visitedNode.add((i-1)+""+(j-1));
            shortestPath(grid,i-1,j-1);
            visitedNode.remove((i-1)+""+(j-1));
        }

        if(!visitedNode.contains((i+1)+""+(j-1))){
            visitedNode.add((i+1)+""+(j-1));
            shortestPath(grid,i+1,j-1);
            visitedNode.remove((i+1)+""+(j-1));
        }

        if(!visitedNode.contains((i-1)+""+(j+1))){
            visitedNode.add((i-1)+""+(j+1));
            shortestPath(grid,i-1,j+1);
            visitedNode.remove((i-1)+""+(j+1));
        }
     //   System.out.println("length = " + length);
      //  System.out.println("min = " + min);

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        //int a[][] = {{0,0,0},{1,1,0},{1,1,0}};
        //int a[][] = {{0,0,0},{1,0,0},{1,1,0}};
        //int a[][] = {{0,1},{1,0}};
        int a[][] = {{0,1,1,0,0,0},{0,1,0,1,1,0},{0,1,1,0,1,0},{0,0,0,1,1,0},{1,1,1,1,1,0},{1,1,1,1,1,0}};
        int result = s.shortestPathBinaryMatrix(a);
        System.out.println(result);
    }
}
