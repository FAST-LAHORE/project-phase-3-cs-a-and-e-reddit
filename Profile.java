/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdimplmentation;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author del
 */
public class Profile {
        Comment comment;
	Message message;
	Post post;
	String first_name;
	String last_name;
	String date_of_birth;
	String Bio;
	int Followers;
	int Following;
	BufferedImage image;
	List<String> Following_list=new ArrayList<String>();
	List<String> Follower_list=new ArrayList<String>();
	
	Profile(String first_name, String last_name, String date_of_birth, String Bio, int Followers, int Following, BufferedImage image)
	{
		
		this.first_name=first_name;
		this.last_name = last_name;
		this.date_of_birth= date_of_birth;
		this.Bio=Bio;
		this.Followers=Followers;
		this.Following=Following;
		this.image=image;
		
	}

	public void follow_user(String account_id) 
	{
	
      Following++;
      Following_list.add(account_id);
		
		
		
    }
	
	public void delete_user(String account_id)
	{
		
		Followers--;
		Follower_list.remove(account_id);
		
		
	}
	
	public void unfollow_user(String account_id)
	{
		Following--;
		Following_list.remove(account_id);
		
	}
	
	public void report_post(Post post) {
		
		post.reportcount++;
		
	}
	
	
    
}
