import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<Character> mystack;
        int noOfTest= sc.nextInt();
        
        if(noOfTest <= 1000 && noOfTest >= 1){
            ArrayList<String> inputs = new ArrayList();
            for(int i=0;i<noOfTest;i++){
                String x = sc.next();
                //System.out.println("Showing  " + i + " " + x);
                if(x!=null || !x.equals("")){                    
                inputs.add(x);       
                }
               
            }
            //System.out.println(inputs.size());
            for(String input : inputs){
                
               // System.out.println("Exp " + input);
                boolean invalidFlag = false;
                mystack = new Stack<>();
                for(int j=0;j<input.length();j++){
                    
                    char c = input.charAt(j);
                    //System.out.println("In "+c);
                    if(c=='(' || c=='{' || c=='['){
                        mystack.push(c);
                    }
                    else{
                        if(mystack.empty()){
                            invalidFlag=true;
                            break;
                        }
                        char stackTop = mystack.pop();
                        //System.out.println("Top "+stackTop);
                        boolean flag = true;
                        switch(c){
                            case ')':
                                if(stackTop!='(')
                                    flag=false;                                
                                break;
                            case '}':
                                if(stackTop!='{')
                                    flag=false;                                
                                break;                                                            
                            case ']':
                                if(stackTop!='[')
                                    flag=false;                                
                                break;
                            default :
                                flag=false;
                        }
                        if(flag)
                            continue;
                        else{
                            invalidFlag = true;
                            break;
                        }                            
                    }                        
                }
                if(invalidFlag){
                    System.out.println("NO");
                }
                else{   
                    //System.out.println(mystack.empty());
                    if(mystack.empty()){
                        System.out.println("YES");   
                    }                        
                    else{
                        System.out.println("NO");   
                    }                        
                }
            }
        }
    }
}