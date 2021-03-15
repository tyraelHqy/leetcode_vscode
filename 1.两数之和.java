import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];

        // 建立k-v，一一对应的哈希表
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                index[0] = i;
                index[1] = hashMap.get(nums[i]);
                return index;
            }
            hashMap.put(target-nums[i], i);
        }
        
        return index;
    }
}
// @lc code=end

