package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class
BaseDisc {
    private  String name;
    private String discType;
    private double capacity;
    private ArrayList<String> contents;


    public  BaseDisc(String aName,String aDiscType,double aCapacity,ArrayList<String>  aContents){
name=aName;
discType=aDiscType;
capacity=aCapacity;
contents=aContents;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "-name= " + name + '\n' +
                "-discType= " + discType + '\n' +
                "-capacity= " + capacity +"\n"+
                "-contents= " + contents ;
    }
}
