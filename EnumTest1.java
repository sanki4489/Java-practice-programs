enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class EnumTest1 
{ 
    public static void main(String[] args) 
    { 
        // Calling values() 
        Color arr[] = Color.values(); 
  
        // enum with loop 
        for (Color col : arr) 
        { 
            // Calling ordinal() to find index of color. 
            System.out.println(col + " at index " + col.ordinal()); 
        } 
  
        // Using valueOf(). Returns an object of 
        // Color with given constant. 
        
        System.out.println(Color.valueOf("BLUE")); 
        System.out.println(Color.valueOf("WHITE")); 
    } 
} 
