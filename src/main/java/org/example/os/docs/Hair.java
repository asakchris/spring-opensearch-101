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
public class Hair {
  @Field(type = FieldType.Text, name = "color")
  private String color;

  @Field(type = FieldType.Text, name = "type")
  private String type;
}
