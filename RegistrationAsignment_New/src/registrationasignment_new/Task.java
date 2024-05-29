/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationasignment_new;

import javax.swing.JOptionPane;

/**
 *
 * @author jay
 */

import javax.swing.JOptionPane;

public class Task {
    private String taskname;
    private int noOftasks;
    private String taskDescription;
    private String developerDetails;
    private double taskduration;
    private String taskId;
    private String taskstatus;
    public static double sum = 0;

    public Task(String taskname, int noOftasks, String taskDescription, String developerDetails, double taskduration, String taskId, String taskstatus) {
        this.taskname = taskname;
        this.noOftasks = noOftasks;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskduration = taskduration;
        this.taskId = taskId;
        this.taskstatus = taskstatus;
    }

    public Task() {
    }

    public String generateTaskId(String taskname, String developerDetails, int noOftasks, String firstname) {
        String firstTwoLetters = taskname.substring(0, 2).toUpperCase();
        String lastThreeLetters = firstname.substring(firstname.length() - 3).toUpperCase();
        taskId = firstTwoLetters + ":" + noOftasks + ":" + lastThreeLetters;
        return taskId;
    }

    public static double returnTotalHours(double taskduration) {
        sum += taskduration;
        return sum;
    }

    public static boolean checkTaskDescription(String taskDescription) {
        if (taskDescription.length() <= 50) {
            System.out.println("Task description is valid.");
            return true;
        } else {
            System.out.println("Task description is too long.");
            return false;
        }
    }

    public static String showStatus() {
        String taskstatus = null;
        while (true) {
            String input = JOptionPane.showInputDialog("Please enter the status of the task:\n1. To Do\n2. Done\n3. Doing");
            int taskstat = Integer.parseInt(input);

            switch (taskstat) {
                case 1:
                    taskstatus = "To Do";
                    break;
                case 2:
                    taskstatus = "Done";
                    break;
                case 3:
                    taskstatus = "Doing";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
                    break;
            }

            if (taskstatus != null) {
                break; // Exit the loop when a valid status is set
            }
        }

        return taskstatus;
    }
    
    
    /*Title: String builde
      Author: OpenAI (Provided by chatGPT
      Date: `26 May 2024
      code cersion: 1
      availability: OpenAI
      
      */

    public String printTaskDetails(int numberOfTasks) {
        StringBuilder taskDetails = new StringBuilder();
        for (int i = 1; i <= numberOfTasks; i++) {
            // User inputs
            taskname = JOptionPane.showInputDialog("Please enter the task name for task " + i);
            taskduration = Double.parseDouble(JOptionPane.showInputDialog("Please enter the estimated duration for task " + i));
            taskDescription = JOptionPane.showInputDialog("Please enter the task description for task " + i);
            String firstname = JOptionPane.showInputDialog("Please enter your firstname for task " + i);
            String lastname = JOptionPane.showInputDialog("Please enter your Surname for task " + i);
            developerDetails = firstname + " " + lastname;
            generateTaskId(taskname, developerDetails, i, firstname);
            taskstatus = showStatus();

            // Append task details
            taskDetails.append("Task ").append(i).append(" Details:\n");
            taskDetails.append("Task Name: ").append(taskname).append("\n");
            taskDetails.append("Task Description: ").append(taskDescription).append("\n");
            taskDetails.append("Developer Details: ").append(developerDetails).append("\n");
            taskDetails.append("Task Duration: ").append(taskduration).append(" hours\n");
            taskDetails.append("Task ID: ").append(taskId).append("\n");
            taskDetails.append("Task Status: ").append(taskstatus).append("\n");
            taskDetails.append("----------------------\n");

            sum += taskduration;
        }
        taskDetails.append("Total Duration for all tasks: ").append(sum).append(" hours\n");
        return taskDetails.toString();
    }
}
