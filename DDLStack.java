//Stack using Linked List DDL

class Node
{
   Object data;
   Node pre,next;
   public Node(Object data){
	   this.data=data;
   }
}
class DDLStack{
	static Node top;
public static void push(Object data)
{
	Node newNode=new Node(data);
	if(top==null){
		top=newNode;
	}
	else{
		top.next=newNode;
		newNode.pre=top;
		top=newNode;
	}
}
public static void pop(){
	if(top.pre==null){
		System.out.println("stack is empty");
	}else{
		while(top.pre!=null){
		System.out.println(top.data);
		top=top.pre;
	}
	System.out.println(top.data);
		
	}	
}
public static Object peek(){
	return top.data;
}

//public static boolean delete

public static void main(String[] args){


for(int i=0;i<11;i++){
	DDLStack.push(i);
	
}
System.out.println("This is the peek element after pushing data"+DDLStack.peek());
DDLStack.pop();
DDLStack.pop();
System.out.println("This is the peek element after poping data"+DDLStack.peek());

}

}
