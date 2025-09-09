package com.example.note;

import com.opensymphony.xwork2.ActionSupport;

public class NoteFormAction extends ActionSupport {
	@Override
	public String execute() {
		return INPUT; // forwards to form.jsp
	}
}
