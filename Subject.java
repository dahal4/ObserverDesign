/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manish
 */
public class Subject {
    List<Observer> observers = new ArrayList<Observer>();
    int state;
    int getState(){
        return state;
    }
    void setState(int state){
        this.state=state;
        notifyAllObservers();
    }
    void attach(Observer observer){
        observers.add(observer);
    }
    void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
        
    }
    
}
