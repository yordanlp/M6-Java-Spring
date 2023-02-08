package com.harbour.softwareengineering.java;

public class Item {
    private final int Id;
    private final String Name;
    private final String Description;

    public int getId(){
        return this.Id;
    }
    public String getName(){
        return this.Name;
    }
    public String getDescription(){
        return this.Description;
    }
    public Item( int id, String name, String description){
        Id = id;
        Name = name;
        Description = description;
    }
}
