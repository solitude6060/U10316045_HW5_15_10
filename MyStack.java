import java.util.ArrayList;//import arraylist

//implements cloneable to use clone()
public class MyStack<Object> implements Cloneable{
	//ArrayList
	private ArrayList<Object> list = new ArrayList<Object>();
	 
	 //isEmpty() method check if the list is empty or not 
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	//get the size
	public int getSize(){
		return list.size();
	}
	
	//look into the program 
	public Object peek(){
		return list.get(getSize() -1 );
	}
	
	//take out the object from the last of list
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	//put object into 
	public void push(Object o){
		list.add(o);
	}
	
	//override the toString method
	@Override
	public String toString(){
		return "stack" + list.toString();
	}
	
	
	@SuppressWarnings("unchecked")//skip the warn about line 49
	@Override//override 
	public MyStack clone() {
	    try {//try : run the program if the program inside is right
	      //Change clone() type from object to MyStack and assign to a variable named CloneArray 
	      MyStack CloneArray = (MyStack)super.clone();
	      //Change this.list.clone() type from object to ArrayList<Object> and assign to Arraylist of CloneArray
	      CloneArray.list = (ArrayList<Object>) this.list.clone();
	      return CloneArray;//return
	    } catch (CloneNotSupportedException ex) {//if CloneNotSupportedException happens run the program inside
	      return null;//reutrn nothing
	    }
	  }
	
	
}
