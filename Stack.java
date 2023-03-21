class Stack{
int top=-1,MAX=20;
Object[] stack=new Object[MAX];
Object k;
void push(int element){
	if(top==MAX-1)
	{
		System.out.println("Stack is full");
	}else{
		top+=1;
		stack[top]=element;
	}
}
Object pop(){
	if(top==-1){
		System.out.println("Stack is Empty");
	}else{
		k=stack[top];
		top-=1;
	}
	return k;
}
void display(){
	int temp=top;
	while(temp>=0)
	{
	System.out.println(stack[temp]);
	temp-=1;
	}
}
boolean delete(){
	boolean b;
	if(top==-1){
		System.out.println("\nStack is Empty");
		b=false;
	}else{
		top-=1;
		b=true;
	}
	return b;	
}
boolean deleteAll(){
	while(top>=0)
	{
		top-=1;
	}
	return true;
}
Object peak(){
	return stack[top];
}
public static void main(String[] args)
   {
	String str="Anshul Gupta";
	Stack st=new Stack();
	for(int i=0;i<str.length();i++)
		{
			st.push(str.charAt(i));
		}
		int n=(Integer)st.peak();
		System.out.println((char)n);
	for(int i=0;i<str.length();i++)
		{
			int m=(Integer)st.pop();   //pop delete desplay both
			char ch=(char)m;
			System.out.print(ch);
		}
        boolean dresult=st.delete();		
		if(dresult)
		{
			System.out.println("Element is deleted");
		}
		
  }
}
