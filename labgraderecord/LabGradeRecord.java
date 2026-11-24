/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author REGIDOR_CPE113
 */
public class LabGradeRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ana's record with quiz 80 and lab 90
        LabGradeRecordClass ana = new LabGradeRecordClass("Ana", 80, 90);
        if (ana.isPassing()) {
            System.out.println(ana.getFinalGrade() + "; passing");
        } else {
            System.out.println(ana.getFinalGrade() + "; not passing");
        }

        // Ben's record with quiz 101 and lab 85
        LabGradeRecordClass ben = new LabGradeRecordClass("Ben", 101, 85);
        if (ben.isPassing()) {
            System.out.println(ben.getFinalGrade() + "; passing");
        } else {
            System.out.println(ben.getFinalGrade() + "; not passing");
        }

        // Ana's scores to 95 and 101
        System.out.println(ana.updateScores(95, 101) + "; grade stays " + ana.getFinalGrade());

        // 4. Update Ana's scores to 74 and 75
        boolean updated1 = ana.updateScores(74, 75);
        if (ana.isPassing()) {
            System.out.println(updated1 + "; " + ana.getFinalGrade() + "; passing");
        } else {
            System.out.println(updated1 + "; " + ana.getFinalGrade() + "; not passing");
        }

        // Ana's scores to 75 and 75[cite: 8]
        boolean updated2 = ana.updateScores(75, 75);
        if (ana.isPassing()) {
            System.out.println(updated2 + "; " + ana.getFinalGrade() + "; passing");
        } else {
            System.out.println(updated2 + "; " + ana.getFinalGrade() + "; not passing");
        }

        //Check Ben's record again
        if (ben.isPassing()) {
            System.out.println("Still " + ben.getFinalGrade() + "; passing");
        } else {
            System.out.println("Still " + ben.getFinalGrade() + "; not passing");
        }
    }
}         // Question 1:
         // Validating both new scores before assigning either one prevents the object from ending up in a partially updated, 
        //corrupted state if the first score is valid (such as 95) but the second score is invalid (such as 101). 
        //Checking both inputs upfront guarantees an all-or-nothing update so that both original scores remain unchanged whenever an update fails.