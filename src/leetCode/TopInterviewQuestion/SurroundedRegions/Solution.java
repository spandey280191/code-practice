package leetCode.TopInterviewQuestion.SurroundedRegions;

public class Solution {

    public void solve(char[][] board) {

        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(i==0 || j==0 || i==n-1 || j==m-1){
                    continue;
                }

                if(board[i][j]=='O'){
                    isSurrounded(board,i,j);
                }
            }
        }

    }

    public boolean isSurrounded(char[][] board,int i,int j){

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='*'){
            return false;
        }
        if(board[i][j]!='O'){
            return true;
        }
        char prev= board[i][j];
        board[i][j]='*';
        boolean result = isSurrounded(board,i+1,j) && isSurrounded(board,i-1,j)
                && isSurrounded(board,i,j+1) && isSurrounded(board,i,j-1);
        board[i][j]=prev;
        if(result){
            board[i][j]='X';
        }

        return result;
    }

    /*public void solve(char[][] board) {

        int n=board.length;
        if(n==0){
            return;
        }
        int m=board[0].length;
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                if(i==0 || j==0 || i==n-1 || j==n-1){
                    continue;
                }

                if(board[i][j]=='O'){
                    if(isSurrounded(board,i,j)){
                        board[i][j]='X';
                    }
                }
            }
        }

    }

    public boolean isSurrounded(char[][] board,int i,int j){

        boolean r1=false,r2=false,r3=false,r4=false;
        int i1=i;
        int j1=j;
        i=i+1;
        while(!(i>=board.length || j>=board[0].length || i<0 || j<0)){
            if(board[i][j]=='X'){
                r1=true;
                break;
            }
            i=i+1;
        }
        i=i1;
        j=j1;
        i=i-1;
        while(!(i>=board.length || j>=board[0].length || i<0 || j<0)){
            if(board[i][j]=='X'){
                r2=true;
                break;
            }
            i=i-1;
        }
        i=i1;
        j=j1;
        j=j+1;
        while(!(i>=board.length || j>=board[0].length || i<0 || j<0)){
            if(board[i][j]=='X'){
                r3=true;
                break;
            }
            j=j+1;
        }
        i=i1;
        j=j1;
        j=j-1;
        while(!(i>=board.length || j>=board[0].length || i<0 || j<0)){
            if(board[i][j]=='X'){
                r4=true;
                break;
            }
            j=j-1;
        }
        i=i1;
        j=j1;

        return r1 & r2 & r3 & r4;
    }*/
    public static void main(String[] args){

        char[][] arr = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        Solution s = new Solution();
        s.solve(arr);
        System.out.println(arr);

    }
}
