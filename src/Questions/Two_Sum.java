package Questions;

public class Two_Sum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println(i + "" +j);
				}
			}
		}
		
		
		int[] sol = Two_Sum.twoSum(nums, target);
		for(int i=0;i>sol.length;i++)
		{
		System.out.println(sol[i]);
		}
		

	}
	
	public static int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];
        int sum =0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(nums[i]+nums[j]==sum)
                {
                    output[0] = nums[i];
                    output[1] = nums[j];
                }
            }
        }
        return output;
        
    }

}
