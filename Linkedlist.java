//6.append the specified element to the end of a linked list 
import java.util.*;
class Linkedlist
{
 public static void main(String args[])
 {
  LinkedList<String> list_col = new LinkedList<String>();
		list_col.add("Blue");
		list_col.add("Orange");
		list_col.add("Black");
		list_col.add("White");
		list_col.add("Pink");
		list_col.add("Yellow");
		list_col.add("Purple");
		System.out.println("Linked list : " + list_col);
		
		LinkedList<String> list_append = new LinkedList<String>();
		list_append.add("Apple");
		list_append.add("Mango");
		list_append.add("banana");
		list_append.add("chery");
		list_append.add("Orange");
		System.out.println("Linked list : " + list_append);
		
		list_col.addAll(list_append); 
		
		//7.insert the specified element at the end of a linked list.
		list_col.addLast("Ligth blue");
		System.out.println("Linked list : " + list_col);
		
		//8.remove the first and last elements from a linked list.
		list_col.removeFirst();
		System.out.println("Linked list : " + list_col);
		
		list_append.removeLast();
		System.out.println("Linked list : " + list_append);
		
		//9.retrieve, but not remove, the last element of a linked list.
		
		   list_col.clear();
		//10. check if a linked list is empty or not.
         if(list_col.isEmpty())
		 {
			System.out.println("Sorry list is empty"); 
		 }
		else
		{
			System.out.println("Linked list : " + list_col);
		}			
		
 }
}