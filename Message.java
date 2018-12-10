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
public class Message {
    String message_content;
	
	Message(String message){
		
		message_content=message;
		
	}
	
	public String get_message() {
		
		
		return message_content;
	}
	
	public void set_message(String message)
	{
		message_content=message;
		
	}
}
