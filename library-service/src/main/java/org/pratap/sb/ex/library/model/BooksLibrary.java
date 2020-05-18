package org.pratap.sb.ex.library.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "BooksLibrary")
public class BooksLibrary {

    @JsonProperty("libId")
    private String libId;

    @JsonProperty("libName")
    private String libName;

    @JsonProperty("libBookId")
    private String libBookId;

    @JsonProperty("booksHolding")
    private int booksHolding;

    @JsonProperty("libRegisteredDate")
    private String libRegisteredDate;



}
