package Backtracking;

public class Rat_In_A_Maze {

	public static boolean ratInAMaze(int maze[][]){
		int n=maze.length;
        int[][]path=new int[n][n];
		return solve(maze,0,0,path);

	}
    public static boolean solve(int maze[][], int row, int col, int[][]path){
        int n=maze.length;
        
        //All invalid row and col
        if(row<0 || row>=n || col<0 ||col>=n)
            return false;
        
        //bolcked cell condition
        if(maze[row][col]==0 || path[row][col]==1)
          return false;
        
        //include the current cell
        path[row][col]=1;
        
        //Destination reached
        if(row==n-1 && col==n-1){
             return true;
        }
           
        
        //going up
        if(solve(maze,row-1,col,path)){
           return true;
        }
        //going down
        if(solve(maze,row+1,col,path)){
            return true;
        }
        //going right
        if(solve(maze,row,col+1,path)){
            return true;
        }
        //going left
        if(solve(maze,row,col-1,path)){
            return true;
        }
        return false;
    }
}
