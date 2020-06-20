/*Write a Java program to print the following triangle:   
		*         
	  * * *                
	 * * * * *             
	* * * * * * *           
  * * * * * * * * *       
* * * * * * * * * * *
*/
package com.programX3;

import java.util.Scanner;

public class TrianglePyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		int count = 1;
		for(int i=0; i<n; i++)
		{
			for(int spc = n-i; spc>0; spc--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<count; j++)
			{
				System.out.print("*");
			}
			count =count +2;
			System.out.println();			
		}
	}
}
