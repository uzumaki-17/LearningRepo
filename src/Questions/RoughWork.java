package Questions;



public class RoughWork {
	
	public static void main(String[] args)
	{
		int[] nums = {1, 1, 3, 3, 3, 5, 8, 8, 9};
		int counter = 1;
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i]!=nums[i-1])
	            {
	                // counter++;
	                nums[counter++] = nums[i];
	                System.out.println(counter);
	                // counter++;
	            }
	        }
//		System.out.println();
		for(int i=0;i<counter;i++)
		{
			System.out.print(nums[i]);
		}
	}
}
