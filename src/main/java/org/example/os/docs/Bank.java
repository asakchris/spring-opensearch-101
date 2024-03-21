package org.example.os.docs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
  @Field(type = FieldType.Long, name = "card_number")
  private long cardNumber;

  @Field(type = FieldType.Keyword, name = "card_type")
  private String cardType;

  @Field(type = FieldType.Keyword, name = "currency")
  private String currency;
}
