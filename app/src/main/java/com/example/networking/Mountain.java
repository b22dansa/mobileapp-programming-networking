package com.example.networking;

public class Mountain {

    private String ID;

    private String Name;

    private String Type;

    private String Company;

    private String Location;

    private String Category;

    private int Size;

    private int Cost;


    public Mountain(String ID, String name, String type, String company, String location, String category, int size, int cost) {
        this.ID = ID;
        Name = name;
        Type = type;
        Company = company;
        Location = location;
        Category = category;
        Size = size;
        Cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }



    // auxdata, wiki, img to make

}



