/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public abstract class Person {
    protected String name;
    protected CellPhone cellPhone;

public Person (String name, CellPhone cellPhone){
    this.name = name;
    this.cellPhone = cellPhone;
}

public void makePhoneCall(int number){
    System.out.print(name + " is making a call: ");   
}

public abstract void goToWork();
}
