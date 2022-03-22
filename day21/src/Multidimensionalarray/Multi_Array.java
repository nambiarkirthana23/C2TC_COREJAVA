package Multidimensionalarray;

public class Multi_Array {
	public static void main(String[] args)
	{
		//twodimensional array
	int arr1[][]=new int[3][3];          
	int arr[][]={{10,20,30},{50,60,70},{80,90,100}};
	arr1[0]=new int[3];
	arr1[1]=new int[3];
	arr1[2]=new int[3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr[i][j]+" ");
        }
		System.out.println();
	
	
}
}
}
