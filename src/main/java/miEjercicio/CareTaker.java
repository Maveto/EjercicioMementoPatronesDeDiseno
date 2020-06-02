package miEjercicio;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String,Memento> savedStates= new HashMap<>();

    public void addMemento(String msg, Memento memento){
        this.savedStates.put(msg, memento);
    }

    public Memento getMemento(String msg){
        return  this.savedStates.get(msg);
    }

}
