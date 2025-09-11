package com.example.note;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.domain.Note;
import com.example.service.NoteService;
import com.opensymphony.xwork2.ActionSupport;

@Component
@Scope("prototype")
public class NoteListAction extends ActionSupport {
	private List<Note> notes;

	public List<Note> getNotes() {
		return notes;
	}
	
	@Autowired private NoteService noteService;

	@Override
	public String execute() {
		// hard-coded demo data for now
		notes = noteService.list();
		return SUCCESS;
	}
}
