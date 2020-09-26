public class TwoSum {
    /**
     * @Description
     * 思想：暴力解封，遍历所有结果
     * 时间复杂度：
     * 空间复杂度：
     * 优缺点：
     **/
    public int[] twoSum1(int[] nums, int target){
        if (nums == null){
            return null;
        }
        for (int i = 0 ; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if ( nums[i] + nums[j] == target ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * @Description
     * 思想：使用map减少遍历
     * 时间复杂度：
     * 空间复杂度：
     * 优缺点：
     **/
    public int[] twoSum2(int[] nums, int target) {
        if (nums == null){
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0 ; i < nums.length ; i ++){
            int other = target - nums[i];
            if (map.containsKey(other)){
                return new int[]{i,map.get(other)};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}