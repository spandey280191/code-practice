package leetCode.TopInterviewQuestion.SurroundedRegions;

public class SolutionGFS {

    public void solve(char[][] board) {

        int n=board.length;
        if(n==0){
            return;
        }
        int m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]= '-';
                }


            }
        }

        //UP
        for (int j=0;j<m;j++){
            if( board[0][j] == '-'){
                fillBoard(board,0,j);
            }
        }

        //DOWN

        for (int j=0;j<m;j++){
            if( board[n-1][j] == '-'){
                fillBoard(board,n-1,j);
            }
        }

        //LEFT

        for (int i=0;i<n;i++){
            if( board[i][0] == '-'){
                fillBoard(board,i,0);
            }
        }

        //RIGHT

        for (int i=0;i<n;i++){
            if( board[i][m-1] == '-'){
                fillBoard(board,i,m-1);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='-'){
                    board[i][j]= 'X';
                }


            }
        }

    }

    public void fillBoard(char[][] board, int x, int y){

        if(x<0 || y<0 || x>=board.length || y >= board[0].length){
            return;
        }
        if(board[x][y]!='-'){
            return;
        }
        board[x][y]='O';

        fillBoard(board,x+1,y);
        fillBoard(board,x,y+1);
        fillBoard(board,x-1,y);
        fillBoard(board,x,y-1);

    }

    public static void main(String[] args){

        char[][] arr = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        SolutionGFS s = new SolutionGFS();
        s.solve(arr);
        System.out.println(arr);

    }
}
