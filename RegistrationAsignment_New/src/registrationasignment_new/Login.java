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
public class Login {
    
     private   String username;
    private String password;
    private String firstname;
    private String lastname;
    
    
    
    
    
    
    
    
     

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Login(String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        
    }
    
    
    
    

    
     public String registerUser() {
        if (!checkusername(username) || !checkpasswordcomplexity(password)) 
            return "Username or password does not meet criteria";
         else {
            return  "Username or password does meet criteria";
        }
        
   }
    
   
    
    
  
     public String returnLoginStatus(boolean isCorrect) {
        if (isCorrect) {
            return "Welcome " + firstname + ", " + lastname;
        } else {
            return  "Username or password incorrect, please try again";
        }
    }
    
    
    public  boolean  loginUser(String enteredPassword, String enteredUsername)
    {
         
        
        if (enteredUsername.equals(this.username) && enteredPassword.equals(this.password)) {
            JOptionPane.showMessageDialog(null, "Welcome back " + firstname +" \t " +  lastname + " It is great to see you again");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username or password.");
            
            return false;
        }
        
        
        
    }
    
    
    
    
    public static boolean checkusername(String username)        
        {
            
            
           return username.contains("_") && username.length()<=5;
           
           
        }
    
    
    

/*Title: Password validation regex pattern
      Author: OpenAI (Provided by chatGPT
      Date: `11 April 2024
      code cersion: 1
      availability: OpenAI
      
      */
   
    public static  boolean checkpasswordcomplexity(String password)
    {
                String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$";
//return password.length() >= 6 && password.matches(".*[a-z].*") && password.matches(".[A-Z]") && password.matches(".*[0-9].*") &&  password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
             return password.matches(regex);


}
    
}
