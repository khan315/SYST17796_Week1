/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class CellPhone implements Callable{
        public boolean phoneOn;
        
  @Override      
  public boolean isPhoneOn(){
      return true;
  }
  
  @Override
  public void makeCall(int number){
      if(true){
          System.out.println("Calling...." + number + number);
      }
      else{
          System.out.println("Sorry, the phone is turned off");
      }
  }
  
  @Override
  public void turnPhoneOn(){
      boolean phoneOn = true;
  }
  
  public void turnPhoneOff(){
      boolean phoneOn = false;
  }
    
}
