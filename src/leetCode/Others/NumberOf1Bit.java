package leetCode.Others;

public class NumberOf1Bit {

    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);
        String[] arr = s.split("");
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i].equals("1")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
