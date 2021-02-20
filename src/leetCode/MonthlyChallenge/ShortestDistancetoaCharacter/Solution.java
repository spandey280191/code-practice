package leetCode.MonthlyChallenge.ShortestDistancetoaCharacter;

public class Solution {
    public int[] shortestToChar(String s, char c) {

        int[] res = new int[s.length()];
        int prev=Integer.MAX_VALUE;
        int next=-1;
        for(int i=0;i<s.length();i++){

            if(i>next){
                prev=next;
                next = findNext(c,s,i);
            }
            if(prev==-1){
                res[i] = Math.abs(next-i);
            }else{
                res[i] = Math.min(Math.abs(i-prev), Math.abs(next - i));
            }


        }


        return res;
    }

    public int findNext(char c, String s, int pos){
        boolean flag=true;
        int i=pos;
        while(flag && i<s.length()){
            if(c==s.charAt(i)){
                flag=false;
                break;
            }
          i++;
        }
        if(i>=s.length()){
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        s.shortestToChar("aaab",'b');
    }
}