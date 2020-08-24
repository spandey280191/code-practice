package leetCode.Others;

public class HammingDifference {


    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        HammingDifference h = new HammingDifference();

        System.out.println(h.hammingDistance(1, 4));
    }
}
