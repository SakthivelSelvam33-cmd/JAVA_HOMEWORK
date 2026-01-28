import java.util.Scanner;
import java.util.Arrays;
class Array5
{
	int n;
	int arr[];
	int target;
	int searchvalue;
	int key;
	public void entervalue(Scanner sc)
	{
		System.out.println("Array elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Array elements");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter elements"+i+"indexes");
			arr[i]=sc.nextInt();
			
		}
		
	}
	public void display()
	{
		System.out.println("Array elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void bubblesort()
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public  static int[] mergedivide(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergedivide(Arrays.copyOfRange(arr,0,mid));
		int[] right=mergedivide(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);
	}
	public static int[] merge(int[] left,int[] right)
	{
		int newarr[]=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length &&j<right.length)
		{
			if(left[i]<right[j])
			{
			newarr[k]=left[i];
			i++;
			k++;
			}
			else if(left[i]>right[j])
			{
				newarr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newarr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newarr[k]=right[i];
			j++;
			k++;
		}
		return	newarr;	
	}
	public  void print(int[] arr)
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public void linearsearch(int key)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element found at position"+i+1);	
			}
		}
	}
	
		public static int binary(int searchvalue)
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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Accept Array");
            System.out.println("2. Display Array");
            System.out.println("3. Sort Array");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    entervalue(sc);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Merge Sort");
                    int s = sc.nextInt();
                    if (s == 1) bubblesort();
                    
                    else if (s == 2) {
                        mergedivide(0, n - 1);
                        
                        System.out.println("Array sorted using Merge Sort.");
                    } else
                        System.out.println("Invalid choice.");
                    break;

                case 4:
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");
                    int se = sc.nextInt();
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    if (se == 1)
                        linearSearch(key);
                    else if (se == 2)
                        binary(arr,searchvalue);
                    else
                        System.out.println("Invalid choice.");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
	}
}