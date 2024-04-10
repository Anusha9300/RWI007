class DataMembers implements Cloneable {
    int roll_number;
    String name;
    String department;

    DataMembers(int r, String n, String dept) {
        roll_number = r;
        name = n;
        department = dept;
    }

    void display() {
        System.out.println(roll_number + " " + name + " " + department);
    }

    // clone method override
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


 
      public static void main(String args[]) {
        // Approach 1: Using Constructor
        DataMembers d1 = new DataMembers(111, "Anusha", "CS");
        d1.display();

        try {
            // Approach 2: Using Clone method
            DataMembers d2 = (DataMembers) d1.clone();
            d2.display();
        } catch (CloneNotSupportedException e) { 
            e.printStackTrace();
        }

        // Approach 3: Using NewInstance Method
        try {
            // Reflection ka istemal karke object create karna
            Constructor<DataMembers> constructor = DataMembers.class.getDeclaredConstructor(int.class, String.class, String.class);
            DataMembers d3 = constructor.newInstance(222, "John", "EE");
            d3.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
	  }
}
