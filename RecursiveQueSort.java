import java.util.LinkedList;
import java.util.Queue;

public class RecursiveQueSort {

	Queue queue;
	
	public RecursiveQueSort() {
		
		queue = new LinkedList();
	    //tempQue = new LinkedList();
	    
	    
	}
	
	public void enqueue(int ip){
		queue.add(ip);
		
	}
	
	public void dequeue(){
		
		if(queue.size() > 0)
			queue.remove();
		else
			System.out.println("sorry queue empty");
	}
	
	public void doSort(){
		
		sortQueue(queue);		
	}
	
	public void sortQueue(Queue ip){
		
		
		if(ip.size() != 0){
			
			int temp = (int) ip.remove();
			sortQueue(ip);
			sortedInsert(ip, temp);
		}
		
	}
	
	public void sortedInsert(Queue ip, int temp){
		
		int holder;
		
		if(ip.size() == 0 || temp > (int)(ip.peek())){
			System.out.println("chk"+temp+" "+ip.peek());
			ip.add(temp);			
			return;
		}		
		holder = (int)ip.remove();
		System.out.println("chker"+holder);
		sortedInsert(ip, temp);
		ip.add(holder);
	
	}
	
	public void callDisp(){
		display(queue);		
	}
	
	public void display(Queue qToDisplay){
		
		while( queue.size() !=0 ){
			
			System.out.println("Result is "+qToDisplay.remove());
		}
		
	}
	
	public static void main(String[] args){
		
		RecursiveQueSort obj = new RecursiveQueSort();
		
		obj.enqueue(3);
		obj.enqueue(1);
		obj.enqueue(32);
		obj.enqueue(4);
		obj.enqueue(5);
		
		obj.doSort();
		obj.callDisp();
	}
	
}
