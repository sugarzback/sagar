/*Write a program to generate a following @'s triangle:    
@         
@@               
@@@            
@@@@        
@@@@@*/
package com.programX2;

import java.util.Scanner;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			for (int spc= n-i; spc>0; spc--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
