package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name = "notes")
public class Note {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 300)
  private String message;

  // getters & setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }
}
