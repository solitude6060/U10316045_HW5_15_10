import java.util.ArrayList;


public class MyStack<Object> implements Cloneable{
	private ArrayList<Object> list = new ArrayList<Object>();
	 
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	
	public int getSize(){
		return list.size();
	}
	
	
	public Object peek(){
		return list.get(getSize() -1 );
	}
	
	
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	
	public void push(Object o){
		list.add(o);
	}
	
	
	@Override
	public String toString(){
		return "stack" + list.toString();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public MyStack clone() {
	    try {
	      MyStack c = (MyStack)super.clone();
	      c.list = (ArrayList<Object>) this.list.clone();
	      return c;
	    } catch (CloneNotSupportedException ex) {
	      return null;
	    }
	  }
	
	
}
