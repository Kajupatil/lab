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
       if(isFull())
       {
           System.out.println("Overflow");
           System.exit(top);
       }
       
          System.out.println("inserting" + i);
          arr[++top]= i; 
   }   
   
    public int delete()
    {
       if(isEmpty()){
       System.out.println("Underflow"); 
       System.exit(top);
       }
        System.out.println("Removing" +peek());
        return arr[top --];
    }
    
    public int peek()
    {
     if(!isEmpty())
        return arr[top];
     else
         System.exit(top);
     
     return -1;     
    }
     
       public static void main(String[] args) {
        // TODO code application logic here
         int i,a,n;
         Mystack stk = new Mystack();
      Scanner s= new Scanner(System.in);
       
      System.out.println("Enter no of queries :");
 n = s.nextInt();

for(i=0;i<n;i++)
{

System.out.println("1 for insert a number");
System.out.println("2 for delete a number");
System.out.println("3 for peek elements");
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

default:
System.out.println("invalid");
break;

}

}

      
      
        
       
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
