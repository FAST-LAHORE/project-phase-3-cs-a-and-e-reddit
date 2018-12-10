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
public class Comment {
    String comment_content;
	
	Comment(String comment){
		
		comment_content=comment;
		
	}
	
	public String get_comment() {
		
		return comment_content;
		
	}
	
	public void set_comment(String comment)
	{
		comment_content=comment;
		
	}
    
}
