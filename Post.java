/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdimplmentation;

/**
 *
 * @author del
 */
public  class Post {
    String post_content;
    int reportcount;
    String description;
    int votes;
    String date;
    String time;
    Comment comment;
    category category;
	
	Post(String post){
		
		post_content=post;
		
	}
	
	public String get_post() {
		
		return post_content;
		
	}
	
	public void set_post(String post)
	{
		post_content=post;
		
	}
        public void post_content ( String description)
        {
            
        }
        public void delete_post()
        {
            
        }
        public int voteup()
        {
            votes++;
            return votes;
        }
        public int votedown()
        {
            votes--;
            return votes;
        }
    
        public void filter_post()
        {
            
        }
}
