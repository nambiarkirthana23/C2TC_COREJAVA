public class SmallestNumber {

	public static void main(String[] args) {
		int arr[]= {30,20,10};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("smallest number is "+min);
		
	}
}
