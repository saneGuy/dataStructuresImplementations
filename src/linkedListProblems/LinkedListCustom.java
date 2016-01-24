package linkedListProblems;

class Node{
	int data; // Node in a LinkedList contains integer data 
	Node next; // Pointer to the next node in the LinkedList
	Node(int element){
		data = element;
		next = null;
	}
}
public class LinkedListCustom {
	/*
	 * LinkedList basic functions addElement,deleteElement,sizeOfList
	 * isEmpty,
	 * 
	 */
	Node head; // LinkedList is pointed to by a head  
	int size; //contains the number of nodes in the linked list
	
	//Empty constructor that does nothing
	LinkedListCustom()
	{
		size = 0;
	}
	
	//isElement will check if the linked list is empty or not
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		return false;
	}
	
	//addElement will add an element to the begining of the linked list
	public void addElement(int element)
	{
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	//deleteElement will delete an element from the starting of the list
	public void deleteElementFromBegining()
	{
		Node cur = head;
		head = head.next;
		cur = null;
		size--;
	}
	
	//sizeOfList will return the current linked list size
	public int sizeOfList()
	{
		return size;
	}
	
	//print the linked list
	public void printList()
	{
		Node cur = head;
		while(cur != null)
		{
		System.out.print(cur.data + " ");
		cur = cur.next;
		}
		System.out.println();
	}
	
	//reverse the list in place
	
	public void reverseList()
	{
		
	}
	
	public static void main(String args[])
	{
		LinkedListCustom newList = new LinkedListCustom();
		System.out.println("List size : " + newList.size);
		
		double startTime = System.currentTimeMillis();
		for(int i = 0 ; i < Integer.MAX_VALUE ; i++)
		{
			newList.addElement(i);
		}
		double endTime = System.currentTimeMillis();
		
		double totalTime = endTime - startTime;
		System.out.println("LinkedList took " + totalTime/(1000*60) + "minutes" + "to add " + 1000000000 + "elements at the begining of the list");
		
//		while(!newList.isEmpty())
//		{
//		   newList.printList();
//		   newList.deleteElementFromBegining();
//		}
		
	}

}
