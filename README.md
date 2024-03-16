/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

import java.util.ArrayList;

/**
 *
 * @author KaitlinMoore
 */
public class Pop implements Interface1 {
    private ArrayList<String> Pop;
    
    public Pop() {
        Pop = new ArrayList<>();
       }
    
    public boolean isEmpty(){
        return Pop.isEmpty();
    }
    
    public int size(){
        return Pop.size();
    }
    
    public Object frontElement(){
        if(Pop.size() > 0){
            return Pop.get(0);
        }else{
            return null;
        }
    }
    public void enqueue(Object newItem){
        Pop.add((String) newItem);
    }
    
    public Object dequeue(){
        if(Pop.size() > 0){
            return Pop.remove(0);
        }else{
            return null;
        }
    }
    public String displayQueue(){
            int iCount;
            String sMessage ="";
            if (Pop.isEmpty()){
            sMessage = sMessage.concat("The Stack is EMPTY!");
            }else{
                sMessage = "The Stack contains: ";
                for (iCount = 0; iCount < Pop.size(); iCount++){
                    sMessage = sMessage.concat(Pop.get(iCount));
                    sMessage = sMessage.concat("; ");
                }
        }
        return sMessage;
        }    
}





