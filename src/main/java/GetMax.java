import java.util.*;
public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++)
        {
            nums.add(arr[i]);
        }
        Collections.sort(nums);
        
        int lastIndex = nums.size()-1;

        return nums.get(lastIndex);
    }
}
