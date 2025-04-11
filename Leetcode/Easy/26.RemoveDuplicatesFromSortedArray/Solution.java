class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2};

        int k = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;

        if(nums.length == 1) {
            return 1;
        }

        for(int i = 0; i < nums.length - 1; i++) {
            int count = 0;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    nums[j] = -101;
                    count++;
                } else {
                    i += count;
                    break;
                }
            }
        }

        for(int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == -101) {
                for(int j = i + 1; j < nums.length; j++){
                    int temp = 0;
                    if (nums[j] != -101) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        k++;
                        break;
                    }
                }
                continue;
            }
            k++;
        }

        return k;
    }
}