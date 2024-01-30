public class BinarySearch
{
    public static int binarySearch(int[] nums, int start, int end, int key){
        int middle = (start + end)/(2);
        if(end - start <= 1) {
            if(nums[start]==key)return start;
            if(nums[end]==key)return end;
            return -1;
        }
        if (nums[middle]<=key){
            return binarySearch(nums, middle, end, key);
        }
        else {
            return binarySearch(nums, start, middle, key);
        }
    }
}