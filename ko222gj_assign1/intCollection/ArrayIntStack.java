package ko222gj_assign1.intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
//Adds one element to the top of the stack	
	public void push(int n) {
		if(super.size == super.values.length){
			super.resize();
		}
		super.values[super.size] = n;
		super.size++;
	}
//  Returns the top element in the stack and removes it. .
//Throws IndexOutOfBounds if stack is empty	 
	public int pop() throws IndexOutOfBoundsException {
		if (super.isEmpty()){
			throw new IndexOutOfBoundsException("The Stack is empty");
		}else {
			int temp = super.values[0];
			for (int i = 0; i < super.size; i++){
				super.values[i] = super.values[i + 1];
			}
			super.size--;
			return temp;
			
		}
	}
	
	public int peek() throws IndexOutOfBoundsException {
		if (super.isEmpty()){
			throw new IndexOutOfBoundsException("The Stack is empty");
		}else {
			return super.values[0];
		}
	}
	
	public int size(){ return super.size();} //return integer with the current size of the stack
	
	
	public boolean isEmpty() { return super.isEmpty();} //return true if stack is empty false if not
	
	public String toString() {return super.toString();}

}
