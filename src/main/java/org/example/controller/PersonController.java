package org.example.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.os.docs.Person;
import org.example.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
@Slf4j
@RequiredArgsConstructor
public class PersonController {
  private final PersonService service;

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public Person create(@Validated @RequestBody Person person) {
    return service.save(person);
  }

  @GetMapping("/{personId}")
  @ResponseStatus(code = HttpStatus.OK)
  public Person findById(@PathVariable Integer personId) {
    return service.findById(personId);
  }

  @GetMapping()
  @ResponseStatus(code = HttpStatus.OK)
  public List<Person> findByCardNo(@RequestParam("card_number") Long cardNo) {
    return service.findByCardNo(cardNo);
  }
}
