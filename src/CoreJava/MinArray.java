package CoreJava;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = {{2,12,6},{3,11,1},{5,7,8}};
		int min=abc[0][0];
		int mincoloumn = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)//2
				{
					min=abc[i][j];
					mincoloumn=j;
				}
			}
		}
		System.out.println(min);
		System.out.println(mincoloumn);
		//=1
		int max=abc[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
			if(abc[k][mincoloumn]>max)
			{
				max=abc[k][mincoloumn];
			}
			k++;
		}

		System.out.println(max);
		System.out.println("successfully");
	}

}