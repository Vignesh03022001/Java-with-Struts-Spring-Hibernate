package com.example.service;

import com.example.dao.NoteDao;
import com.example.domain.Note;
import com.example.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

  @Autowired private NoteDao dao;

  @Override
  @Transactional(readOnly = true)
  public List<Note> list() {
    return dao.findAll();
  }

  @Override
  @Transactional
  public void add(String message) {
    if (message == null || message.trim().isEmpty())
      throw new IllegalArgumentException("Message is required");
    Note n = new Note();
    n.setMessage(message.trim());
    dao.save(n);
  }
}
