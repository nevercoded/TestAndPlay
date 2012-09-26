package ds;

public class CsuMaxMinStackWithTwoStacks {

	private CsuStack<Integer> stack = new CsuStack<Integer>();
	private CsuStack<Integer> maxStack = new CsuStack<Integer>();
	
	public void push(Integer item){
		
		if(stack.isEmpty()){
			stack.push(item);
			maxStack.push(item);
		}else{
			stack.push(item);
			Integer topItem = maxStack.pop();
			if(item > topItem){
				maxStack.push(topItem);
				maxStack.push(item);
			}else{
				// push old value first
				maxStack.push(topItem);
				maxStack.push(topItem);
			}
		}		
		
	}
	
	public Integer pop(){
		Integer item = stack.pop();
		maxStack.pop();
		return item;
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public Integer getMax(){
		Integer item = maxStack.pop();
		maxStack.push(item);
		return item;
	}
}
