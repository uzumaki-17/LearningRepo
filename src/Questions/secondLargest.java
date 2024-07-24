package Questions;

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int inp1 = sc.nextInt();
		System.out.println("enter the n value where n represent the nth largest value: ");
		int inp2 = sc.nextInt();
		int [] arr = new int[inp1];
		sc.nextLine();
		
		for(int i=0;i<inp1;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		
		
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
		System.out.println();
		System.out.println(arr[inp2-1]+" this is the "+inp2 +"th largest number");
		
		
		

	}

}
