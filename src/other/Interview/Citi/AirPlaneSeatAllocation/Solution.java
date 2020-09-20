package other.Interview.Citi.AirPlaneSeatAllocation;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int solution(int N, String S) {

        int count = 0;

        Map<Integer, List<List<Integer>>> seatDetails = new HashMap<Integer, List<List<Integer>>>();

        for (int i = 0; i < N; i++) {
            List<List<Integer>> rows = new ArrayList<>();
            List<Integer> s1 = new ArrayList<>();
            s1.add(0);
            s1.add(0);
            s1.add(0);

            List<Integer> s2 = new ArrayList<>();
            s2.add(0);
            s2.add(0);
            s2.add(0);
            s2.add(0);

            List<Integer> s3 = new ArrayList<>();
            s3.add(0);
            s3.add(0);
            s3.add(0);

            rows.add(s1);
            rows.add(s2);
            rows.add(s3);
            seatDetails.put(i, rows);
        }

        preFillSeats(seatDetails, S);

        for (int i = 0; i < N; i++) {

            List<List<Integer>> rowDetails = seatDetails.get(i);

            for (List<Integer> row : rowDetails) {
                int vacantSeat = 0;
                for (Integer r : row) {

                    if (r == 0) {
                        vacantSeat++;
                    } else {
                        vacantSeat = 0;
                    }

                }

                if (vacantSeat >= 3) {
                    count++;
                }

            }

        }

        return count;
    }

    public void preFillSeats(Map<Integer, List<List<Integer>>> seatDetails, String S) {

        if (null == S || S.length() == 0) {
            return;
        }

        for (String str : S.split(" ")) {

            Integer rowNum = Integer.valueOf(str.substring(0, 1));
            rowNum=rowNum-1;
            String seatNumber = str.substring(1);

            switch (seatNumber) {
                case "A":
                    seatDetails.get(rowNum).get(0).set(0, 1);
                    break;
                case "B":
                    seatDetails.get(rowNum).get(0).set(1, 1);
                    break;
                case "C":
                    seatDetails.get(rowNum).get(0).set(2, 1);
                    break;
                case "D":
                    seatDetails.get(rowNum).get(1).set(0, 1);
                    break;
                case "E":
                    seatDetails.get(rowNum).get(1).set(1, 1);
                    break;
                case "F":
                    seatDetails.get(rowNum).get(1).set(2, 1);
                    break;
                case "G":
                    seatDetails.get(rowNum).get(1).set(3, 1);
                    break;
                case "H":
                    seatDetails.get(rowNum).get(2).set(0, 1);
                    break;
                case "J":
                    seatDetails.get(rowNum).get(2).set(1, 1);
                    break;
                case "K":
                    seatDetails.get(rowNum).get(2).set(2, 1);
                    break;
            }


        }
    }

    public static void main(String args[]) {

        Solution s = new Solution();
        String S = "1A 2F 1C";
        System.out.println(s.solution(2, S));

    }
}

