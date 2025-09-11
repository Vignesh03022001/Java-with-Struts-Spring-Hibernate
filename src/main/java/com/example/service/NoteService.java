package com.example.service;

import com.example.domain.Note;
import java.util.List;

public interface NoteService {
  List<Note> list();
  void add(String message);
}
