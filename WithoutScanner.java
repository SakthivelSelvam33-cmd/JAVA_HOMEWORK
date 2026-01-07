class WithoutScanner
{
	public static void main(String[] args)
	{
		char[][] a={{'V','I','J','A','Y'},{'A','J','I','T','H'},{'K','A','M','A','L'},{'S','I','M','B','U'}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}