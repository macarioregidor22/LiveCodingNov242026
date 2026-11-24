/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuswallettransfer;

/**
 *
 * @author REGIDOR_CPE113
 */
public class CampusWalletTransfer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//  Aly's wallet with 100 credits and Ben's with the one-argument constructor
        CampusWalletTransferClass aly = new CampusWalletTransferClass("Aly", 100);
        CampusWalletTransferClass ben = new CampusWalletTransferClass ("Ben");
        
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        //  Aly transfers 35 credits to Ben
        System.out.println(aly.transferTo(ben, 35) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        //  Aly tries to transfer 70 credits to Ben
        System.out.println(aly.transferTo(ben, 70) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        //  Aly tries to transfer 10 credits to her own wallet
        System.out.println(aly.transferTo(aly, 10) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        //  Ben deposits 15 credits
        System.out.println(ben.deposit(15) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Aly transfers all 65 remaining credits to Ben
        System.out.println(aly.transferTo(ben, 65) + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

       
    }
}
