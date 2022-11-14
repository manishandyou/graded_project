package com.greatlearning.main;

import java.util.*;

public class Main

{

	static int arr[];
	static int f = 0;
	
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the total no of floors in the building:");
			
			int max = sc.nextInt();
			
			System.out.println(max);
			
			int i;
			
			Queue q = new Queue(max+1);
			Stack stack = new Stack(max+1);
			
			try (Scanner input = new Scanner(System.in))
			{
			
				for( i=1; i < max+1; i++)
				{
					System.out.println("Enter the floor size given on day : "+ i );
					int num = input.nextInt();
					q.queueEnqueue(num);
					stack.push(i);
					
				}
			}
			
			System.out.println("The order of construction is as follows:");
			
			for(int j=1; j<max+1; j++)
			{
				System.out.println();
				System.out.println("Day :" + j);
				
				int some = q.checkQueue(stack.peek());
				
				while(some > 0)
				{
					stack.pop();
					some--;
				}
				while(j==max)
				{
					stack.pop();
				}			
			}
		}

	}
	
}
