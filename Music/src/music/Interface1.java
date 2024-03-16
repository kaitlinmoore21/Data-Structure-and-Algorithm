/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package music;

/**
 *
 * @author KaitlinMoore
 */
public interface Interface1 {
    
    public boolean isEmpty();
   
     public int size();
    
     public Object frontElement();
    
    public void enqueue (Object newItem);

    public Object dequeue();

    public String displayQueue();

    }

