import java.util.HashMap;

public class SolutionTaskJava {
    public static void main(String[] args) {
        //Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
        int[] nums = {1, 3, 4, 5, 1, 5, 4};
        System.out.println(solution(nums));
    }

    public static HashMap<Integer, Integer> solution(int[] nums) {
        HashMap<Integer, Integer> countElement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countElement.get(nums[i]) == null) {
                countElement.put(nums[i], 1);
            }else {
                countElement.put(nums[i], countElement.get(nums[i])+ 1);
            }
        }
        return countElement;
    }
}
