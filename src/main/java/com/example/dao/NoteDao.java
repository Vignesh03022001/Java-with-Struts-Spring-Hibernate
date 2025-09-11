package com.example.dao;

import com.example.domain.Note;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoteDao {
  @Autowired private SessionFactory sf;

  public List<Note> findAll() {
    return sf.getCurrentSession()
        .createQuery("from Note n order by n.id desc", Note.class)
        .list();
  }

  public void save(Note n) {
    sf.getCurrentSession().saveOrUpdate(n);
  }
}
