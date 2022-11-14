package com.greatlearning.main;

public class Stack
{

	private int arr[];
    private int top;
    private int capacity;
    
    
    Stack(int size)
    {
        arr = new int[size];
        top = -1;
        capacity = size+1;
    }
 
    
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
 
        
        arr[++top] = x;
    }
 
    
    public int pop()
    {
         
        if (isEmpty())
        {
            System.exit(-1);
        }
 
        System.out.print(peek()+" ");
 
        
        return arr[top--];
    }
 
    
    public int peek()
    {
        if (!isEmpty())
        {
            return arr[top];
        }
        else
        {
            System.exit(-1);
        }
 
        return -1;
    } 
 
    
    public int size()
    {
        return top + 1;
    }
    
    public boolean isEmpty()
    {
        return top == -1;               
    }
 
    
    public boolean isFull()
    {
        return top == capacity - 1;     
    }
	
}
