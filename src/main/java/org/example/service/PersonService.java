package org.example.service;

import java.util.List;
import org.example.os.docs.Person;

public interface PersonService {
  Person save(Person person);
  Person findById(int id);
  List<Person> findByCardNo(Long cardNo);
}
