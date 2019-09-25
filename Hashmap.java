
 
package hashmap;

import java.util.Hashtable;
import java.util.Scanner;

class HashTable{
   int[] arr;
   int totalsize;
 
    public HashTable(int totalsize)
    {
        this.totalsize = (totalsize);
        arr = new int[this.totalsize];
    }

    public void insert(int ele)
    {
        arr[ele % totalsize] = ele;
    }
    
    public void delete(int ele)
    {
        if (arr[ele % totalsize] == ele)
            arr[ele % totalsize] = 0;
        else
            System.out.println("\nError : Element not found\n");
    }
    
    public boolean search(int ele)
    {
        return arr[ele % totalsize] == ele;
    }
    
 public void printTable()
    {
        System.out.print("\nHash Table = ");
        for (int i = 0; i < totalsize; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }
}

public class Hashmap {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to store in array");
        
        HashTable ht = new HashTable(sc.nextInt() );
        
           
          char ch;
       
        do    
        {
            System.out.println("\nchoose any 1\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");                        
 
            int choice = sc.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                ht.insert( sc.nextInt() ); 
                break;                          
            case 2 :                 
                System.out.println("Enter integer element to delete");
                ht.delete( sc.nextInt() ); 
                break;                        
            case 3 : 
                System.out.println("Enter integer element to check if present");
                System.out.println(ht.search(sc.nextInt() )+ "Contains : ");
                break;                                   
            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
           
            ht.printTable();  
 
            System.out.println("\nDo you want to continue (Type yes or no) \n");
            ch = sc.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
}              
                        
                        
            
      