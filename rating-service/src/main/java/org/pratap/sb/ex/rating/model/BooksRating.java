package org.pratap.sb.ex.rating.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "BooksRating")
public class BooksRating {

    @JsonProperty("bookId")
    private String bookId;

    @JsonProperty("bookRating")
    private int bookRating;

    
}
