/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author REGIDOR_CPE113
 */
public class LabGradeRecordClass {
    
    private String studentName;
    private int quizScore;
    private int  labScore;
  
//Constructor that replaces each invalid scores outside 0-100
    public LabGradeRecordClass (String studentName, int quizScore, int labScore){
    this.studentName = studentName;
    if( quizScore <0 || quizScore > 100){
        this.quizScore = 0;
    }else{
        this.quizScore = quizScore;
    }
if (labScore < 0 || labScore >100){
    this.labScore = 0;
}else{
    this.labScore = labScore;
}
    }
//if the scores are within 0-100 the output is true, while if it is above or under 0-100 the output is false
public boolean updateScores(int quizScore, int labScore){
if (quizScore < 0 || quizScore > 100 || labScore < 0 || labScore > 100){
    return false;
}
    this.quizScore = quizScore;
    this.labScore = labScore;
        return true;   
    }
//Calculate Final Grade (40% quiz, 60% lab)
public double getFinalGrade(){
    return (this.quizScore * 0.40) + (this.labScore * 0.60);
} 
// Uses getFinalGrade() without checking if grade is 75.0 or higher
 public boolean isPassing(){
     return getFinalGrade() >=75.0;
 }       
}
