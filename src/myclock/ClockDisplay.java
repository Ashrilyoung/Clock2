/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclock;

/**
 *
 * @author 16007873
 */
public class ClockDisplay {
    
    private int numberdisplayhours=12;
    private int numberdisplaymins=0;
    private String displaystring="";
    int a=1;
    
    public void clockDisplay() throws InterruptedException{
        
        while(a==1){
        this.updateDisplay();
        this.setTime(numberdisplayhours, numberdisplaymins);
        numberdisplaymins=UpdateClock.updateClock(numberdisplaymins);
        this.timeTick();
        
        }
    }

    public void timeTick() throws InterruptedException{    //external method call
        Thread.sleep(1000);
    }
    
    public String getTime(){
        return displaystring;
    }   
        
    public void setTime(int hour, int minute){
        this.displaystring = hour+":"+minute;
    }
    
    
    public void updateDisplay(){  //internal method call
        String displayNos = getTime();
        System.out.println(displayNos);
    }
}

