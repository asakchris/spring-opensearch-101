package org.example.os.repos;

import java.util.List;
import org.example.os.docs.Person;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepo extends ElasticsearchRepository<Person, Integer> {
  @Query("""
  {
    
      "bool": {
        "must": [
          {
            "match": {
              "bank.card_number": ?00
            }
          }
        ]
      }
    
  }
  """)
  List<Person> findByCardNo(@Param("card_no") Long cardNo);
}
