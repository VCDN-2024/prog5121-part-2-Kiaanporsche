/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package registrationasignment_new;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jay
 */
public class TaskTest {
    private Task task;
    public TaskTest() {
         task = new Task();
    }
    
    
     /*Title: For the generateTaskID the for loop
      Author: OpenAI (Provided by chatGPT
      Date: `26 May 2024
      code cersion: 1
      availability: OpenAI
      
      */

    @Test
    public void testGenerateTaskId() {
       String[] taskNames = {"Add", "Create", "Create", "Create", "Create"};
        String[] firstNames = {"Bryan", "Mike", "Mark", "Martha", "Wendy"};
        String[] expectedIds = {"AD:1:YAN", "CR:2:IKE", "CR:3:ARK", "CR:4:THA", "CR:5:NDY"};

        for (int i = 0; i < taskNames.length; i++) {
            String taskId = task.generateTaskId(taskNames[i], "Developer", i + 1, firstNames[i]);
            assertEquals(expectedIds[i], taskId);
        }
    }
    
    @Test
    public void testCheckTaskDescription() {
        String shortDescription = "This is a valid task description.";
        boolean result = Task.checkTaskDescription(shortDescription);
        assertEquals(true, result);
    }
    
    
    @Test
    public void testCheckTaskDescription_Failure() {
        String longDescription = "This task description is way too long and should fail the validation because it exceeds fifty characters.";
        boolean result = Task.checkTaskDescription(longDescription);
        assertEquals(false, result);
    }


    @Test
    public void testReturnTotalHours() {
        Task.returnTotalHours(10);
        Task.returnTotalHours(8);
        double totalHours = Task.returnTotalHours(0);  
        assertEquals(18, totalHours, 0);
       
    }
    
    
    
 
    @Test
    public void testReturnTotalHoursAdditionalData() {
        Task.sum = 0;
        double[] durations = {10, 12, 55, 11, 1};
        
        for (double duration : durations) {
            Task.returnTotalHours(duration); // Accumulate the total hours
        }
        double totalHours = Task.returnTotalHours(0);
        assertEquals(89, totalHours, 0);
}
}

    
   

   
   

