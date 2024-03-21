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
public class Address {
  @Field(type = FieldType.Text, name = "street")
  private String street;

  @Field(type = FieldType.Text, name = "city")
  private String city;

  @Field(type = FieldType.Text, name = "zip")
  private String zip;

  @Field(type = FieldType.Text, name = "state")
  private String state;
}
