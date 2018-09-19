package ejb;

import javax.ejb.Stateless;
import java.util.ArrayList;

@Stateless
public class Sorting {

    public String sorting(ArrayList<Integer> nums){
        String result ="";

        /*
        Collections.sort(nums);
        Если вариат сортировки через Collections Вас не устраивает то:
         */

        for (int i = nums.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int tmp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, tmp);
                }
            }
        }
        for (int n : nums){
            result += " " +n;
        }
        return result;
    }
}
