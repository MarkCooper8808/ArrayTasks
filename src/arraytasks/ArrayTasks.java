/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ArrayTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] gradesArray = new char[5];
        gradesArray[0] = 'A';
        gradesArray[1] = 'B';
        gradesArray[2] = 'D';
        gradesArray[3] = 'F';
                
        char[] fixedGradesArray = new char[5];
        fixedGradesArray[2] = 'C';
        
        int j = 0;
        for (int i = 0; i < 5; i++)
        {
            
            if (i == 2) {
                continue;
            }
            fixedGradesArray[i] = gradesArray[j];
            j++;
        }
        System.out.println(fixedGradesArray);
        
        
        String[] subjects = new String[3];
        
        subjects[0] = "JavaScript";
        subjects[1] = "Python";
        subjects[2] = "HTML";
        
        System.out.println(subjects[1]);
        
        String[] newSubjects = new String[5];
        
        for (int i = 0; i < subjects.length; i++)
        {
            newSubjects[i] = subjects[i];
        }
        newSubjects[3] = "Data Structures";
        newSubjects[4] = "Algorithms";
        
        System.out.println(Arrays.toString(newSubjects));
    }
    
}
