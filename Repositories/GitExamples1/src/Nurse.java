/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Nurse extends Person {
    
    public Nurse (String name, CellPhone cellPhone){
        super (name, cellPhone);
    }
    
    @Override
    public void goToWork(){
        System.out.println(name + " is going to the hospital");
    }
}
