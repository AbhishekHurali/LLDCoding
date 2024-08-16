package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,Student> studentRegistry;

    public StudentRegistry(){
        studentRegistry = new HashMap<>();
    }

    public void put(String objName,Student st){
        studentRegistry.put(objName,st);
    }

    public Student get(String objName){
        return studentRegistry.get(objName).copy();
    }
}
