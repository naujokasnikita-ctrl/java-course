package com.bootcampexcercise.module9;

public class Person {
    private int weight;
    private float height;
    // getters and setters
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    //BMI
    public String calculateBMI(float height, int weight) {
        //cheking for invalid values
        if  (weight <= 0 || height <= 0) {
            return "Invalid input:input cant be 0 or lower";
        }
        if (weight > 600 || height > 2.50f){
            return "Invalid input: a person cant be that big";
        }
        float bmi = weight / (height * height);
        return "Your BMI:" + bmi;
    }
}
