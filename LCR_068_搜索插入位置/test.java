package title.LCR_068_搜索插入位置;

public class test {
    public static void main(String[] args) {
        new Solution().searchInsert(new int[] {1,3,5,6}, 2);
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}