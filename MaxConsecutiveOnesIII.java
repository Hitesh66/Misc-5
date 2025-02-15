//Time Complexity O(N)
//Space ComplexityO(1)
//LeetCode tested

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int i=0;int j=0;

        while (i < nums.length){
            if(nums[i] == 0) k--;
            if(k<0){
                if(nums[j] == 0) k++;
                j++;
            }
            i++;
        }
        return i-j;
    }
}
