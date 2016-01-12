import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        if(noOfTest >=1 && noOfTest <=100000){
            ArrayList<Integer> output = new ArrayList<>();
            Stack<Integer> mystack = new Stack<>();
            Stack<Integer> maxstack = new Stack<>();
            
            
            for(int i=0;i<noOfTest;i++){
                int currentOp = sc.nextInt();
                switch(currentOp){
                    case 1:
                        int curr = sc.nextInt();
                        
                        if(maxstack.empty() || curr > maxstack.peek()){
                            maxstack.push(curr);                            
                        }   
                        else{
                            maxstack.push(maxstack.peek());
                        }
                        mystack.push(curr);
                        break;
                    case 2:
                        mystack.pop();
                        maxstack.pop();
                        break;
                    case 3:
                        output.add(maxstack.peek());
                        break;
                    default :
                        break;
                }
            }
            
            for(Integer op : output){
                System.out.println(op);
            }
        }
    }
}