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
public class Rap implements Interface1 {
 private ArrayList<String> Rap;
    
    public Rap() {
        Rap = new ArrayList<>();
       }
    
    public boolean isEmpty(){
        return Rap.isEmpty();
    }
    
    public int size(){
        return Rap.size();
    }
    
    public Object frontElement(){
        if(Rap.size() > 0){
            return Rap.get(0);
        }else{
            return null;
        }
    }
       public void enqueue(Object newItem){
        Rap.add((String) newItem);
    }
    
    public Object dequeue(){
        if(Rap.size() > 0){
            return Rap.remove(0);
        }else{
            return null;
        }
    }
    
    public String displayQueue(){
            int iCount;
            String sMessage ="";
            if (Rap.isEmpty()){
            sMessage = sMessage.concat("The Stack is EMPTY!");
            }else{
                sMessage = "The Stack contains: ";
                for (iCount = 0; iCount < Rap.size(); iCount++){
                    sMessage = sMessage.concat(Rap.get(iCount));
                    sMessage = sMessage.concat("; ");
                }
        }
        return sMessage;
        }
}



