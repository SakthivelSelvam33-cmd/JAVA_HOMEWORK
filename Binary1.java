class Binary1
{
	public static void main(String[] args)
	{
		int arr[]={2,5,8,12,16,23,38};
		int searchvalue=16;
		Binary1 b1=new Binary1();
		int index=binarysearch(arr,searchvalue);
		System.out.println(index);
	}
		public static int binarysearch(int arr[],int searchvalue)
		{
		int left=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		while(left<=right)
		{
			if(searchvalue==arr[mid])
			{
				return mid;
			}
			if(searchvalue>arr[mid])
			{
				left=mid;
			}
			if(searchvalue<arr[mid])
			{
				right=mid;
			}
			mid=(left+right)/2;
		}return -1;
		}
}

		
	
