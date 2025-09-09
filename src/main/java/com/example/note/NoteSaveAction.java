package com.example.note;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.service.NoteService;
import com.opensymphony.xwork2.ActionSupport;

public class NoteSaveAction extends ActionSupport {
	private String message;
	  public void setMessage(String message) { this.message = message; }
	  
	  @Autowired private NoteService noteService;

	  @Override
	  public void validate() {
	    if (message == null || message.trim().isEmpty()) {
	      addFieldError("message", "Message is required");
	    }
	  }

	  @Override
	  public String execute() {
	    noteService.add(message);
	    addActionMessage("Saved: " + message);
	    return SUCCESS;
	  }
}
