package org.example.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.os.docs.Person;
import org.example.os.repos.PersonRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  private final PersonRepo repo;

  public Person save(Person person) {
    return repo.save(person);
  }

  public Person findById(int id) {
    return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  public List<Person> findByCardNo(Long cardNo) {
    return repo.findByCardNo(cardNo);
  }
}
