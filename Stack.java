import java.util.ArrayList;
import java.util.EmptyStackException;
 
public class Stack<E> {
 	private ArrayList<E> al;
 
	public Stack() {
 		al = new ArrayList<E>();
 	}
 
	public void push(E item) {
 		al.add(item);
 	}
 
	public E pop() {
 		if (!isEmpty()){
 			toString();
 			return al.remove(size()-1);}
 		else
 			throw new EmptyStackException();
 	}
 
	public boolean isEmpty() {
 		return (al.size() == 0);
 	}
	
	public E peek() {
 		if (!isEmpty())
 			return al.get(size()-1);
 		else
 			throw new EmptyStackException();
 	}
 
	public int size() {
 		return al.size();
 	}
 
	public String toString() {
		System.out.println( "Stack =" + al.toString());
		return "Stack al=" + al.toString();
 
 	}

public static void main(String args[]){
	Stack s=new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	System.out.println("size of stack= "+s.size());
	s.pop();
	s.pop();
	s.pop();
	
}
}