/*Print below pattern             
 #####          
 ####           
 ###             
 ##             
 # 
*/
package com.program5;

public class Pyramids 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int s=1; s<i; s++)
			{
				System.out.print(" ");
			}
			for(int j=5; j>=i; j--)
			{
				System.out.print("#");
			}
			System.out.println("");	
		}
	}
}
