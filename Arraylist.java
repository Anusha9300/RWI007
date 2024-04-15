//Write a Java program to create an array list,
 //add some colors (strings) and print out the collection.
 import java.util.*;
 class Arraylist
 {
  public static void main(String args[])
  {
   ArrayList al=new ArrayList();
   al.add("Red");
   al.add("Yellow");
   al.add("Blue");
   al.add("Pink");
   System.out.println(al);
   
   //Add some other colors
   al.add("Green");
   al.add("Purpal");
   System.out.println(al);
  }
 }