package Backtracking;

public class Rat_In_A_Maze_All_Paths {

	static void ratInAMaze(int maze[][], int n) {
        int[][]path=new int[n][n];
        
		solve(maze,0,0,path,n);

	}
	 static void solve(int maze[][], int row, int col, int[][]path, int n){
        //Destination reached
        if(row==n-1 && col==n-1){
             //include the current cell
             path[row][col]=1;
            //now print
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(path[i][j]+" ");
                }   
            }
            System.out.println();
             return;
        }
        //All invalid row and col
        if(row<0 || row>=n || col<0 ||col>=n)
            return;
        
        //bolcked cell condition
        if(maze[row][col]==0 || path[row][col]==1)
          return;
        
        //include the current cell
        path[row][col]=1;
           
        
        //going up
        solve(maze,row-1,col,path,n);
        //going down
        solve(maze,row+1,col,path,n);
        //going left
        solve(maze,row,col-1,path,n);  
        //going right
        solve(maze,row,col+1,path,n);
          
        path[row][col]=0;
    }
}
