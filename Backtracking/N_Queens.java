package Backtracking;

public class N_Queens {
	public static void placeNQueens(int n){
		
		  int[][]board=new int[n][n];

			solve(board,0);
		}
		public static void solve(int[][]board,int col){
	        //Base case if we already fill all the column
	        //which means we have an solution so print it and return
	        if(col==board.length){
	           for(int i=0;i<board.length;i++){
	               for(int j=0;j<board.length;j++)
	                   System.out.print(board[i][j]+" ");
	           }
	            System.out.println();
	            return;
	        }
	        
	        //try to place the queen in every row at a particular column
	        for(int row=0;row<board.length;row++){
	            //check can we place queen at current position or not
	            if(validate(board,row,col)){
	            	//If yes
	                //place the queen at current position
	                board[row][col]=1;
	                //recursive call
	                solve(board,col+1);
	                //backtracking
	                board[row][col]=0;
	            }
	        }
	    }
	    public static boolean validate(int[][]board,int row,int col){
	        int tempRow=row;
	        int tempCol=col;
	        
	        //Checking diagonally upward in left
	        while(row>=0 && col>=0){
	            if(board[row][col]==1)
	                return false;
	            
	            row--;
	            col--;
	        }
	        
	        row=tempRow;
	        col=tempCol;
	        //Checking in left direction
	        while(col>=0){
	            if(board[row][col]==1)
	                return false;
	            
	            col--;
	        }
	        
	        row=tempRow;
	        col=tempCol;
	        //Checking diagonally downward in left
	         while (col >= 0 && row < board.length) {
	            if (board[row][col] == 1) 
	                  return false;
	            col--;
	            row++;
	        }
	        return true;
	    }
}
