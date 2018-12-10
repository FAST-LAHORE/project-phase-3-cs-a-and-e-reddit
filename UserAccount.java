/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Shahzad
 */
public class UserAccount extends Account{
    public int user_id;

    public UserAccount(int user_id, String Username, String Password) {
        super(Username, Password);
        this.user_id = user_id;
    }
    
    public boolean deactivate(int user_id)
    {
        //if(isMarkedForDel == true)
   
        
        return true;
        
    }
}
