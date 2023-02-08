package com.harbour.softwareengineering.java;

public class Item {
    private int Id;
    private String Name;
    private String Description;

    public int getId(){
        return this.Id;
    }

    public void setId( int id ){
        Id = id;
    }
    public String getName(){
        return this.Name;
    }

    public void setName(String name){
        Name = name;
    }
    public String getDescription(){
        return this.Description;
    }

    public void setDescription( String description ){
        Description = description;
    }

    public void update( ItemDTO item ){
        setId(item.Id);
        setDescription(item.Description);
        setName(item.Name);
    }

    public Item(int id, String name, String description){
        Id = id;
        Name = name;
        Description = description;
    }
}
