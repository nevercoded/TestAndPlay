package ds;

public class CsuStringArrayStack implements IsuStringStack {

	private int capacity = 1;
	private String[] stack = null;
	private int n = 0; // index of current stack position
	
	public CsuStringArrayStack(){
		stack = new String[capacity];		
	}
	
	@Override
	public void push(String item) {
		if(stack.length==n){
			resizeStack(stack.length*2,false);
		}
		stack[n++]=item;
	}

	private void resizeStack(int size,boolean reduce){
		 String[] copy = new String[size];
		 if(!reduce)
			 for(int i=0;i<stack.length;i++){
				 copy[i] = stack[i];			 
			 }
		 else
			 for(int i=0;i<size;i++){
				 copy[i] = stack[i];			 
			 }
		 stack = copy;
	}
	@Override
	public String pop() {
		String item = stack[n-1];
		stack[n-1]=null;
		n--;
		if(n<stack.length/4)
			resizeStack(stack.length/2,true);
		return item;
	}

	@Override
	public boolean isEmpty() {
		return n==0;
	}

}
