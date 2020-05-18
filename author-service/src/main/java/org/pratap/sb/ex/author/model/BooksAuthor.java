package org.pratap.sb.ex.author.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "BooksAuthor")
public class BooksAuthor {

    @JsonProperty("authorId")
    private String authorId;

    @JsonProperty("authorName")
    private String authorName;

    @JsonProperty("authorBookId")
    private String authorBookId;

}
