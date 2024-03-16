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
public class Liked implements Interface2 {
    
    private ArrayList<String> Liked;

    
    public Liked() {
        Liked = new ArrayList<>();
    }
   
    public int size(){
        return Liked.size();
    }
    
        public boolean isEmpty(){
            return Liked.isEmpty();
        }
        
        public boolean isFull(){
            return false;
        }
        public Object pop(){
            if(!(Liked.isEmpty())){
                return Liked.remove(0);
            }else{
                return null;
            }
            }
        public void push(Object newItem){
         Liked.add(0, (String) newItem);
        }
        
        public void emptyStack(){
            while(!Liked.isEmpty()){
                pop();
                  }
        }
        
        public String displayStack(){
            int iCount;
            String sMessage ="";
            if (Liked.isEmpty()){
            sMessage = sMessage.concat("The Stack is EMPTY!");
            }else{
                sMessage = "The Stack contains: ";
                for (iCount = 0; iCount < Liked.size(); iCount++){
                    sMessage = sMessage.concat(Liked.get(iCount));
                    sMessage = sMessage.concat("; ");
                }
        }
        return sMessage;
        }
}
