/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarearch;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Myqueue implements Myinterface {
    
    int arr[];
    int front;
    int rear;
    int cap;
    int count;
    
    
    Myqueue(int size)
    {
        arr = new int[size];
        cap = size;
        rear = -1;
        front = 0;
        count = 0;
    }
    
    @Override
    public void insert(int i) {
       System.out.println( i + "  inserted");
          rear = (rear + 1) % cap;
          arr[rear]= i;
          count++;
    }

    @Override
    public int delete() {
        System.out.println(arr[front] + "  Deleted from the queue"); 
        front = (front + 1) % cap; 
        return count--;
     }

    @Override
    public int peek()
    {
        return arr[front];   
    }

    @Override
    public void display() {
        System.out.println("Elements present are");
            for(int i=0;i<rear+1;i++)
            {
                System.out.println(arr[i]);
            }
        } 
      
    public int exit()
    {
        return 0;
    }
    public int size()
    {
        return count;
    }
    
    public boolean isEmpty() {
       System.out.println("queue is empty");
      return (size() == 0);
   }
   public boolean isFull(int maxSize) {
        System.out.println("queue is full");
      return (size() == cap);
    
   } 
   
   
    public static void main(String[] args) {
        int i,a,n;
        Myqueue queue = new Myqueue(1000);
        Scanner s= new Scanner(System.in);
       
      System.out.println("Enter no of queries :");
      n = s.nextInt();

for(i=0;i<n;i++)
{
System.out.println("_____________________");
System.out.println("1..  insert a number");
System.out.println("2..  delete a number");
System.out.println("3..  peek elements");
System.out.println("4..  display ");
System.out.println("5..  exit ");
System.out.println("_____________________");
System.out.println("enter option");

a =s.nextInt();

switch(a)
{
case 1:
System.out.println("enter the element to be insert");
int push = s.nextInt();
queue.insert(push);
break;

case 2:
queue.delete();
break;

case 3:
System.out.println(queue.peek() +"peek top most element of the queue");
break;

case 4:
queue.display();
break;
  
case 5:
queue.exit();
break;
    
default:
System.out.println("invalid");
break;

}  
}       
}    
}