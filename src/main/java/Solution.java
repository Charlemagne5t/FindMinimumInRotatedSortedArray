class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if( n == 1 || nums[0] < nums[n - 1]) {
            return nums[0];
        }
        int p = findPivot(nums);

        return nums[p];
    }

    int findPivot(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int mid;
        int pivot = n;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if(nums[mid] >= nums[0]) {
                l = mid + 1;
            }else {
                pivot = mid;
                r = mid - 1;
            }
        }

        return pivot;
    }
}