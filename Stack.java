package datastruct;

public class Stack {
	private int a=new int[100];
	private int size=0;
	Stack(){}
	public boolean empty()
	{
		return size==0;
	}
	public boolean push(int e)
	{
		if(size==100)return false;
		a[size++]=e;
		return true;
	}
	public boolean pop()
	{
		if(size==0)return false;
		size--; 
		return true;
	}
	public int top()
	{
		if(size==0)return -1;
		return a[size-1];
	}
}