class InsertArrays 
{
    public static void main(String[] args) 
	{		
        int[] arr = {5,10,20,30,40,50,25,3};
        int insertvalue=25;
        int insertindex=4;
        int[] newarr = new int[arr.length -1];       
        for (int i = 0; i < insertindex - 1; i++)
		{
            newarr[i] = arr[i];
        }       
        newarr[insertindex - 1] = insertvalue;       
        for (int i = insertindex; i < newarr.length; i++)
		{
            newarr[i] = arr[i - 1];
        }       
        for (int i = 1; i < newarr.length; i++)
		{
            System.out.print(newarr[i] + " ");
        }
    }
}
