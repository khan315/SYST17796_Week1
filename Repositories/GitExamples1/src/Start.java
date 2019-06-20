/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Start {
    public static void main(String[]args){
        CellPhone cellPhone = new CellPhone();
        Nurse[] nurse = new Nurse[3];
        nurse[0] = new Nurse("Betty", cellPhone);
        nurse[1] = new Nurse("Wilma", cellPhone);
        nurse[2] = new Nurse("Pebbles", cellPhone);
        
        for (int floor = 0; floor < nurse.length; floor++)
        {
            nurse[floor].makePhoneCall(555);
            cellPhone.makeCall(555);
            nurse[floor].goToWork();
        }
    }
    
    
}
