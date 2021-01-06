package leetCode.TopInterviewQuestion.GameOfLife;

public class Solution {

        public void gameOfLife(int[][] board) {

            int n=board.length;
            if(n<=0){
                return;
            }
            int m=board[0].length;
          for(int x=0;x<n;x++){
              for (int y=0;y<m;y++){

                  int count = nextState(board,x+1,y) + nextState(board,x,y+1) +
                          nextState(board,x-1,y) + nextState(board,x,y-1)+
                          nextState(board,x-1,y-1) + nextState(board,x+1,y+1)+
                          nextState(board,x-1,y+1) + nextState(board,x+1,y-1);

                  if(count<2 || count>3){
                      if(board[x][y]==1){
                          board[x][y]='-';
                      }else{
                          board[x][y]=0;
                      }
                  }
                  if(count==3){
                      if(board[x][y]==0) {
                          board[x][y] = '#';
                      }
                  }
              }
          }

            for(int x=0;x<n;x++) {
                for (int y = 0; y < m; y++) {
                    if(board[x][y]=='-'){
                        board[x][y]=0;
                    }
                    if(board[x][y]=='#'){
                        board[x][y]=1;
                    }
                }
            }

        }

        public int nextState(int[][] board,int x, int y){

            if(x<0 || y < 0 || x >=board.length || y>= board[0].length){
                return 0;
            }

           if(board[x][y]=='-'){
               return 1;
           }
           if(board[x][y]=='#'){
                return 0;
           }
           return board[x][y];

        }

        public static void main(String args[]){
            Solution s = new Solution();
            int [][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
            s.gameOfLife(board);
            System.out.println(board);

        }

}
