/*Print below pattern            
1         
12         
123         
1234         
12345
*/
package com.program9;

public class TestFor 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println();
			for(int j=1; j<=i; j++)
			{
			System.out.print(j);
			}
		}
		System.out.println();
	}
}
