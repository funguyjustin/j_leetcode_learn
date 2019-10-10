package leetcode;

import java.util.HashMap;

/**
 * @Author JustinChang
 * @Date 10/10/19
 * @Description: TODO
 **/
public class Solution01 {
    //暴力法:双循环,时间复杂度O(n2)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
    //两遍哈希表方式,  时间复杂度O(n) , 空间换时间的方式
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)&&map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    //一遍哈希方式
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}
