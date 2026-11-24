/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecodingassignmentnov242026;

/**
 *
 * @author REGIDOR_CPE113
 */
public class LiveCodingAssignmentNov242026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    //Mia accounts with 10 credits and Luis with -4 credits
    CampusPrintingAccount Mia = new CampusPrintingAccount("Mia", 10);
    CampusPrintingAccount Luis = new CampusPrintingAccount("Luis", -4);
    System.out.println("Mia:" + Mia.getcredits() + ", Luis:" + Luis.getcredits());
   
    //Mia Prints 4 pages
    System.out.println("Mia:" + Mia.printpages(4) + ", Mia:" + Mia.getcredits());
    
    //Mia Prints 7 pages
    System.out.println("Mia:" + Mia.printpages(7) + ", Mia:" + Mia.getcredits());
    
    //Mia tries to add -3 credits
     System.out.println("Mia:" + Mia.addcredits(-3) + ", Mia:" + Mia.getcredits());
   
     //Mia adds 4 credits
     System.out.println(Mia.addcredits (4) + ", Mia:" + Mia.getcredits() + ",Luis:" + Luis.getcredits());
    }  
}
