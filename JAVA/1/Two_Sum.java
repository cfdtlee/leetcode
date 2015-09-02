//condition I didn't take into consideration:
//[-1,-2,-3,-4,-5], -8;[0, 4, 3, 0], 0
//Try to use Hash Table
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        // ArrayList<Integer> list = new ArrayList<Integer>(nums);
        int a = 0, b = 0, index1 = 0, index2 = 0;
        for(int i=0; i < nums.length; i++) {
        	a = nums[i];
        	//if(a <= target){
        		for(int j = i+1; j < nums.length; j++) {
        			b = nums[j];
        			if(a + b == target) {
        				index1 = i+1;
        				index2 = j+1;
        				// System.out.println(index1);//
        				break;
        			}
        		}
        		if(index2 != 0) {
        			break;
        		}
        	//}
        }
        int[] result = new int[2];
        if(index1 <= index2){
			// result = {index1, index2};
			result[0] = index1;
			result[1] = index2;
        }
        else {
        	result[1] = index1;
        	result[0] = index2;
        	// result = {index2, index1};
        }

        return result;
    }
    public static void main(String[] args) {
    	int[] numbers = {-1,-2,-3,-4,-5};
    	int target = -8;
		for(int i: twoSum(numbers, target)){
			System.out.println(i);
		}
    }
}