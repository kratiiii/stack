/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramming.Array;

/**
 *
 * @author Student
 */
import java.util.*;
import java.lang.*;

public class stack {
   final int max=5;
   int top=-1;
   int stk[]=new int[max];
   Scanner scan=new Scanner(System.in);
   boolean isfull()
   {
       if(top==max-1)
       {
           return true;
       }
       else 
           return false;
   }
   boolean isempty()
   {
       if(top==-1)
       {
           return true;
       }
       else
           return false;
   }
   void push()
   {
       if(isfull())
       {
           System.out.println("overflow");
           return;
       }
   }
   int pop()
   {
       int no;
       if(isempty())
       {
           System.out.println("underflow");
           return -1;
       }
       no=stk[top--];
       return no;
   }
   void peek()
   {
       if (isempty())
       {
           System.out.println("stack underflow");
       }
       else
           System.out.println("top value is:"+stk[top]);
   }
   void display()
   {
       int i;
       if(top==-1)
       {
           System.out.println("underflow");
       }
       System.out.println("stack elements are:");
       for(i=top;i>=0;i--)
       {
           System.out.println(+stk[i]);
       }
   }
   void menu()
   {
       System.out.println("\n1.push \n2.pop \n3.peek \n4.display \n5.exit");
       while(true)
       {
           System.out.println("enter uour choice: ");
           int ch=scan.nextInt();
           switch(ch)
           {
               case 1:
                   System.out.println("enter the no to be pushed:");
                   int no=scan.nextInt();
                   push();
                   break;
               case 2:
                   no=pop();
                   System.out.println("the popped elemnt is: "+no);
                   break;
               case 3:
                   peek();
                   break;
               case 4:
                   display();
                   break;
               case 5:
                   exit(0);
               default:
                   System.out.println("invalid choice");
                   
           }
               
       }
   }
      public static void main(String[] args)
      {
          stack ss=new stack();
          ss.menu();
      }
    
}
