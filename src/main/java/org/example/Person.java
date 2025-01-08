package org.example;

public class Person {
    String firstName ;
    String lastName ;
    int age ;
    String gender ;
    int rank;
    double height;



    public  Person(String firstName,String lastName,int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    }
    public  Person(String firstName,String lastName,int age,int rank,String gender, double height){
        this(firstName,lastName,age);
        this.rank=rank;
        this.gender=gender;
        this.height=height;
    }


    public  String getFirstName(){
        return  this.firstName;
    }
    public  String getLastName(){
        return  this.lastName;
    }
    public  int getAge(){
        return  this.age;
    }
    public  boolean isTeen (){
       return this.age <= 19  && 13 <= this.age ;

    }
}
