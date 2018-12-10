/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Shahzad
 */
public class AdminAccount extends Account {
   public int admin_int;

    public AdminAccount(int admin_int, String Username, String Password) {
        super(Username, Password);
        this.admin_int = admin_int;
    }
   
  
   
   public void /*return type Account*/ ban_account (String Email_id){}
   public void /*return type Account*/ delete_account (String Email_id){}
   public void /*return type POST*/ delete_post (/*Pass POST*/){}
   public void /*return type Account*/ view_account (String Email_id){}
   
   
}
