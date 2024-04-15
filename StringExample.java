class StringExample
{
   public static void main(String arg[])
   {
	    // Defining a string
        String message = "Hello, world!";
        
        // Printing the original string
        System.out.println("Original string: " + message);
        
        // Getting the length of the string
        int length = message.length();
        System.out.println("Length of the string: " + length);
        
        // Accessing individual characters using charAt method
        char firstChar = message.charAt(0);
        char lastChar = message.charAt(length - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
		
		  // Converting the string to uppercase
        String upperCaseMessage = message.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseMessage);
        
        // Extracting a substring
        String substring = message.substring(7, 12);
        System.out.println("Substring: " + substring);
		
		 // Checking if the string contains a specific substring
        boolean containsSubstring = message.contains("world");
        System.out.println("Does the string contain 'world'? " + containsSubstring);
        
        // Replacing a substring with another string
        String replacedMessage = message.replace("world", "universe");
        System.out.println("After replacement: " + replacedMessage);
   }   
}