/*  
 	  *          
    * * *                 
   * * * * *             
 * * * * * * *        
   * * * * *            
     * * *     
 	   *
*/
package com.programX4;

import java.util.Scanner;

public class FullTriangle 
{
		public static void main(String[] args) 
		{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		int count = 1;
		int noOfSpace = 1;
		for(int i=1; i<(n*2);i++)
		{
			for(int spc= n - noOfSpace; spc>0; spc--)
			{
				System.out.print(" ");
			}
			if(i<n)
			{
				noOfSpace++;
			}
			else
			{
				noOfSpace--;
			}
			for(int j=0;j<count;j++)
			{
				System.out.print("*");
			}
			if(i<n)
			{
				count = count +2;
			}
			else
			{
				count = count -2;
			}
			System.out.println();
		}	
	}
}