package com.bootcampexcercise.module3;

public class Car {
    // we create the atributes
    private String name;
    private String color;
    private int modelNo;

    //we create default construct
    public Car() {
    }

    //we create a construct whit one parameter
    public Car(String name) {
        this.name = name;
    }

    // whit all parameters
    public Car(String name, String color, int modelNo) {
        this.name = name;
        this.color = color;
        this.modelNo = modelNo;
    }

    //methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getModelNo(){
        return modelNo;
    }

    // set method
    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }


}
