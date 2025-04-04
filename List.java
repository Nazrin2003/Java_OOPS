import java.util.*;  

class List {  
    public static void main(String args[]) {  
        // Create an ArrayList and add elements
        ArrayList<String> l = new ArrayList<String>(); 
        l.add("Ravi");  
        l.add("Vijay");  
        l.add("Ravi");  
        l.add("Ajay");  
        
        // Display the initial list
        System.out.println("List: " + l); 
        
        // Size of the list
        System.out.println("Size of the list: " + l.size()); 
        
        // Remove element  
        l.remove(1); 
        System.out.println("Value removed at index 1. Current List: " + l); 
        
        // Update element 
        l.set(1, "Rahul"); 
        System.out.println("Updated List after replacing index 1: " + l); 
        
        // Contains
        System.out.println("Contains 'Ravi': " + l.contains("Ravi")); 
        
        // Sort the list
        Collections.sort(l); 
        System.out.println("Sorted List: " + l); 
        
        // Accessing an element
        System.out.println("Element at index 2: " + l.get(2)); 
        
        // Clear the list
        l.clear(); 
        System.out.println("List cleared. Current List: " + l); 
    }  
}