
import java.util.Arrays;

class StackExample
{
	String[] queA; 
	String[] queTemp;
	
	int frontA, rearA, frontTemp, rearTemp, totalItems = 0;
	
	StackExample(int queSize){
		
		queA = new String[queSize];
		queTemp = new String[queSize];
		
		
		Arrays.fill(queA,"-1");
		Arrays.fill(queTemp,"-1");
	}
	
	public void push(String ip){
		
		if(totalItems == 0){
			
			queA[rearA] = ip;
			
			rearA++;
			totalItems++;
			displayStack(queA);
		}
		else{
			
			//transfer all elements to temp. que
			for(int i=0; i<totalItems; i++){				
				//System.out.println("shifting" + queA[i]+ "current index" + i);				
				queTemp[i] = queA[i];
				queA[i] = "-1";
				rearA--;
				rearTemp++;
			}			
			//System.out.println("current rearA is" + rearA);
			//System.out.println("current rearTemp is" + rearTemp);
			queA[rearA++] = ip;
			totalItems++;
			
			//now push all previous elements we stored in temp. queue back to Queue A
			for(int i=0; i<rearTemp; i++){
				
				
				queA[rearA++] = queTemp[i];				
				queTemp[i] = "-1";				
					
			}
			
			//reset rearTemp as it would be empty everytime after copy
			rearTemp=0;
			
			displayStack(queA);
		}
	}
	
	
	public String pop(){
		
		if(totalItems == 0){
			System.out.println("Stack empty");
			return "-1";
		}
		else{
			
			displayStack(queA);
			queA[frontA]="-1";
			return queA[frontA++];
		}
		
	}
	
	public void displayStack(String[] currQue){
		
		//trace all 
		System.out.println("current rearA is" + rearA);
		System.out.println("current frontA is" + frontA);
		System.out.println("current rearTemp is" + rearTemp);
		System.out.println("current frontTemp is" + frontTemp);
		System.out.println("TotalItems are" + totalItems);
		
		for(int i=0; i<totalItems; i++){
			
			if(queA[i] == "-1")
				continue;
			else
				System.out.println("Element "+i+" in Stack is "+queA[i]);
		}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		StackExample obj = new StackExample(10);
		
		obj.push("3");
		obj.push("1");
		obj.push("7");
		obj.push("2");
		obj.push("6");
		
		obj.pop();
		obj.pop();
	}
}
