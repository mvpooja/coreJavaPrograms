package com.test.prog;

public class Pat3 
{
 public static void main(String[] args) 
 {
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		k=i;
		for(j=5;j>=i;j--)
		{
			System.out.print(k+++" ");
		}
		System.out.println();
	}
	
}
	
}

