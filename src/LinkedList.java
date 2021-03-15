
public class LinkedList {

	public static void main(String[] args) {
		

	}

	class Node{
		int value ;
		Node next=null;
		Node(int value){
			this.value=value;
		}
	}
	
	protected Node head= null;
	protected Node tail =null;
	
	//adding to the front
	
	public void addToFront(int value) {
		Node newNode= new Node(value);
		newNode.next= head;
		head= newNode;
	}
}
