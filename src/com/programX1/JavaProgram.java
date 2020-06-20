/* Print below pattern                      
 1          
 2   3        
 4    5    6          
 7    8    9   10 */
package com.programX1;

public class JavaProgram 
{
	public static void main(String[] args) 
	{
		int i,j,n=1;
		for(i=0;i<5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
}
