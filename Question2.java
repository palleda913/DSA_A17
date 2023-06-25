package assignment17;

public class Question2 {

	 public static int maxSubarraySumCircular(int[] nums) {
	        int totalSum = 0;
	        int maxSum = Integer.MIN_VALUE;
	        int currentMax = 0;
	        int minSum = Integer.MAX_VALUE;
	        int currentMin = 0;
	 
	        for (int num : nums) {
	            totalSum += num;
	            currentMax = Math.max(currentMax + num, num);
	            maxSum = Math.max(maxSum, currentMax);
	            
	            currentMin = Math.min(currentMin + num, num);
	            minSum = Math.min(minSum, currentMin);
	        }
	        
	        if (maxSum > 0) {
	            return Math.max(maxSum, totalSum - minSum);
	        } else {
	            return maxSum;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] nums1 = {1, -2, 3, -2};
	        System.out.println(maxSubarraySumCircular(nums1)); 
	    }
}
