/**
 * 
 */
package unittesting;


class MaxNumbertest {

	public static int maxNum(int arr[])//1,2,3,4
	{
		
		int max=0;
		for(int i=0;i<arr.length;i++)//0<3 1<3
		{
			if(max<arr[i])//max=1<arr[0]=1 max=1<arr[1]=2 max=2<arr[2]=3 max=3<arr[3]==4
			{
				max=arr[i];//max=2 max=3 max=4
			}
			
		}
		return max;//4
	}



}
