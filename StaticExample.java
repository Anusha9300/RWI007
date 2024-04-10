class StaticExample
{  
    //non static method
void display()  
{  
System.out.println("A non-static function is called.");  
}  
    //static method
static void cube()  
{  
int x=7*7*7;  
System.out.println("Cube of 7 is: "+x);    
}  
    //main method
public static void main(String args[])  
{  
    TestMain obj = new TestMain();  
       obj.display();  
       cube();    
}  
 
}