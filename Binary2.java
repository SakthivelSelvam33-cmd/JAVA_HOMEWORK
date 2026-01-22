class Binary2
{
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50};
		int searchvalue=30;
		Binary2 b2=new Binary2();
		int index=binary(arr,searchvalue);
		System.out.println(index);
	}
		public static int binary(int arr[],int searchvalue)
		{
		int left=0;
		int right=arr.length;
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

		
		
	
