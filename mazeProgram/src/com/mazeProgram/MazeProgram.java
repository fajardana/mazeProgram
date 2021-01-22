package com.mazeProgram;

import java.util.Scanner;

public class MazeProgram {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Maze(n);
	}
	public static void Maze(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0 && j>1 && j<n && i<n)
				{
					System.out.print(" ");
				}
				else if(((i+1)%4==0 && j==n-1 ) || ((i-1)%4==0 && j==2))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("@");
				}
			}
			System.out.println("");
			
		}
	}
}
