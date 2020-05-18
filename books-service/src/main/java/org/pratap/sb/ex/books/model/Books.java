package org.pratap.sb.ex.books.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Books")
public class Books {

    @JsonProperty("bookId")
    private String bookId;

    @JsonProperty("bookName")
    private String bookName;

    @JsonProperty("bookAuthorId")
    private String bookAuthorId;

    @JsonProperty("bookPrice")
    private float bookPrice;

    @JsonProperty("bookPublishDate")
    private String bookPublishDate;

}
