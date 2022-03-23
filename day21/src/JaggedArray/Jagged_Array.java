package JaggedArray;

public class Jagged_Array {
public static void main(String[] args)
{
	int arr[][]=new int[5][];
	arr[0]=new int[3]; ///hold upto  3 values
	arr[1]=new int[3];
	arr[2]=new int[3];
	arr[3]=new int[3];
	arr[4]=new int[3];
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			int count=0;
			arr[i][j]=count++;
			
		}
	}
	//displaying 
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}

}
