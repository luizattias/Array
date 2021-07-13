package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Athlete {


//defining my variables
    private String FirstName;
    private String LastName;
    private String id;
    public Integer point[] ;
//constructor method
    public Athlete(String firstName, String lastName, String id, Integer[] point) {
        FirstName = firstName;
        LastName = lastName;
        this.id = id;
        this.point = point;
    }
//defining my getters and setters
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer[] getPoint() {
        return point;
    }

    public void setPoint(Integer[] point) {
        this.point = point;
    }
//computing the average
    public double Average(){
        double sum = 0;
        //since i dont know how many times the user will input the points we will devide for the amount of times he/she
        //put in order to divide for getting average
        for(int i = 0; i<point.length;i++){
            sum = sum + point[i];
        }
        double average;
        average =  sum/point.length;

        return average;

    }

    public void Display(){
        //displaying
        double average = Average();
        System.out.println("*******************");
        System.out.println("Name " + "\t\t" +"id" +"\t" +"Average" );
        System.out.println(FirstName + "\t"+ LastName + "\t" + id + "\t" +String.format("%2.2f",average) );
    }
}

















