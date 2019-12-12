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
public class Mystack implements Myinterface{

   

    int arr[];
    int top;
    int cap;
    
   Mystack(int size)
   {
    arr = new int [size];
    cap = size;
    top = -1;
   }

   
    public void insert(int i)
   {
          System.out.println( i + "  inserted");
          arr[++top]= i; 
   }   
   
    public int delete()
    {
        return arr[top --];
    }
    
    public int peek()
    {
      return arr[top];
      
    }
    public boolean isEmpty() {
       System.out.println("stack is empty");
      return (top == -1);
   }
   public boolean isFull(int maxSize) {
        System.out.println("stack is full");
      return (top == maxSize - 1);
   }
   
   public void display(){

            System.out.println("Elements present are");
            for(int i=0;i<top+1;i++)
            {
                System.out.println(arr[i]);
            }
        }
 
     
       public static void main(String[] args) {
        // TODO code application logic here
         int i,a,n;
         Mystack stk = new Mystack(10);
      Scanner s= new Scanner(System.in);
       
      System.out.println("Enter no of queries :");
 n = s.nextInt();

for(i=0;i<n;i++)
{

System.out.println("1..  insert a number");
System.out.println("2..  delete a number");
System.out.println("3..  peek elements");
System.out.println("4..  display ");
System.out.println("_____________________");
System.out.println("enter option");
a =s.nextInt();

switch(a)
{
case 1:
System.out.println("enter the element to be insert");
int push = s.nextInt();
stk.insert(push);
break;

case 2:
System.out.println(stk.delete() + " Deleted from the stack");
break;

case 3:
System.out.println(stk.peek() +"peek top most element of the stack");
break;

case 4:
 stk.display();
break;
    
default:
System.out.println("invalid");
break;

}

}
  }  

    
}
