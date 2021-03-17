/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author user
 */
public class Tugas1 {
    String fName;
    String IName;
    int stuId;
    String stuStatus;
    
    public Tugas1(String fName, String IName, int stuId, String stuStatus){
        this.fName      = fName;
        this.IName      = IName;
        this.stuId      = stuId;
        this.stuStatus  = stuStatus;
        
    }
    public static void main(String[] args) {
        person student = new person("Lisa", "Palombo", 123456789, "Active");
        System.out.println ("Student Name    : " + student.fName + "" + student.IName);
        System.out.println ("Student Id      : " + student.stuId);
        System.out.println ("Student Status  : " + student.stuStatus);
       
    }
    
}
