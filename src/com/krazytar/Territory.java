package com.krazytar;

import java.util.HashMap;

public class Territory {
    int id;
    // Natural resources within the territory
    HashMap<Resource, Integer> resources = new HashMap();
    // Which nation controls the territory
    Nation owner;
    
    // Constructor
    public Territory(int _id) {
        id = _id;
    }
    
    public int getId() {
        return id;
    }
    public HashMap<Resource, Integer> getResources() {
        return resources;
    }
    public void setResources(HashMap<Resource, Integer> _resources) {
        resources = _resources;
    }
    public Nation getOwner() {
        return owner;
    }
    public void setOwner(Nation _owner) {
        owner = _owner;
    }
}
