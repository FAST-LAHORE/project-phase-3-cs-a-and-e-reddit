/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Shahzad
 */
abstract public class Registration {
    
    public String new_username;
    public String Password;
    public String Email_id;
    public boolean verify_Email(String Email_id)
    {
        return true;
    }
    
    public void Register(Account obj)
    {
        
    }
}
