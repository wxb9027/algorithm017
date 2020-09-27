public class MoveZeroes {
    /**
     * @Description
     * 非0元素左移，右端剩余原属置0
     **/
    public void moveZeroes1(int[] nums){
        int copyToMe = 0;
        for ( int i = 0; i < nums.length; i++ ){
            if ( nums[i] != 0 ){
                nums[copyToMe++] = nums[i];
            }
        }
        while ( copyToMe < nums.length ){
            nums[copyToMe++] = 0;
        }
    }

    /**
     * @Description
     * 基于上版结构优化 --> for
     **/
    public void moveZeroes1_2(int[] nums){
        int copyToMe = 0;
        for ( int e : nums ){
            if ( e != 0 ){
                nums[copyToMe] = e;
            }
        }
        while ( copyToMe < nums.length ){
            nums[copyToMe++] = 0;
        }
    }

    /**
     * @Description
     * 将非0元素交换到左端
     **/
    public void moveZeroes2(int[] nums) {
        for ( int left = 0, right = 0; right < nums.length; ){
            if (nums[right] == 0){
                right ++;
                continue;
            }
            if ( nums[right] != 0 ){
                int tmp = nums[right];
                // 这里不能写nums[right] = 0  ，为什么？ 考虑nums[left]为非0
                nums[right] = nums[left];
                nums[left] = tmp;
                right ++;
                left ++;
            }
        }
    }
    /**
     * @Description //TODO
     * 基于上一版代码结构优化 --> for
     **/
    public void moveZeroes3(int[] nums) {
        for ( int left = 0, right = 0 ; right < nums.length; right++ ){
            if ( nums[right] != 0 ){
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left++] = tmp;
            }
        }
    }

    /**
     * @Description
     * 基于上一版代码结构优化 --> while
     **/
    public void moveZeroes4(int[] nums) {
        int left = 0, right = 0;
        while ( right < nums.length ){
            if ( nums[right] !=0 ){
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left ++;
            }
            right ++;
        }
    }
}