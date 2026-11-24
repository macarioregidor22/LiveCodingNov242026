/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livecodingassignmentnov242026;

/**
 *
 * @author REGIDOR_CPE113
 */
public class CampusPrintingAccount {
    
 private String studentname;
    private int credits;
 
// Constructor: sets up the account and prevents negative starting credits
    public CampusPrintingAccount(String studentname, int credits){
    this.studentname=studentname;
    if(credits < 0){
        this.credits = 0;
    }else{
        this.credits = credits;
        
    }
}
// Adds credits only if the amount is positive
public boolean addcredits(int amount){
    if (amount <= 0){
        return false;   
    }
this.credits +=amount;
return true;
}
// Reduce credits only if pages is positive and if there are enough credits
public boolean printpages(int pages){
    if (pages <= 0 || this.credits < pages ) {
        return false;
        
    } 
// Returns the current credit balance
this .credits -= pages;
return true;

}
public int getcredits(){
    return this.credits;
}
}
