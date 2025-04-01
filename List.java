import java.util.*;  
class List{  
public static void main(String args[]){  
ArrayList<String> l=new ArrayList<String>(); 
l.add("Ravi");  
l.add("Vijay");  
l.add("Ravi");  
l.add("Ajay");  
System.out.println("List: " + l);
//size of list
System.out.println("Size of the list: " + l.size());
//remove element
int i=1;
l.remove(i);
System.out.println("Value removed at index "+ i +".Current List: " + l); 
// //update
// System.out.print("Enter a string to add: ");
// String n = sc.nextLine();
// l.add(n);
//accessing an element
int j=0;
System.out.println("Element at index " + j + ": " + l.get(j));
//Traversing list through Iterator  
Iterator itr=l.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
//clear
l.clear();
System.out.println("List cleared. Current List: " + l);
}  
}  