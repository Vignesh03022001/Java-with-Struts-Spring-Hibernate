package com.example.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NoteService {
  public List<String> listNotes() {
    // Temporary hardcoded data; DB comes next step.
    return Arrays.asList("First note (from Spring service)", "Another note");
  }

  public void add(String message) {
    // For now, no persistence—just pretend.
    System.out.println("Would save: " + message);
  }
}
