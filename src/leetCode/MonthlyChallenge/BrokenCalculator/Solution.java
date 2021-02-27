package leetCode.MonthlyChallenge.BrokenCalculator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class GFG
{
    int val;
    int steps;

    public GFG(int val, int steps)
    {
        this.val = val;
        this.steps = steps;
    }
}
public class Solution {

    private static int brokenCalc(int src,
                                     int target)
    {

        Set<GFG> visited = new HashSet<>(1000);
        LinkedList<GFG> queue = new LinkedList<GFG>();

        GFG node = new GFG(src, 0);

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty())
        {
            GFG temp = queue.poll();
            visited.add(temp);

            if (temp.val == target)
            {
                return temp.steps;
            }

            int mul = temp.val * 2;
            int sub = temp.val - 1;

            // given constraints
            if (mul > 0 && mul < target*2)
            {
                GFG nodeMul = new GFG(mul, temp.steps + 1);
              //  if(!visited.contains(nodeMul)){
                    queue.offer(nodeMul);
              //  }
            }
            if (sub > 0 )
            {
                GFG nodeSub = new GFG(sub, temp.steps + 1);
               // if(!visited.contains(nodeSub)){
                    queue.offer(nodeSub);
               // }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.brokenCalc(1,1000000000);
        System.out.println(result);
    }
}
