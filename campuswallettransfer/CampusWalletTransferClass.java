/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuswallettransfer;

/**
 *
 * @author REGIDOR_CPE113
 */
public class CampusWalletTransferClass {
    
    private String owner;
    private int balance;
    
    //Conductor
    public CampusWalletTransferClass( String owner, int balance){
        this.owner = owner;
        if (balance < 0){   
            this.balance = 0;
        }else{
            this.balance = balance;
        }
   
    }
            public CampusWalletTransferClass(String owner){
                this(owner, 0);
            }
            public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        return true;
            }
            public boolean transferTo(CampusWalletTransferClass recipient, int amount){
               if (recipient == null || recipient == this || amount <=0 || this.balance < amount){
                   return false;
               }
           this.balance -=amount;
           recipient.balance += amount;
           return true;
           } 
public int getBalance(){
    return this.balance;
}
}
    