package org.example.os.docs;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "persons")
public class Person {
  @Id
  private Integer id;

  @Field(type = FieldType.Text, name = "first_name")
  private String firstName;

  @Field(type = FieldType.Text, name = "last_name")
  private String lastName;

  @Field(type = FieldType.Integer, name = "age")
  private int age;

  @Field(type = FieldType.Keyword, name = "gender")
  private String gender;

  @Field(type = FieldType.Keyword, name = "email")
  private String email;

  @Field(type = FieldType.Date, name = "birth_date")
  private String birthDate;

  @Field(type = FieldType.Keyword, name = "blood_group")
  private String bloodGroup;

  @Field(type = FieldType.Integer, name = "height")
  private int height;

  @Field(type = FieldType.Float, name = "weight")
  private float weight;

  @Field(type = FieldType.Keyword, name = "ssn")
  private String ssn;

  @Field(type = FieldType.Nested, name = "hair")
  private Hair hair;

  @Field(type = FieldType.Nested, name = "address")
  private Address address;

  @Field(type = FieldType.Nested, name = "bank")
  private List<Bank> bank;
}
