package com.greatlearning.main;

public class Queue
{

	private static int front, rear, capacity;   
    private static int queue[];  
    static int queueCount=0;
    
     
    Queue(int size)
    {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
    
    void queueEnqueue(int item)
    {    
        if (capacity == rear) {   
            System.out.print("\nQueue is full\n");   
            return;   
        }
        else
        {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }   
     

    int checkQueue(int number)
    {
    	int count=0;
    	
    	if (front == rear)
    	{   
            System.out.print("\nQueue is empty\n");   
            return 0;   
        }  
    	
    	else
    	{  
    		if(queue[queueCount] == number)
    		{
    			int val = number;
    			
    			int que = queueCount;
    			
    			while(que > 0 && val >0)
    			{
    				
    				val= val-1;
    				que = que-1;
    				if(queue[que] == val)
    				{
    					count++;
    				}
    			}
    			queueCount++;
    			return count+1;
    			
    			
    		}
    		queueCount++;
                 
           }   
    	
    	return 0;
    }
	
}
