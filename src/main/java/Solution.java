public class Solution {
    public int findMin(int[] nums) {
        //TODO
        int pivot = findPivot(nums);



        return pivot == nums.length - 1 ? nums[0] : nums[pivot + 1];
    }
    public int findPivot(int[] array){

        if(array.length == 0) return  -1;

        int left = 0;
        int right = array.length - 1;
        if(array[left] < array[right]) return -1;


        while(left < right){
            int middleIndex = (right + left) / 2;
            if(array[right] < array[middleIndex]){
                left = middleIndex;
            }
            if(array[left] > array[middleIndex]){
                right = middleIndex;
            }
            if(right - left == 1 && array[left] > array[right]) return left;
        }

        return -1;
    }
}