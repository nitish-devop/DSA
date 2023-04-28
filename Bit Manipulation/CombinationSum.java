import java.util.ArrayList;

// Write a program to find all possible solution to find combination of array item in order to sum it as target
public class CombinationSum {
    public static void combinationSum(int[] nums,int idx,int target,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> combo){
        // base case
        if(idx == nums.length){
            if(target == 0)
                ans.add(combo);
            return ;
        }

        // Check if curr value is less than target
        if(nums[idx] <= target){
            // include curr element
            combo.add(nums[idx]);
            combinationSum(nums, idx+1, target-nums[idx], ans, combo);
            // remove curr element
            Integer num = nums[idx];
            combo.remove(num);
        }
        // backtrack
        combinationSum(nums, idx+1, target, ans, combo);
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        int target = 8;
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        combinationSum(nums, 0, target, null,new ArrayList<Integer>());
        System.out.println(ans.toString());
    }
}
